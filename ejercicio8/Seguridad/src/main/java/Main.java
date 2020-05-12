import controllers.CaraControlador;
import utils.Path;

import static spark.Spark.port;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args){
        port(4568);
        post(Path.Web.RECONOCIMIENTO, CaraControlador.reconocimiento);
    }

}
