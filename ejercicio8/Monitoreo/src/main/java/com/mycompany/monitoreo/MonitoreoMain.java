/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monitoreo;

import com.mycompany.monitoreo.Controllers.MonitoreoControlador;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFileLocation;
import util.Path;

/**
 *
 * @author cnval
 */
public class MonitoreoMain {
    public static void main (String[] args){
        port(4570);
        staticFileLocation("/images");
        get(Path.Web.PRINCIPAL, MonitoreoControlador.getImagenesCamara); 
        
        
        
    }
    
}
