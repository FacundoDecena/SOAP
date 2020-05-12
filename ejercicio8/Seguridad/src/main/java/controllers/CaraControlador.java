package controllers;

import com.google.gson.Gson;
import dao.CaraDAO;
import models.Cara;
import spark.Route;

import java.util.List;

public class CaraControlador {
    public static Route reconocimiento =
            (request, response) -> {

                String json = request.queryParams("image");
                Gson gson = new Gson();
                Cara cara = gson.fromJson(json,Cara.class);
                CaraDAO caraDAO = new CaraDAO();
                List<Cara> caras = caraDAO.getCara(cara);

                if(!caras.isEmpty()){
                    //Llamar servicio alerta
                    System.out.println("Envio alerta");
                }
                return "200";
            };
}
