/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alarma;

import javax.xml.ws.Endpoint;

/**
 *
 * @author cnval
 */
public class AlarmaMain {
    public static void main(String[] args){
    Endpoint.publish("http://localhost:4569/servicioAlarma", new Alarma());
    }
}
