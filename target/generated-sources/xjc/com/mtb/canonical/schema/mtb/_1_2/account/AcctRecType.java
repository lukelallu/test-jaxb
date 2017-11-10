//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_2.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ifx2_3.SvcIdentType;


/**
 * <p>Java class for AcctRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_2/Account}AcctInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_2/Account}AcctEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_2/Account}AcctStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctRec_Type", propOrder = {
    "svcIdent",
    "acctId",
    "acctInfo",
    "acctEnvr",
    "acctStatus"
})
public class AcctRecType {

    @XmlElement(name = "SvcIdent", namespace = "IFX2_3")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "AcctId", namespace = "IFX2_3")
    protected String acctId;
    @XmlElement(name = "AcctInfo")
    protected AcctInfoType acctInfo;
    @XmlElement(name = "AcctEnvr")
    protected AcctEnvrType acctEnvr;
    @XmlElement(name = "AcctStatus")
    protected AcctStatusType acctStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfoType }
     *     
     */
    public AcctInfoType getAcctInfo() {
        return acctInfo;
    }

    /**
     * Sets the value of the acctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfoType }
     *     
     */
    public void setAcctInfo(AcctInfoType value) {
        this.acctInfo = value;
    }

    /**
     * Gets the value of the acctEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link AcctEnvrType }
     *     
     */
    public AcctEnvrType getAcctEnvr() {
        return acctEnvr;
    }

    /**
     * Sets the value of the acctEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctEnvrType }
     *     
     */
    public void setAcctEnvr(AcctEnvrType value) {
        this.acctEnvr = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatusType }
     *     
     */
    public AcctStatusType getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatusType }
     *     
     */
    public void setAcctStatus(AcctStatusType value) {
        this.acctStatus = value;
    }

}
