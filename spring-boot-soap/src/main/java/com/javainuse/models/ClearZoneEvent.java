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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearZoneEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearZoneEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="clear_zone_event_type" use="required" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ClearZoneEventType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearZoneEvent")
public class ClearZoneEvent {

    @XmlAttribute(name = "clear_zone_event_type", required = true)
    protected ClearZoneEventType clearZoneEventType;

    /**
     * Gets the value of the clearZoneEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ClearZoneEventType }
     *     
     */
    public ClearZoneEventType getClearZoneEventType() {
        return clearZoneEventType;
    }

    /**
     * Sets the value of the clearZoneEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearZoneEventType }
     *     
     */
    public void setClearZoneEventType(ClearZoneEventType value) {
        this.clearZoneEventType = value;
    }

}
