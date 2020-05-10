package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

import java.util.HashMap;

public class Controller {

    public static Route home = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", Path.Template.HOME);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };


}
