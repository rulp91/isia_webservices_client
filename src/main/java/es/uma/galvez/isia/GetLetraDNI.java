
package es.uma.galvez.isia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getLetraDNI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getLetraDNI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLetraDNI", propOrder = {
    "dni"
})
public class GetLetraDNI {

    protected int dni;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     */
    public int getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     */
    public void setDni(int value) {
        this.dni = value;
    }

}
