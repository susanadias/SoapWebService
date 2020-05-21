//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 11:12:34 PM BST 
//


package com.javainuse.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="zone_name" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}MeasuringChannelName" />
 *       &lt;attribute name="objClass" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ObjectClassName" />
 *       &lt;attribute name="fill_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxDwell" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="meanDwell" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneData")
public class ZoneData {

    @XmlAttribute(name = "zone_name")
    protected String zoneName;
    @XmlAttribute(name = "objClass")
    protected String objClass;
    @XmlAttribute(name = "fill_level", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long fillLevel;
    @XmlAttribute(name = "maxDwell")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxDwell;
    @XmlAttribute(name = "meanDwell")
    @XmlSchemaType(name = "unsignedInt")
    protected Long meanDwell;

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
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

    /**
     * Gets the value of the fillLevel property.
     * 
     */
    public long getFillLevel() {
        return fillLevel;
    }

    /**
     * Sets the value of the fillLevel property.
     * 
     */
    public void setFillLevel(long value) {
        this.fillLevel = value;
    }

    /**
     * Gets the value of the maxDwell property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDwell() {
        return maxDwell;
    }

    /**
     * Sets the value of the maxDwell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDwell(Long value) {
        this.maxDwell = value;
    }

    /**
     * Gets the value of the meanDwell property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeanDwell() {
        return meanDwell;
    }

    /**
     * Sets the value of the meanDwell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeanDwell(Long value) {
        this.meanDwell = value;
    }

}