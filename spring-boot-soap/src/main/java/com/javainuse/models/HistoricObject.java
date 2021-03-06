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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HistoricObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Object">
 *       &lt;sequence>
 *         &lt;element name="exit" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Coordinate_3D"/>
 *       &lt;/sequence>
 *       &lt;attribute name="exit_time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricObject", propOrder = {
    "exit"
})
public class HistoricObject
    extends Object
{

    @XmlElement(required = true)
    protected Coordinate3D exit;
    @XmlAttribute(name = "exit_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exitTime;
    @XmlAttribute(name = "height", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long height;

    /**
     * Gets the value of the exit property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate3D }
     *     
     */
    public Coordinate3D getExit() {
        return exit;
    }

    /**
     * Sets the value of the exit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate3D }
     *     
     */
    public void setExit(Coordinate3D value) {
        this.exit = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitTime(XMLGregorianCalendar value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public long getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(long value) {
        this.height = value;
    }

}
