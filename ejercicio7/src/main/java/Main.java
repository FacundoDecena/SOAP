import controllers.NCController;
import util.Path;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get(Path.Web.getHOME(), NCController.toWords);
    }
}
