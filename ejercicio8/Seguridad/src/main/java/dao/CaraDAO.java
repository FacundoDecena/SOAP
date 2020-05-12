package dao;

import models.Cara;
import org.sql2o.Connection;
import utils.Sql2oConnection;

import java.util.List;

public class CaraDAO {

    public List<Cara> getCara(Cara cara) {
        String consultaSQL = "SELECT * FROM CARA WHERE IMAGE = :image";
        List<Cara> caras = null;
        try(Connection conn = Sql2oConnection.getSql2o().open()){
            caras =
                    conn.
                    createQuery(consultaSQL).
                    addParameter("image",cara.getImage()).
                    executeAndFetch(Cara.class);
        } catch (Exception e){e.printStackTrace();}
        return caras;
    }

}
