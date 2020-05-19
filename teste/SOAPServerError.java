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
 * <p>Java class for SOAP_ServerError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SOAP_ServerError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOAP_SERVER_OK"/>
 *     &lt;enumeration value="SOAP_ERROR_UNKNOWN_RESPONSE"/>
 *     &lt;enumeration value="SOAP_ERROR_UNKNOWN_MESSAGE"/>
 *     &lt;enumeration value="SOAP_ERROR_UNKNOWN_DEVICE"/>
 *     &lt;enumeration value="SOAP_ERROR_SERVER_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SOAP_ServerError")
@XmlEnum
public enum SOAPServerError {

    SOAP_SERVER_OK,
    SOAP_ERROR_UNKNOWN_RESPONSE,
    SOAP_ERROR_UNKNOWN_MESSAGE,
    SOAP_ERROR_UNKNOWN_DEVICE,
    SOAP_ERROR_SERVER_DOWN;

    public String value() {
        return name();
    }

    public static SOAPServerError fromValue(String v) {
        return valueOf(v);
    }

}
