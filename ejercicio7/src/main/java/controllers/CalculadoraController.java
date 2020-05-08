package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

import java.util.HashMap;

public class CalculadoraController {
    public static Route home = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route addition = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int sumandoA = Integer.parseInt(request.queryParams("sumandoA"));
        int sumandoB = Integer.parseInt(request.queryParams("sumandoB"));
        model.put("resultado", CController.addition(sumandoA, sumandoB));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route division = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int dividendo = Integer.parseInt(request.queryParams("dividendo"));
        int divisor = Integer.parseInt(request.queryParams("divisor"));
        model.put("resultado", CController.addition(dividendo, divisor));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route multiplication = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int multiplicando = Integer.parseInt(request.queryParams("multiplicando"));
        int multiplicador = Integer.parseInt(request.queryParams("multiplicador"));
        model.put("resultado", CController.addition(multiplicando, multiplicador));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route subtraction = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int minuendo = Integer.parseInt(request.queryParams("minuendo"));
        int sustraendo = Integer.parseInt(request.queryParams("sustraendo"));
        model.put("resultado", CController.addition(minuendo, sustraendo));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };
}
