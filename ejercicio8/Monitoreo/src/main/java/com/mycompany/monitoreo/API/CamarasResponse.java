/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monitoreo.API;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author cnval
 */
public class CamarasResponse {
    @JsonProperty("image")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CamarasResponse{" + "image=" + image + '}';
    }
    
    
}
