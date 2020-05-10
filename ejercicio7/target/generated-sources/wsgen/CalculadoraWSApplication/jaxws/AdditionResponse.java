
package CalculadoraWSApplication.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "additionResponse", namespace = "http://CalculadoraWSApplication/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionResponse", namespace = "http://CalculadoraWSApplication/")
public class AdditionResponse {

    @XmlElement(name = "result", namespace = "")
    private String result;

    /**
     * 
     * @return
     *     returns String
     */
    public String getResult() {
        return this.result;
    }

    /**
     * 
     * @param result
     *     the value for the result property
     */
    public void setResult(String result) {
        this.result = result;
    }

}
