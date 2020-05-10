import controllers.Controller;
import util.Path;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get(Path.Web.getHOME(), Controller.home);
        get(Path.Web.getADD(), Controller.add);
        get(Path.Web.getSUB(), Controller.sub);
        get(Path.Web.getMUL(), Controller.mul);
        get(Path.Web.getDIV(), Controller.div);
    }
}
