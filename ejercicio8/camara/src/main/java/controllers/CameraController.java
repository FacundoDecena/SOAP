package controllers;

import spark.Request;
import spark.Response;
import spark.Route;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CameraController {
    public static Route getVideo = (Request req, Response res) ->{
        String lastImg = req.queryParams("lastImage");
        String nextImg = getNextImage(lastImg);
        boolean hasFace = getHasFace(nextImg);
        String msg = "{\"image\":\""+nextImg+"\"}";
        if (hasFace)
            post("http://localhost:4568/reconocimiento", msg);
        return msg;
    };

    private static String  getNextImage(String prevImg){
        String[] s = prevImg.split("\\.");
        System.out.println(s[0]);
        int index = Integer.parseInt(s[0]);
        if(index == 20)
            index = 1;
        else
            index++;
        return String.valueOf(index) + ".jpg";
    }

    private static boolean getHasFace(String img){
        String[] s = img.split("\\.");
        int index = Integer.parseInt(s[0]);
        return index == 1 || index == 6 || index == 7 || index == 8 || index == 11 || index == 13 || index == 15 || index == 17 || index == 18 || index == 20;
    }

    private static void post(String uri, String img) throws Exception{
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);
        try(OutputStream os = connection.getOutputStream()){
            byte[] input = img.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        // No time for checking answers
    }
}
