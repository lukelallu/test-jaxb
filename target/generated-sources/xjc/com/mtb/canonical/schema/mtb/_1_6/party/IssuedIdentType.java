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


/**
 * <p>Java class for IssuedIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}IssuedIdent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}IssuedCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}EffStartDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}EffEndDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}ValidInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}LongDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedIdent_Type", propOrder = {
    "issuedCountry",
    "effStartDt",
    "effEndDt",
    "statusCode",
    "validInd",
    "longDesc"
})
public class IssuedIdentType
    extends ifx2_3.IssuedIdentType
{

    @XmlElement(name = "IssuedCountry")
    protected String issuedCountry;
    @XmlElement(name = "EffStartDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effStartDt;
    @XmlElement(name = "EffEndDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effEndDt;
    @XmlElement(name = "StatusCode", namespace = "IFX2_3")
    protected Long statusCode;
    @XmlElement(name = "ValidInd")
    protected String validInd;
    @XmlElement(name = "LongDesc")
    protected String longDesc;

    /**
     * Gets the value of the issuedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedCountry() {
        return issuedCountry;
    }

    /**
     * Sets the value of the issuedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedCountry(String value) {
        this.issuedCountry = value;
    }

    /**
     * Gets the value of the effStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffStartDt() {
        return effStartDt;
    }

    /**
     * Sets the value of the effStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffStartDt(XMLGregorianCalendar value) {
        this.effStartDt = value;
    }

    /**
     * Gets the value of the effEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffEndDt() {
        return effEndDt;
    }

    /**
     * Sets the value of the effEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffEndDt(XMLGregorianCalendar value) {
        this.effEndDt = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCode(Long value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the validInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidInd() {
        return validInd;
    }

    /**
     * Sets the value of the validInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidInd(String value) {
        this.validInd = value;
    }

    /**
     * Gets the value of the longDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Sets the value of the longDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDesc(String value) {
        this.longDesc = value;
    }

}
