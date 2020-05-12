package controllers;

import alarma.*;
import com.google.gson.Gson;
import dao.CaraDAO;
import models.Cara;
import spark.Route;

import java.util.List;
import spark.Request;
import spark.Response;

public class CaraControlador {
    public static Route reconocimiento =
            (Request request, Response response ) -> {

                String json = request.body();
                Gson gson = new Gson();
                Cara cara = gson.fromJson(json,Cara.class);
                CaraDAO caraDAO = new CaraDAO();
                List<Cara> caras = caraDAO.getCara(cara);
                if(!caras.isEmpty()){
                    try { // Call Web Service Operation
                       Alerta service = new Alerta();
                        Alarma port = service.getAlarmaPort();
                        // TODO initialize WS operation arguments here
                        java.lang.String img = cara.getImage();
                        port.alertar(img);
                    } catch (Exception ex) {
                        // TODO handle custom exceptions here
                    }
                }
                return "200";
            };
}
