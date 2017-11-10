//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package org.ifxforum.remitdetailinfo._2007._08;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fee_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}FeeType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}CurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}Rate" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}MinCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}MaxCurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee_Type", propOrder = {
    "feeType",
    "curAmt",
    "rate",
    "minCurAmt",
    "maxCurAmt"
})
public class FeeType {

    @XmlElement(name = "FeeType", required = true)
    protected String feeType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "MinCurAmt")
    protected MinCurAmtType minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected MaxCurAmtType maxCurAmt;

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the minCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinCurAmtType }
     *     
     */
    public MinCurAmtType getMinCurAmt() {
        return minCurAmt;
    }

    /**
     * Sets the value of the minCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinCurAmtType }
     *     
     */
    public void setMinCurAmt(MinCurAmtType value) {
        this.minCurAmt = value;
    }

    /**
     * Gets the value of the maxCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxCurAmtType }
     *     
     */
    public MaxCurAmtType getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Sets the value of the maxCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxCurAmtType }
     *     
     */
    public void setMaxCurAmt(MaxCurAmtType value) {
        this.maxCurAmt = value;
    }

}
