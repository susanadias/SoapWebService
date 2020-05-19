//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 10:08:23 PM BST 
//


package teste;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricObjectListNotificationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricObjectListNotificationBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}NotificationBase">
 *       &lt;choice>
 *         &lt;element name="obj" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}HistoricObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="binary_data" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}BinaryData"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricObjectListNotificationBase", propOrder = {
    "obj",
    "binaryData"
})
@XmlSeeAlso({
    HistoricObjectListNotification.class
})
public class HistoricObjectListNotificationBase
    extends NotificationBase
{

    protected List<HistoricObject> obj;
    @XmlElement(name = "binary_data")
    protected BinaryData binaryData;

    /**
     * Gets the value of the obj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricObject }
     * 
     * 
     */
    public List<HistoricObject> getObj() {
        if (obj == null) {
            obj = new ArrayList<HistoricObject>();
        }
        return this.obj;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     */
    public void setBinaryData(BinaryData value) {
        this.binaryData = value;
    }

}