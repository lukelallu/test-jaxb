//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSUserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERSISTENT"/&gt;
 *     &lt;enumeration value="NONPERSISTENT"/&gt;
 *     &lt;enumeration value="BAIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSUserType")
@XmlEnum
public enum WSUserType {

    PERSISTENT,
    NONPERSISTENT,
    BAIT;

    public String value() {
        return name();
    }

    public static WSUserType fromValue(String v) {
        return valueOf(v);
    }

}
