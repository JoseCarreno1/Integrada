
package Paq_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Calcular_Iva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Calcular_Iva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor_producto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="iva_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calcular_Iva", propOrder = {
    "valorProducto",
    "ivaProducto"
})
public class CalcularIva {

    @XmlElement(name = "valor_producto")
    protected double valorProducto;
    @XmlElement(name = "iva_producto")
    protected int ivaProducto;

    /**
     * Obtiene el valor de la propiedad valorProducto.
     * 
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Define el valor de la propiedad valorProducto.
     * 
     */
    public void setValorProducto(double value) {
        this.valorProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaProducto.
     * 
     */
    public int getIvaProducto() {
        return ivaProducto;
    }

    /**
     * Define el valor de la propiedad ivaProducto.
     * 
     */
    public void setIvaProducto(int value) {
        this.ivaProducto = value;
    }

}
