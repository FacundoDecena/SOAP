package controllers;

import calculadora.CalculadoraWS;
import calculadora.CalculadoraWS_Service;
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
        model.put("intA", 0);
        model.put("intB", 0);
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route add = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", Path.Template.HOME);
        int a = Integer.parseInt(request.queryParams("intA"));
        int b = Integer.parseInt(request.queryParams("intB"));
        model.put("intA", a);
        model.put("intB", b);
        model.put("resultado", sumar(a,b));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    public static Route div = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", Path.Template.HOME);
        int a = Integer.parseInt(request.queryParams("intA"));
        int b = Integer.parseInt(request.queryParams("intB"));
        model.put("intA", a);
        model.put("intB", b);
        model.put("resultado", dividir(a,b));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };


    public static Route mul = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", Path.Template.HOME);
        int a = Integer.parseInt(request.queryParams("intA"));
        int b = Integer.parseInt(request.queryParams("intB"));
        model.put("intA", a);
        model.put("intB", b);
        model.put("resultado", multiplicar(a,b));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };


    public static Route sub = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", Path.Template.HOME);
        int a = Integer.parseInt(request.queryParams("intA"));
        int b = Integer.parseInt(request.queryParams("intB"));
        model.put("intA", a);
        model.put("intB", b);
        model.put("resultado", restar(a,b));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    private static String sumar (int a, int b){
        CalculadoraWS soap = new CalculadoraWS_Service().getCalculadoraWSPort();
        return soap.addition(a,b);
    }

    private static String dividir(int a, int b){
        CalculadoraWS soap = new CalculadoraWS_Service().getCalculadoraWSPort();
        return soap.division(a,b);
    }

    private static String restar (int a, int b){
        CalculadoraWS soap = new CalculadoraWS_Service().getCalculadoraWSPort();
        return soap.substraction(a,b);
    }

    private static String multiplicar(int a, int b){
        CalculadoraWS soap = new CalculadoraWS_Service().getCalculadoraWSPort();
        return soap.multiplication(a,b);
    }

}
