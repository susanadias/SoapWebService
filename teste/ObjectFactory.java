//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 10:08:23 PM BST 
//


package teste;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the teste package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificationMessage_QNAME = new QName("http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", "notification_message");
    private final static QName _ErrorMessage_QNAME = new QName("http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", "error_message");
    private final static QName _AnswerMessage_QNAME = new QName("http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", "answer_message");
    private final static QName _TaskMessage_QNAME = new QName("http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", "task_message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: teste
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorContainer }
     * 
     */
    public ErrorContainer createErrorContainer() {
        return new ErrorContainer();
    }

    /**
     * Create an instance of {@link TaskContainer }
     * 
     */
    public TaskContainer createTaskContainer() {
        return new TaskContainer();
    }

    /**
     * Create an instance of {@link AnswerContainer }
     * 
     */
    public AnswerContainer createAnswerContainer() {
        return new AnswerContainer();
    }

    /**
     * Create an instance of {@link NotificationContainer }
     * 
     */
    public NotificationContainer createNotificationContainer() {
        return new NotificationContainer();
    }

    /**
     * Create an instance of {@link WirelessTrackingEvent }
     * 
     */
    public WirelessTrackingEvent createWirelessTrackingEvent() {
        return new WirelessTrackingEvent();
    }

    /**
     * Create an instance of {@link DigitalIOElement }
     * 
     */
    public DigitalIOElement createDigitalIOElement() {
        return new DigitalIOElement();
    }

    /**
     * Create an instance of {@link TaskSubscribeCountChannels }
     * 
     */
    public TaskSubscribeCountChannels createTaskSubscribeCountChannels() {
        return new TaskSubscribeCountChannels();
    }

    /**
     * Create an instance of {@link Coordinate2D }
     * 
     */
    public Coordinate2D createCoordinate2D() {
        return new Coordinate2D();
    }

    /**
     * Create an instance of {@link EventTrigger }
     * 
     */
    public EventTrigger createEventTrigger() {
        return new EventTrigger();
    }

    /**
     * Create an instance of {@link ZoneChannelFeatureInfo }
     * 
     */
    public ZoneChannelFeatureInfo createZoneChannelFeatureInfo() {
        return new ZoneChannelFeatureInfo();
    }

    /**
     * Create an instance of {@link ZoneStatisticsEvent }
     * 
     */
    public ZoneStatisticsEvent createZoneStatisticsEvent() {
        return new ZoneStatisticsEvent();
    }

    /**
     * Create an instance of {@link TimeTrigger }
     * 
     */
    public TimeTrigger createTimeTrigger() {
        return new TimeTrigger();
    }

    /**
     * Create an instance of {@link ClearZoneNotification }
     * 
     */
    public ClearZoneNotification createClearZoneNotification() {
        return new ClearZoneNotification();
    }

    /**
     * Create an instance of {@link TaskRequestUpdate }
     * 
     */
    public TaskRequestUpdate createTaskRequestUpdate() {
        return new TaskRequestUpdate();
    }

    /**
     * Create an instance of {@link CountChannelFeatureInfo }
     * 
     */
    public CountChannelFeatureInfo createCountChannelFeatureInfo() {
        return new CountChannelFeatureInfo();
    }

    /**
     * Create an instance of {@link FeatureChangedEvent }
     * 
     */
    public FeatureChangedEvent createFeatureChangedEvent() {
        return new FeatureChangedEvent();
    }

    /**
     * Create an instance of {@link TaskSubscribeWirelessTracking }
     * 
     */
    public TaskSubscribeWirelessTracking createTaskSubscribeWirelessTracking() {
        return new TaskSubscribeWirelessTracking();
    }

    /**
     * Create an instance of {@link Coordinate3D }
     * 
     */
    public Coordinate3D createCoordinate3D() {
        return new Coordinate3D();
    }

    /**
     * Create an instance of {@link ZoneChannelsEvent }
     * 
     */
    public ZoneChannelsEvent createZoneChannelsEvent() {
        return new ZoneChannelsEvent();
    }

    /**
     * Create an instance of {@link FillEvent }
     * 
     */
    public FillEvent createFillEvent() {
        return new FillEvent();
    }

    /**
     * Create an instance of {@link HistoricObject }
     * 
     */
    public HistoricObject createHistoricObject() {
        return new HistoricObject();
    }

    /**
     * Create an instance of {@link AlertData }
     * 
     */
    public AlertData createAlertData() {
        return new AlertData();
    }

    /**
     * Create an instance of {@link BinaryData }
     * 
     */
    public BinaryData createBinaryData() {
        return new BinaryData();
    }

    /**
     * Create an instance of {@link OSDEvent }
     * 
     */
    public OSDEvent createOSDEvent() {
        return new OSDEvent();
    }

    /**
     * Create an instance of {@link FillRegionID }
     * 
     */
    public FillRegionID createFillRegionID() {
        return new FillRegionID();
    }

    /**
     * Create an instance of {@link TaskSubscribeZoneStatistics }
     * 
     */
    public TaskSubscribeZoneStatistics createTaskSubscribeZoneStatistics() {
        return new TaskSubscribeZoneStatistics();
    }

    /**
     * Create an instance of {@link TaskSubscribeObjectList }
     * 
     */
    public TaskSubscribeObjectList createTaskSubscribeObjectList() {
        return new TaskSubscribeObjectList();
    }

    /**
     * Create an instance of {@link ZoneStatisticsData }
     * 
     */
    public ZoneStatisticsData createZoneStatisticsData() {
        return new ZoneStatisticsData();
    }

    /**
     * Create an instance of {@link CurrentObjectListNotification }
     * 
     */
    public CurrentObjectListNotification createCurrentObjectListNotification() {
        return new CurrentObjectListNotification();
    }

    /**
     * Create an instance of {@link TaskSubscribeImageSnapshots }
     * 
     */
    public TaskSubscribeImageSnapshots createTaskSubscribeImageSnapshots() {
        return new TaskSubscribeImageSnapshots();
    }

    /**
     * Create an instance of {@link ZoneObject }
     * 
     */
    public ZoneObject createZoneObject() {
        return new ZoneObject();
    }

    /**
     * Create an instance of {@link CountEvent }
     * 
     */
    public CountEvent createCountEvent() {
        return new CountEvent();
    }

    /**
     * Create an instance of {@link CountingGateID }
     * 
     */
    public CountingGateID createCountingGateID() {
        return new CountingGateID();
    }

    /**
     * Create an instance of {@link TaskSubscribeFeaturesInfo }
     * 
     */
    public TaskSubscribeFeaturesInfo createTaskSubscribeFeaturesInfo() {
        return new TaskSubscribeFeaturesInfo();
    }

    /**
     * Create an instance of {@link TaskSubscribeAlertInfo }
     * 
     */
    public TaskSubscribeAlertInfo createTaskSubscribeAlertInfo() {
        return new TaskSubscribeAlertInfo();
    }

    /**
     * Create an instance of {@link ClearZoneEvent }
     * 
     */
    public ClearZoneEvent createClearZoneEvent() {
        return new ClearZoneEvent();
    }

    /**
     * Create an instance of {@link OneTimeEvent }
     * 
     */
    public OneTimeEvent createOneTimeEvent() {
        return new OneTimeEvent();
    }

    /**
     * Create an instance of {@link ZoneChannelsNotification }
     * 
     */
    public ZoneChannelsNotification createZoneChannelsNotification() {
        return new ZoneChannelsNotification();
    }

    /**
     * Create an instance of {@link FeatureInfoNotification }
     * 
     */
    public FeatureInfoNotification createFeatureInfoNotification() {
        return new FeatureInfoNotification();
    }

    /**
     * Create an instance of {@link DigitalInputNotification }
     * 
     */
    public DigitalInputNotification createDigitalInputNotification() {
        return new DigitalInputNotification();
    }

    /**
     * Create an instance of {@link CountChannelsEvent }
     * 
     */
    public CountChannelsEvent createCountChannelsEvent() {
        return new CountChannelsEvent();
    }

    /**
     * Create an instance of {@link AlertEvent }
     * 
     */
    public AlertEvent createAlertEvent() {
        return new AlertEvent();
    }

    /**
     * Create an instance of {@link ClockTime }
     * 
     */
    public ClockTime createClockTime() {
        return new ClockTime();
    }

    /**
     * Create an instance of {@link ZoneObjectListNotification }
     * 
     */
    public ZoneObjectListNotification createZoneObjectListNotification() {
        return new ZoneObjectListNotification();
    }

    /**
     * Create an instance of {@link DigitalInputEvent }
     * 
     */
    public DigitalInputEvent createDigitalInputEvent() {
        return new DigitalInputEvent();
    }

    /**
     * Create an instance of {@link ZoneStatisticsNotification }
     * 
     */
    public ZoneStatisticsNotification createZoneStatisticsNotification() {
        return new ZoneStatisticsNotification();
    }

    /**
     * Create an instance of {@link WirelessTrackingNotification }
     * 
     */
    public WirelessTrackingNotification createWirelessTrackingNotification() {
        return new WirelessTrackingNotification();
    }

    /**
     * Create an instance of {@link CurrentObject }
     * 
     */
    public CurrentObject createCurrentObject() {
        return new CurrentObject();
    }

    /**
     * Create an instance of {@link TaskSubscribeCounting }
     * 
     */
    public TaskSubscribeCounting createTaskSubscribeCounting() {
        return new TaskSubscribeCounting();
    }

    /**
     * Create an instance of {@link AlertInfoNotification }
     * 
     */
    public AlertInfoNotification createAlertInfoNotification() {
        return new AlertInfoNotification();
    }

    /**
     * Create an instance of {@link ImageSnapshotsNotification }
     * 
     */
    public ImageSnapshotsNotification createImageSnapshotsNotification() {
        return new ImageSnapshotsNotification();
    }

    /**
     * Create an instance of {@link Trigger }
     * 
     */
    public Trigger createTrigger() {
        return new Trigger();
    }

    /**
     * Create an instance of {@link CountNotification }
     * 
     */
    public CountNotification createCountNotification() {
        return new CountNotification();
    }

    /**
     * Create an instance of {@link CountChannelsFeatureInfo }
     * 
     */
    public CountChannelsFeatureInfo createCountChannelsFeatureInfo() {
        return new CountChannelsFeatureInfo();
    }

    /**
     * Create an instance of {@link TaskSubscribeZoneObjectList }
     * 
     */
    public TaskSubscribeZoneObjectList createTaskSubscribeZoneObjectList() {
        return new TaskSubscribeZoneObjectList();
    }

    /**
     * Create an instance of {@link TaskSubscribeClearZone }
     * 
     */
    public TaskSubscribeClearZone createTaskSubscribeClearZone() {
        return new TaskSubscribeClearZone();
    }

    /**
     * Create an instance of {@link CurrentObjectListEvent }
     * 
     */
    public CurrentObjectListEvent createCurrentObjectListEvent() {
        return new CurrentObjectListEvent();
    }

    /**
     * Create an instance of {@link TaskDeleteAllNotifications }
     * 
     */
    public TaskDeleteAllNotifications createTaskDeleteAllNotifications() {
        return new TaskDeleteAllNotifications();
    }

    /**
     * Create an instance of {@link TaskSetDateTime }
     * 
     */
    public TaskSetDateTime createTaskSetDateTime() {
        return new TaskSetDateTime();
    }

    /**
     * Create an instance of {@link ZoneChannelsFeatureInfo }
     * 
     */
    public ZoneChannelsFeatureInfo createZoneChannelsFeatureInfo() {
        return new ZoneChannelsFeatureInfo();
    }

    /**
     * Create an instance of {@link ClearZoneID }
     * 
     */
    public ClearZoneID createClearZoneID() {
        return new ClearZoneID();
    }

    /**
     * Create an instance of {@link HistoricObjectListNotificationBase }
     * 
     */
    public HistoricObjectListNotificationBase createHistoricObjectListNotificationBase() {
        return new HistoricObjectListNotificationBase();
    }

    /**
     * Create an instance of {@link WirelessTrackingResults }
     * 
     */
    public WirelessTrackingResults createWirelessTrackingResults() {
        return new WirelessTrackingResults();
    }

    /**
     * Create an instance of {@link WirelessTrackingResult }
     * 
     */
    public WirelessTrackingResult createWirelessTrackingResult() {
        return new WirelessTrackingResult();
    }

    /**
     * Create an instance of {@link FillNotification }
     * 
     */
    public FillNotification createFillNotification() {
        return new FillNotification();
    }

    /**
     * Create an instance of {@link TaskDeleteAllTasks }
     * 
     */
    public TaskDeleteAllTasks createTaskDeleteAllTasks() {
        return new TaskDeleteAllTasks();
    }

    /**
     * Create an instance of {@link TaskSubscribeAlive }
     * 
     */
    public TaskSubscribeAlive createTaskSubscribeAlive() {
        return new TaskSubscribeAlive();
    }

    /**
     * Create an instance of {@link TaskSubscribeDigitalInput }
     * 
     */
    public TaskSubscribeDigitalInput createTaskSubscribeDigitalInput() {
        return new TaskSubscribeDigitalInput();
    }

    /**
     * Create an instance of {@link TaskSubscribeFill }
     * 
     */
    public TaskSubscribeFill createTaskSubscribeFill() {
        return new TaskSubscribeFill();
    }

    /**
     * Create an instance of {@link ZoneObjectListEvent }
     * 
     */
    public ZoneObjectListEvent createZoneObjectListEvent() {
        return new ZoneObjectListEvent();
    }

    /**
     * Create an instance of {@link TaskSetVideoRecording }
     * 
     */
    public TaskSetVideoRecording createTaskSetVideoRecording() {
        return new TaskSetVideoRecording();
    }

    /**
     * Create an instance of {@link CountChannelsNotification }
     * 
     */
    public CountChannelsNotification createCountChannelsNotification() {
        return new CountChannelsNotification();
    }

    /**
     * Create an instance of {@link AliveNotification }
     * 
     */
    public AliveNotification createAliveNotification() {
        return new AliveNotification();
    }

    /**
     * Create an instance of {@link StartupNotification }
     * 
     */
    public StartupNotification createStartupNotification() {
        return new StartupNotification();
    }

    /**
     * Create an instance of {@link CountChannelData }
     * 
     */
    public CountChannelData createCountChannelData() {
        return new CountChannelData();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link HistoricObjectListNotification }
     * 
     */
    public HistoricObjectListNotification createHistoricObjectListNotification() {
        return new HistoricObjectListNotification();
    }

    /**
     * Create an instance of {@link ZoneData }
     * 
     */
    public ZoneData createZoneData() {
        return new ZoneData();
    }

    /**
     * Create an instance of {@link TaskSubscribeZoneChannels }
     * 
     */
    public TaskSubscribeZoneChannels createTaskSubscribeZoneChannels() {
        return new TaskSubscribeZoneChannels();
    }

    /**
     * Create an instance of {@link TaskSetDigitalOutput }
     * 
     */
    public TaskSetDigitalOutput createTaskSetDigitalOutput() {
        return new TaskSetDigitalOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", name = "notification_message")
    public JAXBElement<NotificationContainer> createNotificationMessage(NotificationContainer value) {
        return new JAXBElement<NotificationContainer>(_NotificationMessage_QNAME, NotificationContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", name = "error_message")
    public JAXBElement<ErrorContainer> createErrorMessage(ErrorContainer value) {
        return new JAXBElement<ErrorContainer>(_ErrorMessage_QNAME, ErrorContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", name = "answer_message")
    public JAXBElement<AnswerContainer> createAnswerMessage(AnswerContainer value) {
        return new JAXBElement<AnswerContainer>(_AnswerMessage_QNAME, AnswerContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd", name = "task_message")
    public JAXBElement<TaskContainer> createTaskMessage(TaskContainer value) {
        return new JAXBElement<TaskContainer>(_TaskMessage_QNAME, TaskContainer.class, null, value);
    }

}
