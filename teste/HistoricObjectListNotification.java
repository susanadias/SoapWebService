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


/**
 * <p>Java class for HistoricObjectListNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricObjectListNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}HistoricObjectListNotificationBase">
 *       &lt;attribute name="lost_count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricObjectListNotification")
public class HistoricObjectListNotification
    extends HistoricObjectListNotificationBase
{

    @XmlAttribute(name = "lost_count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long lostCount;

    /**
     * Gets the value of the lostCount property.
     * 
     */
    public long getLostCount() {
        return lostCount;
    }

    /**
     * Sets the value of the lostCount property.
     * 
     */
    public void setLostCount(long value) {
        this.lostCount = value;
    }

}
