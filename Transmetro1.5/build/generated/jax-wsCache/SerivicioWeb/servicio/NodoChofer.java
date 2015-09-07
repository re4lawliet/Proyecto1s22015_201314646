
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nodoChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nodoChofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingreso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreChofer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApellidoChofer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoChofer", propOrder = {
    "ingreso",
    "nombreChofer",
    "apellidoChofer",
    "contrase\u00f1a"
})
public class NodoChofer {

    protected int ingreso;
    @XmlElement(name = "NombreChofer")
    protected String nombreChofer;
    @XmlElement(name = "ApellidoChofer")
    protected String apellidoChofer;
    @XmlElement(name = "Contrase\u00f1a")
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
     * Obtiene el valor de la propiedad nombreChofer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreChofer() {
        return nombreChofer;
    }

    /**
     * Define el valor de la propiedad nombreChofer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreChofer(String value) {
        this.nombreChofer = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoChofer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoChofer() {
        return apellidoChofer;
    }

    /**
     * Define el valor de la propiedad apellidoChofer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoChofer(String value) {
        this.apellidoChofer = value;
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
