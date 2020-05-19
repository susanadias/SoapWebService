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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZoneObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Coordinate_2D"/>
 *         &lt;element name="exit" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Coordinate_2D"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="objClass" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ObjectClassName" />
 *       &lt;attribute name="zone" use="required" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}MeasuringChannelName" />
 *       &lt;attribute name="dwell" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="exit_time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneObject", propOrder = {
    "entry",
    "exit"
})
public class ZoneObject {

    @XmlElement(required = true)
    protected Coordinate2D entry;
    @XmlElement(required = true)
    protected Coordinate2D exit;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute(name = "objClass")
    protected String objClass;
    @XmlAttribute(name = "zone", required = true)
    protected String zone;
    @XmlAttribute(name = "dwell", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long dwell;
    @XmlAttribute(name = "exit_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exitTime;
    @XmlAttribute(name = "height", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long height;

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate2D }
     *     
     */
    public Coordinate2D getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate2D }
     *     
     */
    public void setEntry(Coordinate2D value) {
        this.entry = value;
    }

    /**
     * Gets the value of the exit property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate2D }
     *     
     */
    public Coordinate2D getExit() {
        return exit;
    }

    /**
     * Sets the value of the exit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate2D }
     *     
     */
    public void setExit(Coordinate2D value) {
        this.exit = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the dwell property.
     * 
     */
    public long getDwell() {
        return dwell;
    }

    /**
     * Sets the value of the dwell property.
     * 
     */
    public void setDwell(long value) {
        this.dwell = value;
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
