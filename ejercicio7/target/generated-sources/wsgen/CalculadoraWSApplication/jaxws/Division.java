
package CalculadoraWSApplication.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "division", namespace = "http://CalculadoraWSApplication/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "division", namespace = "http://CalculadoraWSApplication/", propOrder = {
    "intA",
    "intB"
})
public class Division {

    @XmlElement(name = "intA", namespace = "")
    private int intA;
    @XmlElement(name = "intB", namespace = "")
    private int intB;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIntA() {
        return this.intA;
    }

    /**
     * 
     * @param intA
     *     the value for the intA property
     */
    public void setIntA(int intA) {
        this.intA = intA;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getIntB() {
        return this.intB;
    }

    /**
     * 
     * @param intB
     *     the value for the intB property
     */
    public void setIntB(int intB) {
        this.intB = intB;
    }

}
