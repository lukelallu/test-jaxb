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


/**
 * <p>Java class for OOBManagementRequestPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OOBManagementRequestPayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oobActionTypeList" type="{http://ws.csd.rsa.com}OOBActionTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OOBManagementRequestPayload", propOrder = {
    "oobActionTypeList"
})
@XmlSeeAlso({
    EmailManagementRequestPayload.class,
    PhoneManagementRequestPayload.class
})
public abstract class OOBManagementRequestPayload {

    protected OOBActionTypeList oobActionTypeList;

    /**
     * Gets the value of the oobActionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link OOBActionTypeList }
     *     
     */
    public OOBActionTypeList getOobActionTypeList() {
        return oobActionTypeList;
    }

    /**
     * Sets the value of the oobActionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OOBActionTypeList }
     *     
     */
    public void setOobActionTypeList(OOBActionTypeList value) {
        this.oobActionTypeList = value;
    }

}