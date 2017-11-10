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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ifx2_3.PersonDataType;


/**
 * <p>Java class for PartyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}BinICA" minOccurs="0"/&gt;
 *         &lt;element name="PreviousBinICA" type="{IFX2_3}BinICA_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PersonData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}MotherMaidenName" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}TaxIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BirthDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Gender" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Language" minOccurs="0"/&gt;
 *         &lt;element name="Indicators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PromoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="VipInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AcceptEmailMsgSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AcceptSmsMsgSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AcceptTrackingSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="EmployeeSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ProgramPreviewSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CustomerReplacementInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProprietarySegmentationCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyInfoType", propOrder = {
    "binICA",
    "previousBinICA",
    "personData",
    "motherMaidenName",
    "taxIdent",
    "birthDt",
    "gender",
    "language",
    "indicators",
    "proprietarySegmentationCluster",
    "comments"
})
public class PartyInfoType2 {

    @XmlElement(name = "BinICA")
    protected String binICA;
    @XmlElement(name = "PreviousBinICA")
    protected String previousBinICA;
    @XmlElement(name = "PersonData", namespace = "IFX2_3")
    protected PersonDataType personData;
    @XmlElement(name = "MotherMaidenName", namespace = "IFX2_3")
    protected String motherMaidenName;
    @XmlElement(name = "TaxIdent", namespace = "IFX2_3")
    protected String taxIdent;
    @XmlElement(name = "BirthDt", namespace = "IFX2_3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "Gender", namespace = "IFX2_3")
    protected String gender;
    @XmlElement(name = "Language", namespace = "IFX2_3")
    protected String language;
    @XmlElement(name = "Indicators")
    protected PartyInfoType2 .Indicators indicators;
    @XmlElement(name = "ProprietarySegmentationCluster")
    protected String proprietarySegmentationCluster;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Bank Customer Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinICA() {
        return binICA;
    }

    /**
     * Sets the value of the binICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinICA(String value) {
        this.binICA = value;
    }

    /**
     * Gets the value of the previousBinICA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBinICA() {
        return previousBinICA;
    }

    /**
     * Sets the value of the previousBinICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBinICA(String value) {
        this.previousBinICA = value;
    }

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDataType }
     *     
     */
    public PersonDataType getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDataType }
     *     
     */
    public void setPersonData(PersonDataType value) {
        this.personData = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the taxIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdent() {
        return taxIdent;
    }

    /**
     * Sets the value of the taxIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdent(String value) {
        this.taxIdent = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfoType2 .Indicators }
     *     
     */
    public PartyInfoType2 .Indicators getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfoType2 .Indicators }
     *     
     */
    public void setIndicators(PartyInfoType2 .Indicators value) {
        this.indicators = value;
    }

    /**
     * Gets the value of the proprietarySegmentationCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietarySegmentationCluster() {
        return proprietarySegmentationCluster;
    }

    /**
     * Sets the value of the proprietarySegmentationCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietarySegmentationCluster(String value) {
        this.proprietarySegmentationCluster = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }


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
     *         &lt;element name="PromoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="VipInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AcceptEmailMsgSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AcceptSmsMsgSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AcceptTrackingSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="EmployeeSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ProgramPreviewSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CustomerReplacementInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "promoInd",
        "vipInd",
        "acceptEmailMsgSwitch",
        "acceptSmsMsgSwitch",
        "acceptTrackingSwitch",
        "employeeSwitch",
        "programPreviewSwitch",
        "customerReplacementInd"
    })
    public static class Indicators {

        @XmlElement(name = "PromoInd")
        protected Boolean promoInd;
        @XmlElement(name = "VipInd")
        protected Boolean vipInd;
        @XmlElement(name = "AcceptEmailMsgSwitch")
        protected Boolean acceptEmailMsgSwitch;
        @XmlElement(name = "AcceptSmsMsgSwitch")
        protected Boolean acceptSmsMsgSwitch;
        @XmlElement(name = "AcceptTrackingSwitch")
        protected Boolean acceptTrackingSwitch;
        @XmlElement(name = "EmployeeSwitch")
        protected Boolean employeeSwitch;
        @XmlElement(name = "ProgramPreviewSwitch")
        protected Boolean programPreviewSwitch;
        @XmlElement(name = "CustomerReplacementInd")
        protected Boolean customerReplacementInd;

        /**
         * Gets the value of the promoInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPromoInd() {
            return promoInd;
        }

        /**
         * Sets the value of the promoInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPromoInd(Boolean value) {
            this.promoInd = value;
        }

        /**
         * Gets the value of the vipInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVipInd() {
            return vipInd;
        }

        /**
         * Sets the value of the vipInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVipInd(Boolean value) {
            this.vipInd = value;
        }

        /**
         * Gets the value of the acceptEmailMsgSwitch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAcceptEmailMsgSwitch() {
            return acceptEmailMsgSwitch;
        }

        /**
         * Sets the value of the acceptEmailMsgSwitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAcceptEmailMsgSwitch(Boolean value) {
            this.acceptEmailMsgSwitch = value;
        }

        /**
         * Gets the value of the acceptSmsMsgSwitch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAcceptSmsMsgSwitch() {
            return acceptSmsMsgSwitch;
        }

        /**
         * Sets the value of the acceptSmsMsgSwitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAcceptSmsMsgSwitch(Boolean value) {
            this.acceptSmsMsgSwitch = value;
        }

        /**
         * Gets the value of the acceptTrackingSwitch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAcceptTrackingSwitch() {
            return acceptTrackingSwitch;
        }

        /**
         * Sets the value of the acceptTrackingSwitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAcceptTrackingSwitch(Boolean value) {
            this.acceptTrackingSwitch = value;
        }

        /**
         * Gets the value of the employeeSwitch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEmployeeSwitch() {
            return employeeSwitch;
        }

        /**
         * Sets the value of the employeeSwitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEmployeeSwitch(Boolean value) {
            this.employeeSwitch = value;
        }

        /**
         * Gets the value of the programPreviewSwitch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProgramPreviewSwitch() {
            return programPreviewSwitch;
        }

        /**
         * Sets the value of the programPreviewSwitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setProgramPreviewSwitch(Boolean value) {
            this.programPreviewSwitch = value;
        }

        /**
         * Gets the value of the customerReplacementInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCustomerReplacementInd() {
            return customerReplacementInd;
        }

        /**
         * Sets the value of the customerReplacementInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCustomerReplacementInd(Boolean value) {
            this.customerReplacementInd = value;
        }

    }

}
