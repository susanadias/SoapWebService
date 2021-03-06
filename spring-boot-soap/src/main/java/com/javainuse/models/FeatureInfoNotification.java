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
 * <p>Java class for FeatureInfoNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureInfoNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ExtendedNotificationBase">
 *       &lt;sequence>
 *         &lt;element name="active_count_channels" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}CountChannelsFeatureInfo"/>
 *         &lt;element name="active_zone_channels" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ZoneChannelsFeatureInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureInfoNotification", propOrder = {
    "activeCountChannels",
    "activeZoneChannels"
})
public class FeatureInfoNotification
    extends ExtendedNotificationBase
{

    @XmlElement(name = "active_count_channels", required = true)
    protected CountChannelsFeatureInfo activeCountChannels;
    @XmlElement(name = "active_zone_channels")
    protected ZoneChannelsFeatureInfo activeZoneChannels;

    /**
     * Gets the value of the activeCountChannels property.
     * 
     * @return
     *     possible object is
     *     {@link CountChannelsFeatureInfo }
     *     
     */
    public CountChannelsFeatureInfo getActiveCountChannels() {
        return activeCountChannels;
    }

    /**
     * Sets the value of the activeCountChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountChannelsFeatureInfo }
     *     
     */
    public void setActiveCountChannels(CountChannelsFeatureInfo value) {
        this.activeCountChannels = value;
    }

    /**
     * Gets the value of the activeZoneChannels property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneChannelsFeatureInfo }
     *     
     */
    public ZoneChannelsFeatureInfo getActiveZoneChannels() {
        return activeZoneChannels;
    }

    /**
     * Sets the value of the activeZoneChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneChannelsFeatureInfo }
     *     
     */
    public void setActiveZoneChannels(ZoneChannelsFeatureInfo value) {
        this.activeZoneChannels = value;
    }

}
