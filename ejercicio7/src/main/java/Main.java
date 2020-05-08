import controllers.CController;
import controllers.CalculadoraController;
import controllers.NCController;
import util.Path;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //get(Path.Web.getHOME(), NCController.toWords);
        get(Path.Web.getADD(), CalculadoraController.addition);
        get(Path.Web.getDIV(), CalculadoraController.division);
        get(Path.Web.getMUL(), CalculadoraController.multiplication);
        get(Path.Web.getSUB(), CalculadoraController.subtraction);
    }
}
