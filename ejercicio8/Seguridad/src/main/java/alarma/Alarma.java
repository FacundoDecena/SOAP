
package alarma;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Alarma", targetNamespace = "http://alarma.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Alarma {


    /**
     * 
     * @param img
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "alertar", targetNamespace = "http://alarma.mycompany.com/", className = "alarma.Alertar")
    @Action(input = "http://alarma.mycompany.com/Alarma/alertar")
    public void alertar(
        @WebParam(name = "img", targetNamespace = "")
        String img);

}