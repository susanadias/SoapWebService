//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 11:12:34 PM BST 
//


package com.javainuse.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="task_request_update" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskRequestUpdate"/>
 *         &lt;element name="task_set_digital_output" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSetDigitalOutput"/>
 *         &lt;element name="task_set_date_time" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSetDateTime"/>
 *         &lt;element name="task_subscribe_counting" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeCounting"/>
 *         &lt;element name="task_subscribe_fill" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeFill"/>
 *         &lt;element name="task_subscribe_digital_input" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeDigitalInput"/>
 *         &lt;element name="task_subscribe_alive" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeAlive"/>
 *         &lt;element name="task_subscribe_objlist" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeObjectList"/>
 *         &lt;element name="task_subscribe_clear_zone" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeClearZone"/>
 *         &lt;element name="task_subscribe_count_channels" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeCountChannels"/>
 *         &lt;element name="task_subscribe_zone_channels" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeZoneChannels"/>
 *         &lt;element name="task_subscribe_features_info" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeFeaturesInfo"/>
 *         &lt;element name="task_delete_all_tasks" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskDeleteAllTasks"/>
 *         &lt;element name="task_delete_all_notifications" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskDeleteAllNotifications"/>
 *         &lt;element name="task_subscribe_wireless_tracking" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeWirelessTracking"/>
 *         &lt;element name="task_subscribe_image_snapshots" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeImageSnapshots"/>
 *         &lt;element name="task_subscribe_zone_statistics" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeZoneStatistics"/>
 *         &lt;element name="task_subscribe_zone_object_list" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeZoneObjectList"/>
 *         &lt;element name="task_subscribe_alert_info" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSubscribeAlertInfo"/>
 *         &lt;element name="task_set_video_recording" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}TaskSetVideoRecording"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskContainer", propOrder = {
    "taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime"
})
@XmlSeeAlso({
    AnswerContainer.class
})
public class TaskContainer {

    @XmlElements({
        @XmlElement(name = "task_request_update", type = TaskRequestUpdate.class),
        @XmlElement(name = "task_set_digital_output", type = TaskSetDigitalOutput.class),
        @XmlElement(name = "task_set_date_time", type = TaskSetDateTime.class),
        @XmlElement(name = "task_subscribe_counting", type = TaskSubscribeCounting.class),
        @XmlElement(name = "task_subscribe_fill", type = TaskSubscribeFill.class),
        @XmlElement(name = "task_subscribe_digital_input", type = TaskSubscribeDigitalInput.class),
        @XmlElement(name = "task_subscribe_alive", type = TaskSubscribeAlive.class),
        @XmlElement(name = "task_subscribe_objlist", type = TaskSubscribeObjectList.class),
        @XmlElement(name = "task_subscribe_clear_zone", type = TaskSubscribeClearZone.class),
        @XmlElement(name = "task_subscribe_count_channels", type = TaskSubscribeCountChannels.class),
        @XmlElement(name = "task_subscribe_zone_channels", type = TaskSubscribeZoneChannels.class),
        @XmlElement(name = "task_subscribe_features_info", type = TaskSubscribeFeaturesInfo.class),
        @XmlElement(name = "task_delete_all_tasks", type = TaskDeleteAllTasks.class),
        @XmlElement(name = "task_delete_all_notifications", type = TaskDeleteAllNotifications.class),
        @XmlElement(name = "task_subscribe_wireless_tracking", type = TaskSubscribeWirelessTracking.class),
        @XmlElement(name = "task_subscribe_image_snapshots", type = TaskSubscribeImageSnapshots.class),
        @XmlElement(name = "task_subscribe_zone_statistics", type = TaskSubscribeZoneStatistics.class),
        @XmlElement(name = "task_subscribe_zone_object_list", type = TaskSubscribeZoneObjectList.class),
        @XmlElement(name = "task_subscribe_alert_info", type = TaskSubscribeAlertInfo.class),
        @XmlElement(name = "task_set_video_recording", type = TaskSetVideoRecording.class)
    })
    protected List<Task> taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime;

    /**
     * Gets the value of the taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskRequestUpdate }
     * {@link TaskSetDigitalOutput }
     * {@link TaskSetDateTime }
     * {@link TaskSubscribeCounting }
     * {@link TaskSubscribeFill }
     * {@link TaskSubscribeDigitalInput }
     * {@link TaskSubscribeAlive }
     * {@link TaskSubscribeObjectList }
     * {@link TaskSubscribeClearZone }
     * {@link TaskSubscribeCountChannels }
     * {@link TaskSubscribeZoneChannels }
     * {@link TaskSubscribeFeaturesInfo }
     * {@link TaskDeleteAllTasks }
     * {@link TaskDeleteAllNotifications }
     * {@link TaskSubscribeWirelessTracking }
     * {@link TaskSubscribeImageSnapshots }
     * {@link TaskSubscribeZoneStatistics }
     * {@link TaskSubscribeZoneObjectList }
     * {@link TaskSubscribeAlertInfo }
     * {@link TaskSetVideoRecording }
     * 
     * 
     */
    public List<Task> getTaskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime() {
        if (taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime == null) {
            taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime = new ArrayList<Task>();
        }
        return this.taskRequestUpdateOrTaskSetDigitalOutputOrTaskSetDateTime;
    }

}
