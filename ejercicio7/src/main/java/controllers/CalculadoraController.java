package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

import java.math.BigInteger;
import java.util.HashMap;

public class CalculadoraController {
    public static Route home = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route addition = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int sumandoA = Integer.parseInt(request.queryParams("intA"));
        int sumandoB = Integer.parseInt(request.queryParams("intB"));
        int resultado = CController.addition(sumandoA, sumandoB);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        model.put("resultado", res);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route division = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int dividendo = Integer.parseInt(request.queryParams("intA"));
        int divisor = Integer.parseInt(request.queryParams("intB"));
        int resultado = CController.division(dividendo, divisor);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        model.put("resultado", res);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route multiplication = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int multiplicando = Integer.parseInt(request.queryParams("intA"));
        int multiplicador = Integer.parseInt(request.queryParams("intB"));
        int resultado = CController.multiply(multiplicando, multiplicador);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        model.put("resultado", res);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route subtraction = (Request request, Response response) ->{
        HashMap<String, Object> model = new HashMap<>();
        int minuendo = Integer.parseInt(request.queryParams("intA"));
        int sustraendo = Integer.parseInt(request.queryParams("intB"));
        int resultado = CController.subtraction(minuendo, sustraendo);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        model.put("resultado", res);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };
}
