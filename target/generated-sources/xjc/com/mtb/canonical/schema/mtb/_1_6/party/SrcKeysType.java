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
 * <p>Java class for SrcKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SrcKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PKeySrcObject" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}SrcSystem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PKeyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}AltName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}AltNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrcKeys_Type", propOrder = {
    "pKeySrcObject",
    "srcSystem",
    "pKeyType",
    "altName",
    "altNameType"
})
public class SrcKeysType {

    @XmlElement(name = "PKeySrcObject")
    protected String pKeySrcObject;
    @XmlElement(name = "SrcSystem")
    protected SrcSystemType srcSystem;
    @XmlElement(name = "PKeyType")
    protected String pKeyType;
    @XmlElement(name = "AltName")
    protected String altName;
    @XmlElement(name = "AltNameType")
    protected String altNameType;

    /**
     * Gets the value of the pKeySrcObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKeySrcObject() {
        return pKeySrcObject;
    }

    /**
     * Sets the value of the pKeySrcObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKeySrcObject(String value) {
        this.pKeySrcObject = value;
    }

    /**
     * Gets the value of the srcSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SrcSystemType }
     *     
     */
    public SrcSystemType getSrcSystem() {
        return srcSystem;
    }

    /**
     * Sets the value of the srcSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcSystemType }
     *     
     */
    public void setSrcSystem(SrcSystemType value) {
        this.srcSystem = value;
    }

    /**
     * Gets the value of the pKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKeyType() {
        return pKeyType;
    }

    /**
     * Sets the value of the pKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKeyType(String value) {
        this.pKeyType = value;
    }

    /**
     * Gets the value of the altName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * Sets the value of the altName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * Gets the value of the altNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltNameType() {
        return altNameType;
    }

    /**
     * Sets the value of the altNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltNameType(String value) {
        this.altNameType = value;
    }

}
