//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rsa.csd.kba.ws.KBAManagementRequest;
import com.rsa.csd.oobgen.ws.OOBGenManagementRequest;


/**
 * This type defines Interface for Management Request
 * 
 * <p>Java class for AcspManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspManagementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcspManagementRequest", propOrder = {
    "opcode"
})
@XmlSeeAlso({
    OTPManagementRequest.class,
    KBAManagementRequest.class,
    OOBGenManagementRequest.class
})
public abstract class AcspManagementRequest {

    protected String opcode;

    /**
     * Gets the value of the opcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcode() {
        return opcode;
    }

    /**
     * Sets the value of the opcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcode(String value) {
        this.opcode = value;
    }

}
