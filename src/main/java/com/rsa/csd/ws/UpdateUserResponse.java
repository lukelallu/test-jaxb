//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateUserReturn" type="{http://ws.csd.rsa.com}UpdateUserResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateUserReturn"
})
@XmlRootElement(name = "updateUserResponse")
public class UpdateUserResponse {

    @XmlElement(required = true)
    protected UpdateUserResponse2 updateUserReturn;

    /**
     * Gets the value of the updateUserReturn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserResponse2 }
     *     
     */
    public UpdateUserResponse2 getUpdateUserReturn() {
        return updateUserReturn;
    }

    /**
     * Sets the value of the updateUserReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserResponse2 }
     *     
     */
    public void setUpdateUserReturn(UpdateUserResponse2 value) {
        this.updateUserReturn = value;
    }

}
