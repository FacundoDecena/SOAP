/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monitoreo.API;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author cnval
 */
public class CamarasClient {
    
    private static final Logger registraLog = LoggerFactory.getLogger(CamarasClient.class);
    
    public String imagenPrueba(int cantidad){
        String urlImagen=cantidad+".jpg";
        return urlImagen;
    }
    
    public String getImages(String lastImage) {
        final String urlString="http://localhost:4567/api/video?lastImage="+lastImage;
        String imagen="";

        try{
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            //System.out.println("Type: "+conn.getContentType());
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            String jsonString="";
            while ((output = br.readLine()) != null)
                { 
                    //System.out.println(output);
                    jsonString=jsonString.concat(output);
                }
            conn.disconnect();
            CamarasResponse res = new ObjectMapper().readValue(jsonString, CamarasResponse.class);
            imagen=res.getImage();
            //System.out.println("JSON: "+res.toString());
        }
        catch(MalformedURLException ex){
            registraLog.error("Error de URL en getImages con {} "+urlString,ex);
        } catch (ProtocolException ex) {
            registraLog.error("Error de protocolo en getImages con {} "+urlString,ex);
        } catch (IOException ex) {
            registraLog.error("Error al leer retorno en getImages con {} "+urlString, ex);
        } 
        
        registraLog.info("getImages RES {}", imagen); 
        
        
        return imagen;
    }
}
