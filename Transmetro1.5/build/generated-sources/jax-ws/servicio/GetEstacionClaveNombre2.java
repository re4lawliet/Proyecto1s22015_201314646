
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEstacionClaveNombre2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEstacionClaveNombre2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iteracion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEstacionClaveNombre2", propOrder = {
    "iteracion"
})
public class GetEstacionClaveNombre2 {

    protected int iteracion;

    /**
     * Obtiene el valor de la propiedad iteracion.
     * 
     */
    public int getIteracion() {
        return iteracion;
    }

    /**
     * Define el valor de la propiedad iteracion.
     * 
     */
    public void setIteracion(int value) {
        this.iteracion = value;
    }

}