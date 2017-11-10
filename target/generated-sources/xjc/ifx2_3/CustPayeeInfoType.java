//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustPayeeInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPayeeInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Nickname" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}StdPayeeRef"/&gt;
 *           &lt;element ref="{IFX2_3}FSPayee"/&gt;
 *           &lt;element ref="{IFX2_3}XferPayee"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}PayerAcctNum" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PayeeAcctNum" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DfltPmtData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastPmtDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPayeeInfo_Type", propOrder = {
    "name",
    "nickname",
    "stdPayeeRef",
    "fsPayee",
    "xferPayee",
    "payerAcctNum",
    "payeeAcctNum",
    "dfltPmtData",
    "lastPmtCurAmt",
    "lastPmtDt"
})
public class CustPayeeInfoType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "StdPayeeRef")
    protected StdPayeeRefType stdPayeeRef;
    @XmlElement(name = "FSPayee")
    protected FSPayeeType fsPayee;
    @XmlElement(name = "XferPayee")
    protected XferPayeeType xferPayee;
    @XmlElement(name = "PayerAcctNum")
    protected String payerAcctNum;
    @XmlElement(name = "PayeeAcctNum")
    protected String payeeAcctNum;
    @XmlElement(name = "DfltPmtData")
    protected DfltPmtDataType dfltPmtData;
    @XmlElement(name = "LastPmtCurAmt")
    protected LastPmtCurAmtType lastPmtCurAmt;
    @XmlElement(name = "LastPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPmtDt;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the stdPayeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeRefType }
     *     
     */
    public StdPayeeRefType getStdPayeeRef() {
        return stdPayeeRef;
    }

    /**
     * Sets the value of the stdPayeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeRefType }
     *     
     */
    public void setStdPayeeRef(StdPayeeRefType value) {
        this.stdPayeeRef = value;
    }

    /**
     * Gets the value of the fsPayee property.
     * 
     * @return
     *     possible object is
     *     {@link FSPayeeType }
     *     
     */
    public FSPayeeType getFSPayee() {
        return fsPayee;
    }

    /**
     * Sets the value of the fsPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSPayeeType }
     *     
     */
    public void setFSPayee(FSPayeeType value) {
        this.fsPayee = value;
    }

    /**
     * Gets the value of the xferPayee property.
     * 
     * @return
     *     possible object is
     *     {@link XferPayeeType }
     *     
     */
    public XferPayeeType getXferPayee() {
        return xferPayee;
    }

    /**
     * Sets the value of the xferPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferPayeeType }
     *     
     */
    public void setXferPayee(XferPayeeType value) {
        this.xferPayee = value;
    }

    /**
     * Gets the value of the payerAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAcctNum() {
        return payerAcctNum;
    }

    /**
     * Sets the value of the payerAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAcctNum(String value) {
        this.payerAcctNum = value;
    }

    /**
     * Gets the value of the payeeAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAcctNum() {
        return payeeAcctNum;
    }

    /**
     * Sets the value of the payeeAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAcctNum(String value) {
        this.payeeAcctNum = value;
    }

    /**
     * Gets the value of the dfltPmtData property.
     * 
     * @return
     *     possible object is
     *     {@link DfltPmtDataType }
     *     
     */
    public DfltPmtDataType getDfltPmtData() {
        return dfltPmtData;
    }

    /**
     * Sets the value of the dfltPmtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfltPmtDataType }
     *     
     */
    public void setDfltPmtData(DfltPmtDataType value) {
        this.dfltPmtData = value;
    }

    /**
     * Gets the value of the lastPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtCurAmtType }
     *     
     */
    public LastPmtCurAmtType getLastPmtCurAmt() {
        return lastPmtCurAmt;
    }

    /**
     * Sets the value of the lastPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtCurAmtType }
     *     
     */
    public void setLastPmtCurAmt(LastPmtCurAmtType value) {
        this.lastPmtCurAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPmtDt(XMLGregorianCalendar value) {
        this.lastPmtDt = value;
    }

}