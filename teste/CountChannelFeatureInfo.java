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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountChannelFeatureInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountChannelFeatureInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}MeasuringChannelName" />
 *       &lt;attribute name="objClass" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ObjectClassName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountChannelFeatureInfo")
public class CountChannelFeatureInfo {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "objClass")
    protected String objClass;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the objClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjClass() {
        return objClass;
    }

    /**
     * Sets the value of the objClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjClass(String value) {
        this.objClass = value;
    }

}
