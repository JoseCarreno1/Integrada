
package Paq_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Paq_WS package. 
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

    private final static QName _CalcularIvaResponse_QNAME = new QName("http://WS_RESULTADO/", "Calcular_IvaResponse");
    private final static QName _CalcularIva_QNAME = new QName("http://WS_RESULTADO/", "Calcular_Iva");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Paq_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularIvaResponse }
     * 
     */
    public CalcularIvaResponse createCalcularIvaResponse() {
        return new CalcularIvaResponse();
    }

    /**
     * Create an instance of {@link CalcularIva }
     * 
     */
    public CalcularIva createCalcularIva() {
        return new CalcularIva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_RESULTADO/", name = "Calcular_IvaResponse")
    public JAXBElement<CalcularIvaResponse> createCalcularIvaResponse(CalcularIvaResponse value) {
        return new JAXBElement<CalcularIvaResponse>(_CalcularIvaResponse_QNAME, CalcularIvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_RESULTADO/", name = "Calcular_Iva")
    public JAXBElement<CalcularIva> createCalcularIva(CalcularIva value) {
        return new JAXBElement<CalcularIva>(_CalcularIva_QNAME, CalcularIva.class, null, value);
    }

}
