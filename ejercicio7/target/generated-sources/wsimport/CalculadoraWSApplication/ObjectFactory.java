
package CalculadoraWSApplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the CalculadoraWSApplication package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplicationResponse_QNAME = new QName("http://CalculadoraWSApplication/", "multiplicationResponse");
    private final static QName _Addition_QNAME = new QName("http://CalculadoraWSApplication/", "addition");
    private final static QName _Multiplication_QNAME = new QName("http://CalculadoraWSApplication/", "multiplication");
    private final static QName _Substraction_QNAME = new QName("http://CalculadoraWSApplication/", "substraction");
    private final static QName _AdditionResponse_QNAME = new QName("http://CalculadoraWSApplication/", "additionResponse");
    private final static QName _SubstractionResponse_QNAME = new QName("http://CalculadoraWSApplication/", "substractionResponse");
    private final static QName _Division_QNAME = new QName("http://CalculadoraWSApplication/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://CalculadoraWSApplication/", "divisionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: CalculadoraWSApplication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link SubstractionResponse }
     * 
     */
    public SubstractionResponse createSubstractionResponse() {
        return new SubstractionResponse();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link Substraction }
     * 
     */
    public Substraction createSubstraction() {
        return new Substraction();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<MultiplicationResponse>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<Multiplication>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "substraction")
    public JAXBElement<Substraction> createSubstraction(Substraction value) {
        return new JAXBElement<Substraction>(_Substraction_QNAME, Substraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "substractionResponse")
    public JAXBElement<SubstractionResponse> createSubstractionResponse(SubstractionResponse value) {
        return new JAXBElement<SubstractionResponse>(_SubstractionResponse_QNAME, SubstractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalculadoraWSApplication/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

}
