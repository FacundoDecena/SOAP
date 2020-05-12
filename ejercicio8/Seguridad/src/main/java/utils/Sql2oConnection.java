package utils;

import org.sql2o.Sql2o;

public class Sql2oConnection{

    private static Sql2o sql2o;

    public static Sql2o getSql2o(){
        String path = "db/accesoRestringido.db";
        if(sql2o == null){
            sql2o = new Sql2o("jdbc:sqlite::resource:"+path,null,null);
        }
        return sql2o;
    }
}
