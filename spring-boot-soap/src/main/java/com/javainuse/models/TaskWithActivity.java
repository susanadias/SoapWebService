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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskWithActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskWithActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}Task">
 *       &lt;attribute name="activity_state" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="store_task" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskWithActivity")
@XmlSeeAlso({
    TaskSubscribeTriggered.class
})
public abstract class TaskWithActivity
    extends Task
{

    @XmlAttribute(name = "activity_state", required = true)
    protected boolean activityState;
    @XmlAttribute(name = "store_task")
    protected Boolean storeTask;

    /**
     * Gets the value of the activityState property.
     * 
     */
    public boolean isActivityState() {
        return activityState;
    }

    /**
     * Sets the value of the activityState property.
     * 
     */
    public void setActivityState(boolean value) {
        this.activityState = value;
    }

    /**
     * Gets the value of the storeTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreTask() {
        return storeTask;
    }

    /**
     * Sets the value of the storeTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreTask(Boolean value) {
        this.storeTask = value;
    }

}
