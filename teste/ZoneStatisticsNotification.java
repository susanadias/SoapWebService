//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 10:08:23 PM BST 
//


package teste;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatisticsNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatisticsNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}NotificationBase">
 *       &lt;sequence>
 *         &lt;element name="zone_channel" type="{http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd}ZoneStatisticsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatisticsNotification", propOrder = {
    "zoneChannel"
})
public class ZoneStatisticsNotification
    extends NotificationBase
{

    @XmlElement(name = "zone_channel")
    protected List<ZoneStatisticsData> zoneChannel;

    /**
     * Gets the value of the zoneChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneStatisticsData }
     * 
     * 
     */
    public List<ZoneStatisticsData> getZoneChannel() {
        if (zoneChannel == null) {
            zoneChannel = new ArrayList<ZoneStatisticsData>();
        }
        return this.zoneChannel;
    }

}
