//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 10:08:23 PM BST 
//


package teste;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebootType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RebootType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOAP_REBOOT_POWERON"/>
 *     &lt;enumeration value="SOAP_REBOOT_WATCHDOG"/>
 *     &lt;enumeration value="SOAP_REBOOT_UPDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RebootType")
@XmlEnum
public enum RebootType {

    SOAP_REBOOT_POWERON,
    SOAP_REBOOT_WATCHDOG,
    SOAP_REBOOT_UPDATE;

    public String value() {
        return name();
    }

    public static RebootType fromValue(String v) {
        return valueOf(v);
    }

}
