package controllers;

import Calculator.Calculator;
import Calculator.CalculatorSoap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

import java.math.BigInteger;
import java.util.HashMap;

public class CController {
    public static Route calculate = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("suma",addition(6,9));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    private static int addition(int a, int b){
        CalculatorSoap soap = new Calculator().getCalculatorSoap();
        return soap.add(a,b);
    }
}
