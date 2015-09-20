
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaDeBusesEnUnDia" type="{http://Servicio/}asignaciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dia", propOrder = {
    "listaDeBusesEnUnDia"
})
public class Dia {

    @XmlElement(name = "ListaDeBusesEnUnDia", nillable = true)
    protected List<Asignaciones> listaDeBusesEnUnDia;

    /**
     * Gets the value of the listaDeBusesEnUnDia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDeBusesEnUnDia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDeBusesEnUnDia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asignaciones }
     * 
     * 
     */
    public List<Asignaciones> getListaDeBusesEnUnDia() {
        if (listaDeBusesEnUnDia == null) {
            listaDeBusesEnUnDia = new ArrayList<Asignaciones>();
        }
        return this.listaDeBusesEnUnDia;
    }

}
