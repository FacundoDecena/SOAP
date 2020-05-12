/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alarma;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author cnval
 */
@WebService(serviceName="Alerta")
public class Alarma {

    @WebMethod(operationName="alertar")
    @Oneway()
    public void alertar(@WebParam(name="img") String img){
        System.out.println("Alarma Activada, persona sospechosa: "+img);
        
    }
}
