/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monitoreo.Controlador;

import com.mycompany.monitoreo.API.CamarasClient;
import java.util.HashMap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

/**
 *
 * @author cnval
 */
public class MonitoreoControlador {
    private static int contador=0;
    
    public static Route getImagenesCamara = (Request req, Response response) -> {
        HashMap model = new HashMap();
        CamarasClient c=new CamarasClient();
        contador = (contador%20)+1;
        model.put("camara", c);
	if (contador==1)
	        model.put("lastImage","0.jpg");
        else
		model.put("lastImage", contador+".jpg");
        model.put("template", Path.Template.CAMARAS);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT)); 
   
    };
}
