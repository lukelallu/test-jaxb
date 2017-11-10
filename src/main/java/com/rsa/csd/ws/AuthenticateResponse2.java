//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of an AUTHENTICATE request
 * 
 * <p>Java class for AuthenticateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialAuthResultList" type="{http://ws.csd.rsa.com}CredentialAuthResultList" minOccurs="0"/&gt;
 *         &lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&gt;
 *         &lt;element name="requiredCredentialList" type="{http://ws.csd.rsa.com}RequiredCredentialList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateResponse", propOrder = {
    "credentialAuthResultList",
    "deviceManagementResponse",
    "requiredCredentialList"
})
public class AuthenticateResponse2
    extends GenericResponse
{

    protected CredentialAuthResultList credentialAuthResultList;
    protected DeviceManagementResponsePayload deviceManagementResponse;
    protected RequiredCredentialList requiredCredentialList;

    /**
     * Gets the value of the credentialAuthResultList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthResultList }
     *     
     */
    public CredentialAuthResultList getCredentialAuthResultList() {
        return credentialAuthResultList;
    }

    /**
     * Sets the value of the credentialAuthResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthResultList }
     *     
     */
    public void setCredentialAuthResultList(CredentialAuthResultList value) {
        this.credentialAuthResultList = value;
    }

    /**
     * Gets the value of the deviceManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public DeviceManagementResponsePayload getDeviceManagementResponse() {
        return deviceManagementResponse;
    }

    /**
     * Sets the value of the deviceManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public void setDeviceManagementResponse(DeviceManagementResponsePayload value) {
        this.deviceManagementResponse = value;
    }

    /**
     * Gets the value of the requiredCredentialList property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCredentialList }
     *     
     */
    public RequiredCredentialList getRequiredCredentialList() {
        return requiredCredentialList;
    }

    /**
     * Sets the value of the requiredCredentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCredentialList }
     *     
     */
    public void setRequiredCredentialList(RequiredCredentialList value) {
        this.requiredCredentialList = value;
    }

}
