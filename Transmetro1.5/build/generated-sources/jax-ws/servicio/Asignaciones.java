
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjetoBus" type="{http://Servicio/}nodoBuses" minOccurs="0"/>
 *         &lt;element name="ObjetoRuta" type="{http://Servicio/}ruta" minOccurs="0"/>
 *         &lt;element name="NombreBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreRuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreChofer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdBus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdChofer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignaciones", propOrder = {
    "objetoBus",
    "objetoRuta",
    "nombreBus",
    "nombreRuta",
    "nombreChofer",
    "idBus",
    "idChofer"
})
public class Asignaciones {

    @XmlElement(name = "ObjetoBus")
    protected NodoBuses objetoBus;
    @XmlElement(name = "ObjetoRuta")
    protected Ruta objetoRuta;
    @XmlElement(name = "NombreBus")
    protected String nombreBus;
    @XmlElement(name = "NombreRuta")
    protected String nombreRuta;
    @XmlElement(name = "NombreChofer")
    protected String nombreChofer;
    @XmlElement(name = "IdBus")
    protected int idBus;
    @XmlElement(name = "IdChofer")
    protected int idChofer;

    /**
     * Obtiene el valor de la propiedad objetoBus.
     * 
     * @return
     *     possible object is
     *     {@link NodoBuses }
     *     
     */
    public NodoBuses getObjetoBus() {
        return objetoBus;
    }

    /**
     * Define el valor de la propiedad objetoBus.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoBuses }
     *     
     */
    public void setObjetoBus(NodoBuses value) {
        this.objetoBus = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoRuta.
     * 
     * @return
     *     possible object is
     *     {@link Ruta }
     *     
     */
    public Ruta getObjetoRuta() {
        return objetoRuta;
    }

    /**
     * Define el valor de la propiedad objetoRuta.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruta }
     *     
     */
    public void setObjetoRuta(Ruta value) {
        this.objetoRuta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBus() {
        return nombreBus;
    }

    /**
     * Define el valor de la propiedad nombreBus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBus(String value) {
        this.nombreBus = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRuta() {
        return nombreRuta;
    }

    /**
     * Define el valor de la propiedad nombreRuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRuta(String value) {
        this.nombreRuta = value;
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
     * Obtiene el valor de la propiedad idBus.
     * 
     */
    public int getIdBus() {
        return idBus;
    }

    /**
     * Define el valor de la propiedad idBus.
     * 
     */
    public void setIdBus(int value) {
        this.idBus = value;
    }

    /**
     * Obtiene el valor de la propiedad idChofer.
     * 
     */
    public int getIdChofer() {
        return idChofer;
    }

    /**
     * Define el valor de la propiedad idChofer.
     * 
     */
    public void setIdChofer(int value) {
        this.idChofer = value;
    }

}
