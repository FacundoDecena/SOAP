package controllers;

import numberConversion.NumberConversion;
import numberConversion.NumberConversionSoapType;
import numberConversion.NumberToWords;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;
import util.Path;

import java.math.BigInteger;
import java.util.HashMap;

public class NCController {
    public static Route toWords = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("response", convert(BigInteger.valueOf(8)));
        return new VelocityTemplateEngine().render(new ModelAndView(model, Path.Template.LAYOUT));
    };

    private static String convert(BigInteger number){
        NumberToWords req = new NumberToWords();
        req.setUbiNum(number);
        return new NumberConversion().getNumberConversionSoap().numberToWords(req.getUbiNum());
    }
}
