package models;

import lombok.Data;

@Data
public class Cara {

    private String image;

    public Cara(String image) {
        this.image = image;
    }

}
