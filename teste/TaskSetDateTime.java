//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 10:08:23 PM BST 
//


package teste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaskSetDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskSetDateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Task">
 *       &lt;attribute name="time_to_set" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSetDateTime")
public class TaskSetDateTime
    extends Task
{

    @XmlAttribute(name = "time_to_set", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeToSet;

    /**
     * Gets the value of the timeToSet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeToSet() {
        return timeToSet;
    }

    /**
     * Sets the value of the timeToSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeToSet(XMLGregorianCalendar value) {
        this.timeToSet = value;
    }

}