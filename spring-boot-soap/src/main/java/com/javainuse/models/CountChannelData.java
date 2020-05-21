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
 * <p>Java class for CountChannelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountChannelData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}CountResultAttr"/>
 *       &lt;attribute name="channel_name" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}MeasuringChannelName" />
 *       &lt;attribute name="objClass" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ObjectClassName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountChannelData")
public class CountChannelData {

    @XmlAttribute(name = "channel_name")
    protected String channelName;
    @XmlAttribute(name = "objClass")
    protected String objClass;
    @XmlAttribute(name = "count_in", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long countIn;
    @XmlAttribute(name = "count_out", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long countOut;

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
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
     * Gets the value of the countIn property.
     * 
     */
    public long getCountIn() {
        return countIn;
    }

    /**
     * Sets the value of the countIn property.
     * 
     */
    public void setCountIn(long value) {
        this.countIn = value;
    }

    /**
     * Gets the value of the countOut property.
     * 
     */
    public long getCountOut() {
        return countOut;
    }

    /**
     * Sets the value of the countOut property.
     * 
     */
    public void setCountOut(long value) {
        this.countOut = value;
    }

}