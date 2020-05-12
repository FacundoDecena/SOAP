import controllers.CameraController;
import util.Path;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get(Path.Web.getVIDEO(), CameraController.getVideo);
    }
}
