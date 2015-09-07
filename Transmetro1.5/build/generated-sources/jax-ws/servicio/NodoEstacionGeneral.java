
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nodoEstacionGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nodoEstacionGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingreso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoEstacionGeneral", propOrder = {
    "ingreso",
    "nombreEstacion",
    "contrase\u00f1a"
})
public class NodoEstacionGeneral {

    protected int ingreso;
    @XmlElement(name = "NombreEstacion")
    protected String nombreEstacion;
    protected String contraseña;

    /**
     * Obtiene el valor de la propiedad ingreso.
     * 
     */
    public int getIngreso() {
        return ingreso;
    }

    /**
     * Define el valor de la propiedad ingreso.
     * 
     */
    public void setIngreso(int value) {
        this.ingreso = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    /**
     * Define el valor de la propiedad nombreEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstacion(String value) {
        this.nombreEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

}
