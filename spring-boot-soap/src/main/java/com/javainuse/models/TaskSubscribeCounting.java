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
 * <p>Java class for TaskSubscribeCounting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskSubscribeCounting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeTriggeredSafe">
 *       &lt;sequence>
 *         &lt;element name="counting_gate_id" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}CountingGateID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSubscribeCounting", propOrder = {
    "countingGateId"
})
public class TaskSubscribeCounting
    extends TaskSubscribeTriggeredSafe
{

    @XmlElement(name = "counting_gate_id", required = true)
    protected CountingGateID countingGateId;

    /**
     * Gets the value of the countingGateId property.
     * 
     * @return
     *     possible object is
     *     {@link CountingGateID }
     *     
     */
    public CountingGateID getCountingGateId() {
        return countingGateId;
    }

    /**
     * Sets the value of the countingGateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountingGateID }
     *     
     */
    public void setCountingGateId(CountingGateID value) {
        this.countingGateId = value;
    }

}
