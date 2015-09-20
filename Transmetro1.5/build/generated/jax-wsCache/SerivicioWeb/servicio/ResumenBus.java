
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResumenBus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResumenBus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResumenBus", propOrder = {
    "nombre"
})
public class ResumenBus {

    protected int nombre;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     */
    public void setNombre(int value) {
        this.nombre = value;
    }

}
