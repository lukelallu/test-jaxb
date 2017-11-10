//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.oobgen.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rsa.csd.oobsms.ws.OOBSMSChallengeRequest;
import com.rsa.csd.ws.AcspChallengeRequest;


/**
 * This type defines OOB generic Challenge Request
 * 
 * <p>Java class for OOBGenChallengeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OOBGenChallengeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspChallengeRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactList" type="{http://ws.oobgen.csd.rsa.com}OOBPhoneInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OOBGenChallengeRequest", propOrder = {
    "contactList"
})
@XmlSeeAlso({
    OOBSMSChallengeRequest.class
})
public abstract class OOBGenChallengeRequest
    extends AcspChallengeRequest
{

    protected OOBPhoneInfo contactList;

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link OOBPhoneInfo }
     *     
     */
    public OOBPhoneInfo getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OOBPhoneInfo }
     *     
     */
    public void setContactList(OOBPhoneInfo value) {
        this.contactList = value;
    }

}