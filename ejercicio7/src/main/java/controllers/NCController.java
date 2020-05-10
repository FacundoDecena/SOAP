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

    public static String convert(BigInteger number){
        NumberToWords req = new NumberToWords();
        req.setUbiNum(number);
        return new NumberConversion().getNumberConversionSoap().numberToWords(req.getUbiNum());
    }
}
