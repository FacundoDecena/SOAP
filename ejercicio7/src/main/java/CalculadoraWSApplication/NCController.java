package CalculadoraWSApplication;

import numberConversion.NumberConversion;
import numberConversion.NumberToWords;

import java.math.BigInteger;

public class NCController {

    public static String convert(BigInteger number){
        NumberToWords req = new NumberToWords();
        req.setUbiNum(number);
        return new NumberConversion().getNumberConversionSoap().numberToWords(req.getUbiNum());
    }
}
