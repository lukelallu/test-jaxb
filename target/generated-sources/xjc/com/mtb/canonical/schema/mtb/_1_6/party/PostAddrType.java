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
 * <p>Java class for PostAddr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostAddr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}PostAddr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Addr5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}AddrMailability" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}CountyFIPSCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Latitude" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Longitude" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}UsageType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}MSANumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAddr_Type", propOrder = {
    "addr5",
    "addrMailability",
    "countyFIPSCode",
    "latitude",
    "longitude",
    "usageType",
    "msaNumber"
})
public class PostAddrType
    extends ifx2_3.PostAddrType
{

    @XmlElement(name = "Addr5")
    protected String addr5;
    @XmlElement(name = "AddrMailability")
    protected String addrMailability;
    @XmlElement(name = "CountyFIPSCode")
    protected String countyFIPSCode;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "UsageType")
    protected String usageType;
    @XmlElement(name = "MSANumber")
    protected String msaNumber;

    /**
     * Gets the value of the addr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr5() {
        return addr5;
    }

    /**
     * Sets the value of the addr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr5(String value) {
        this.addr5 = value;
    }

    /**
     * Gets the value of the addrMailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrMailability() {
        return addrMailability;
    }

    /**
     * Sets the value of the addrMailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrMailability(String value) {
        this.addrMailability = value;
    }

    /**
     * Gets the value of the countyFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPSCode() {
        return countyFIPSCode;
    }

    /**
     * Sets the value of the countyFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPSCode(String value) {
        this.countyFIPSCode = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the msaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSANumber() {
        return msaNumber;
    }

    /**
     * Sets the value of the msaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSANumber(String value) {
        this.msaNumber = value;
    }

}
