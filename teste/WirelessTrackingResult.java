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
 * <p>Java class for WirelessTrackingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WirelessTrackingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mac_address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wireless_type" use="required" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}WirelessType" />
 *       &lt;attribute name="signal_strength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WirelessTrackingResult")
public class WirelessTrackingResult {

    @XmlAttribute(name = "mac_address", required = true)
    protected String macAddress;
    @XmlAttribute(name = "wireless_type", required = true)
    protected WirelessType wirelessType;
    @XmlAttribute(name = "signal_strength", required = true)
    protected int signalStrength;

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the wirelessType property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessType }
     *     
     */
    public WirelessType getWirelessType() {
        return wirelessType;
    }

    /**
     * Sets the value of the wirelessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessType }
     *     
     */
    public void setWirelessType(WirelessType value) {
        this.wirelessType = value;
    }

    /**
     * Gets the value of the signalStrength property.
     * 
     */
    public int getSignalStrength() {
        return signalStrength;
    }

    /**
     * Sets the value of the signalStrength property.
     * 
     */
    public void setSignalStrength(int value) {
        this.signalStrength = value;
    }

}
