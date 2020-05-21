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
 * <p>Java class for ZoneStatisticsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatisticsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="zone_name" use="required" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}MeasuringChannelName" />
 *       &lt;attribute name="objClass" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ObjectClassName" />
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="max_fill_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxDwell" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="meanDwell" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatisticsData")
public class ZoneStatisticsData {

    @XmlAttribute(name = "zone_name", required = true)
    protected String zoneName;
    @XmlAttribute(name = "objClass")
    protected String objClass;
    @XmlAttribute(name = "count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long count;
    @XmlAttribute(name = "max_fill_level", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long maxFillLevel;
    @XmlAttribute(name = "maxDwell", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long maxDwell;
    @XmlAttribute(name = "meanDwell", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long meanDwell;

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
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the maxFillLevel property.
     * 
     */
    public long getMaxFillLevel() {
        return maxFillLevel;
    }

    /**
     * Sets the value of the maxFillLevel property.
     * 
     */
    public void setMaxFillLevel(long value) {
        this.maxFillLevel = value;
    }

    /**
     * Gets the value of the maxDwell property.
     * 
     */
    public long getMaxDwell() {
        return maxDwell;
    }

    /**
     * Sets the value of the maxDwell property.
     * 
     */
    public void setMaxDwell(long value) {
        this.maxDwell = value;
    }

    /**
     * Gets the value of the meanDwell property.
     * 
     */
    public long getMeanDwell() {
        return meanDwell;
    }

    /**
     * Sets the value of the meanDwell property.
     * 
     */
    public void setMeanDwell(long value) {
        this.meanDwell = value;
    }

}
