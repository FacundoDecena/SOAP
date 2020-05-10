package CalculadoraWSApplication;


import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="CalculadoraWS")
public class CalculadoraWS {
    
    @WebMethod(operationName="addition")
    @WebResult(name="result")
    public String addition(@WebParam(name="intA") int intA,@WebParam(name="intB") int intB) {
        int resultado = CController.addition(intA, intB);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        return res;
    }

    @WebMethod(operationName="division")
    @WebResult(name="result")
    public String division (@WebParam(name="intA") int intA, @WebParam(name="intB") int intB){
        int resultado = CController.division(intA, intB);
        String res = NCController.convert(BigInteger.valueOf(resultado));
       return res;
    }

    @WebMethod(operationName="multiplication")
    @WebResult(name="result")
    public String multiplication (@WebParam(name="intA") int intA, @WebParam(name="intB") int intB){
        int resultado = CController.multiply(intA, intB);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        return res;
    }
    
    @WebMethod(operationName="substraction")
    @WebResult(name="result")
    public String subtraction(@WebParam(name="intA") int intA, @WebParam(name="intB") int intB){
        int resultado = CController.subtraction(intA, intB);
        String res = NCController.convert(BigInteger.valueOf(resultado));
        return res;
    }
}
