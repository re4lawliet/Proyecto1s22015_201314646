
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExisteEstacionGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExisteEstacionGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExisteEstacionGeneral", propOrder = {
    "clave"
})
public class ExisteEstacionGeneral {

    protected int clave;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     */
    public int getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     */
    public void setClave(int value) {
        this.clave = value;
    }

}
