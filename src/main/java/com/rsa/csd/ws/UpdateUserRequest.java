//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of UPDATEUSER request
 * 
 * <p>Java class for UpdateUserRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialManagementRequestList" type="{http://ws.csd.rsa.com}CredentialManagementRequestList" minOccurs="0"/&gt;
 *         &lt;element name="deviceManagementRequest" type="{http://ws.csd.rsa.com}DeviceManagementRequestPayload" minOccurs="0"/&gt;
 *         &lt;element name="eventDataList" type="{http://ws.csd.rsa.com}EventDataList" minOccurs="0"/&gt;
 *         &lt;element name="runRiskType" type="{http://ws.csd.rsa.com}RunRiskType" minOccurs="0"/&gt;
 *         &lt;element name="userData" type="{http://ws.csd.rsa.com}UserData" minOccurs="0"/&gt;
 *         &lt;element name="userPreference" type="{http://ws.csd.rsa.com}UserPreference" minOccurs="0"/&gt;
 *         &lt;element name="channelIndicator" type="{http://ws.csd.rsa.com}ChannelIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="clientDefinedChannelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserRequest", propOrder = {
    "credentialManagementRequestList",
    "deviceManagementRequest",
    "eventDataList",
    "runRiskType",
    "userData",
    "userPreference",
    "channelIndicator",
    "clientDefinedChannelIndicator"
})
public class UpdateUserRequest
    extends GenericRequest
{

    protected CredentialManagementRequestList credentialManagementRequestList;
    protected DeviceManagementRequestPayload deviceManagementRequest;
    protected EventDataList eventDataList;
    @XmlSchemaType(name = "string")
    protected RunRiskType runRiskType;
    protected UserData userData;
    protected UserPreference userPreference;
    @XmlSchemaType(name = "string")
    protected ChannelIndicatorType channelIndicator;
    protected String clientDefinedChannelIndicator;

    /**
     * Gets the value of the credentialManagementRequestList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialManagementRequestList }
     *     
     */
    public CredentialManagementRequestList getCredentialManagementRequestList() {
        return credentialManagementRequestList;
    }

    /**
     * Sets the value of the credentialManagementRequestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialManagementRequestList }
     *     
     */
    public void setCredentialManagementRequestList(CredentialManagementRequestList value) {
        this.credentialManagementRequestList = value;
    }

    /**
     * Gets the value of the deviceManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    public DeviceManagementRequestPayload getDeviceManagementRequest() {
        return deviceManagementRequest;
    }

    /**
     * Sets the value of the deviceManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    public void setDeviceManagementRequest(DeviceManagementRequestPayload value) {
        this.deviceManagementRequest = value;
    }

    /**
     * Gets the value of the eventDataList property.
     * 
     * @return
     *     possible object is
     *     {@link EventDataList }
     *     
     */
    public EventDataList getEventDataList() {
        return eventDataList;
    }

    /**
     * Sets the value of the eventDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDataList }
     *     
     */
    public void setEventDataList(EventDataList value) {
        this.eventDataList = value;
    }

    /**
     * Gets the value of the runRiskType property.
     * 
     * @return
     *     possible object is
     *     {@link RunRiskType }
     *     
     */
    public RunRiskType getRunRiskType() {
        return runRiskType;
    }

    /**
     * Sets the value of the runRiskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunRiskType }
     *     
     */
    public void setRunRiskType(RunRiskType value) {
        this.runRiskType = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserData }
     *     
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserData }
     *     
     */
    public void setUserData(UserData value) {
        this.userData = value;
    }

    /**
     * Gets the value of the userPreference property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreference }
     *     
     */
    public UserPreference getUserPreference() {
        return userPreference;
    }

    /**
     * Sets the value of the userPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreference }
     *     
     */
    public void setUserPreference(UserPreference value) {
        this.userPreference = value;
    }

    /**
     * Gets the value of the channelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelIndicatorType }
     *     
     */
    public ChannelIndicatorType getChannelIndicator() {
        return channelIndicator;
    }

    /**
     * Sets the value of the channelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelIndicatorType }
     *     
     */
    public void setChannelIndicator(ChannelIndicatorType value) {
        this.channelIndicator = value;
    }

    /**
     * Gets the value of the clientDefinedChannelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDefinedChannelIndicator() {
        return clientDefinedChannelIndicator;
    }

    /**
     * Sets the value of the clientDefinedChannelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDefinedChannelIndicator(String value) {
        this.clientDefinedChannelIndicator = value;
    }

}
