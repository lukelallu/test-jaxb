//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package org.ifxforum.remitdetailinfo._2007._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLineItem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}InvoiceLineItemNum"/&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}AdjType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}CurAmt"/&gt;
 *         &lt;element ref="{http://www.ifxforum.org/RemitDetailInfo/2007/08}Desc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineItem_Type", propOrder = {
    "invoiceLineItemNum",
    "adjType",
    "curAmt",
    "desc"
})
public class InvoiceLineItemType {

    @XmlElement(name = "InvoiceLineItemNum", required = true)
    protected String invoiceLineItemNum;
    @XmlElement(name = "AdjType")
    protected String adjType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the invoiceLineItemNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceLineItemNum() {
        return invoiceLineItemNum;
    }

    /**
     * Sets the value of the invoiceLineItemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceLineItemNum(String value) {
        this.invoiceLineItemNum = value;
    }

    /**
     * Gets the value of the adjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjType() {
        return adjType;
    }

    /**
     * Sets the value of the adjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjType(String value) {
        this.adjType = value;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
