//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_6.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PartyPartyRelId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyPartyRelInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyPartyRelEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyPartyRelStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelRec_Type", propOrder = {
    "partyPartyRelId",
    "partyPartyRelInfo",
    "partyPartyRelEnvr",
    "partyPartyRelStatus"
})
public class PartyPartyRelRecType {

    @XmlElement(name = "PartyPartyRelId", namespace = "IFX2_3")
    protected String partyPartyRelId;
    @XmlElement(name = "PartyPartyRelInfo")
    protected PartyPartyRelInfoType partyPartyRelInfo;
    @XmlElement(name = "PartyPartyRelEnvr")
    protected PartyPartyRelEnvrType partyPartyRelEnvr;
    @XmlElement(name = "PartyPartyRelStatus")
    protected PartyPartyRelStatusType partyPartyRelStatus;

    /**
     * Gets the value of the partyPartyRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyPartyRelId() {
        return partyPartyRelId;
    }

    /**
     * Sets the value of the partyPartyRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyPartyRelId(String value) {
        this.partyPartyRelId = value;
    }

    /**
     * Gets the value of the partyPartyRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelInfoType }
     *     
     */
    public PartyPartyRelInfoType getPartyPartyRelInfo() {
        return partyPartyRelInfo;
    }

    /**
     * Sets the value of the partyPartyRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelInfoType }
     *     
     */
    public void setPartyPartyRelInfo(PartyPartyRelInfoType value) {
        this.partyPartyRelInfo = value;
    }

    /**
     * Gets the value of the partyPartyRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelEnvrType }
     *     
     */
    public PartyPartyRelEnvrType getPartyPartyRelEnvr() {
        return partyPartyRelEnvr;
    }

    /**
     * Sets the value of the partyPartyRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelEnvrType }
     *     
     */
    public void setPartyPartyRelEnvr(PartyPartyRelEnvrType value) {
        this.partyPartyRelEnvr = value;
    }

    /**
     * Gets the value of the partyPartyRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public PartyPartyRelStatusType getPartyPartyRelStatus() {
        return partyPartyRelStatus;
    }

    /**
     * Sets the value of the partyPartyRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public void setPartyPartyRelStatus(PartyPartyRelStatusType value) {
        this.partyPartyRelStatus = value;
    }

}
