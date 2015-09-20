
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ruta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ruta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaEstaciones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListaNumeroDeEstaciones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListaNumeroDeEstaciones2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListaEstacionesClave" type="{http://Servicio/}nodoEstacionClave" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListaEstacionesGenerales" type="{http://Servicio/}nodoEstacionGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruta", propOrder = {
    "nombre",
    "listaEstaciones",
    "listaNumeroDeEstaciones",
    "listaNumeroDeEstaciones2",
    "listaEstacionesClave",
    "listaEstacionesGenerales",
    "id"
})
public class Ruta {

    protected String nombre;
    @XmlElement(name = "ListaEstaciones", nillable = true)
    protected List<String> listaEstaciones;
    @XmlElement(name = "ListaNumeroDeEstaciones", nillable = true)
    protected List<String> listaNumeroDeEstaciones;
    @XmlElement(name = "ListaNumeroDeEstaciones2", nillable = true)
    protected List<String> listaNumeroDeEstaciones2;
    @XmlElement(name = "ListaEstacionesClave", nillable = true)
    protected List<NodoEstacionClave> listaEstacionesClave;
    @XmlElement(name = "ListaEstacionesGenerales", nillable = true)
    protected List<NodoEstacionGeneral> listaEstacionesGenerales;
    protected int id;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the listaEstaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaEstaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaEstaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaEstaciones() {
        if (listaEstaciones == null) {
            listaEstaciones = new ArrayList<String>();
        }
        return this.listaEstaciones;
    }

    /**
     * Gets the value of the listaNumeroDeEstaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNumeroDeEstaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNumeroDeEstaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaNumeroDeEstaciones() {
        if (listaNumeroDeEstaciones == null) {
            listaNumeroDeEstaciones = new ArrayList<String>();
        }
        return this.listaNumeroDeEstaciones;
    }

    /**
     * Gets the value of the listaNumeroDeEstaciones2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNumeroDeEstaciones2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNumeroDeEstaciones2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaNumeroDeEstaciones2() {
        if (listaNumeroDeEstaciones2 == null) {
            listaNumeroDeEstaciones2 = new ArrayList<String>();
        }
        return this.listaNumeroDeEstaciones2;
    }

    /**
     * Gets the value of the listaEstacionesClave property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaEstacionesClave property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaEstacionesClave().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodoEstacionClave }
     * 
     * 
     */
    public List<NodoEstacionClave> getListaEstacionesClave() {
        if (listaEstacionesClave == null) {
            listaEstacionesClave = new ArrayList<NodoEstacionClave>();
        }
        return this.listaEstacionesClave;
    }

    /**
     * Gets the value of the listaEstacionesGenerales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaEstacionesGenerales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaEstacionesGenerales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodoEstacionGeneral }
     * 
     * 
     */
    public List<NodoEstacionGeneral> getListaEstacionesGenerales() {
        if (listaEstacionesGenerales == null) {
            listaEstacionesGenerales = new ArrayList<NodoEstacionGeneral>();
        }
        return this.listaEstacionesGenerales;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
