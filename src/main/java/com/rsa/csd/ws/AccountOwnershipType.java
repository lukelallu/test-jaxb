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
 * <p>Java class for AccountOwnershipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountOwnershipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *     &lt;enumeration value="JOINT"/&gt;
 *     &lt;enumeration value="TRUST"/&gt;
 *     &lt;enumeration value="CUSTODIAL"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountOwnershipType")
@XmlEnum
public enum AccountOwnershipType {

    INDIVIDUAL,
    JOINT,
    TRUST,
    CUSTODIAL,
    BUSINESS;

    public String value() {
        return name();
    }

    public static AccountOwnershipType fromValue(String v) {
        return valueOf(v);
    }

}
