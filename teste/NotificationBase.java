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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}NotificationSpecificAttr"/>
 *       &lt;attGroup ref="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}NotificationDeviceAttr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationBase")
@XmlSeeAlso({
    DigitalInputNotification.class,
    ZoneObjectListNotification.class,
    ZoneStatisticsNotification.class,
    AlertInfoNotification.class,
    ImageSnapshotsNotification.class,
    NotificationWithOSDState.class,
    HistoricObjectListNotificationBase.class
})
public abstract class NotificationBase {

    @XmlAttribute(name = "task_type", required = true)
    protected TaskType taskType;
    @XmlAttribute(name = "notification_ID", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long notificationID;
    @XmlAttribute(name = "serverTask_ID", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long serverTaskID;
    @XmlAttribute(name = "callerType_ID", required = true)
    protected String callerTypeID;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "mac_address", required = true)
    protected String macAddress;
    @XmlAttribute(name = "customer_ID", required = true)
    protected String customerID;

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTaskType(TaskType value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the notificationID property.
     * 
     */
    public long getNotificationID() {
        return notificationID;
    }

    /**
     * Sets the value of the notificationID property.
     * 
     */
    public void setNotificationID(long value) {
        this.notificationID = value;
    }

    /**
     * Gets the value of the serverTaskID property.
     * 
     */
    public long getServerTaskID() {
        return serverTaskID;
    }

    /**
     * Sets the value of the serverTaskID property.
     * 
     */
    public void setServerTaskID(long value) {
        this.serverTaskID = value;
    }

    /**
     * Gets the value of the callerTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerTypeID() {
        return callerTypeID;
    }

    /**
     * Sets the value of the callerTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerTypeID(String value) {
        this.callerTypeID = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

}
