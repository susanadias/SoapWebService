//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 11:12:34 PM BST 
//


package com.javainuse.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Object">
 *       &lt;sequence>
 *         &lt;element name="pos" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Coordinate_3D"/>
 *         &lt;element name="mov" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Coordinate_2D"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentObject", propOrder = {
    "pos",
    "mov"
})
public class CurrentObject
    extends Object
{

    @XmlElement(required = true)
    protected Coordinate3D pos;
    @XmlElement(required = true)
    protected Coordinate2D mov;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate3D }
     *     
     */
    public Coordinate3D getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate3D }
     *     
     */
    public void setPos(Coordinate3D value) {
        this.pos = value;
    }

    /**
     * Gets the value of the mov property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate2D }
     *     
     */
    public Coordinate2D getMov() {
        return mov;
    }

    /**
     * Sets the value of the mov property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate2D }
     *     
     */
    public void setMov(Coordinate2D value) {
        this.mov = value;
    }

}