//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AcctHoldInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}AcctRef"/&gt;
 *         &lt;element ref="{IFX2_3}HoldType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}CurAmt" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element ref="{IFX2_3}HoldPercent"/&gt;
 *             &lt;element ref="{IFX2_3}PercentBalType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{IFX2_3}SecuredAcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}HoldReason" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ReviewFrequency" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastReviewDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AcctHoldIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldInfo_Type", propOrder = {
    "acctRef",
    "holdType",
    "curAmt",
    "holdPercent",
    "percentBalType",
    "securedAcctRef",
    "holdReason",
    "expDt",
    "term",
    "chkNum",
    "effDt",
    "reviewFrequency",
    "lastReviewDt",
    "memo",
    "acctHoldIdent"
})
public class AcctHoldInfoType {

    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "HoldType", required = true)
    protected String holdType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "HoldPercent")
    protected BigDecimal holdPercent;
    @XmlElement(name = "PercentBalType")
    protected PercentBalTypeType percentBalType;
    @XmlElement(name = "SecuredAcctRef")
    protected SecuredAcctRefType securedAcctRef;
    @XmlElement(name = "HoldReason")
    protected String holdReason;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ReviewFrequency")
    protected ReviewFrequencyType reviewFrequency;
    @XmlElement(name = "LastReviewDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastReviewDt;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "AcctHoldIdent")
    protected String acctHoldIdent;

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldType(String value) {
        this.holdType = value;
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
     * Gets the value of the holdPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoldPercent() {
        return holdPercent;
    }

    /**
     * Sets the value of the holdPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoldPercent(BigDecimal value) {
        this.holdPercent = value;
    }

    /**
     * Gets the value of the percentBalType property.
     * 
     * @return
     *     possible object is
     *     {@link PercentBalTypeType }
     *     
     */
    public PercentBalTypeType getPercentBalType() {
        return percentBalType;
    }

    /**
     * Sets the value of the percentBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentBalTypeType }
     *     
     */
    public void setPercentBalType(PercentBalTypeType value) {
        this.percentBalType = value;
    }

    /**
     * Gets the value of the securedAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredAcctRefType }
     *     
     */
    public SecuredAcctRefType getSecuredAcctRef() {
        return securedAcctRef;
    }

    /**
     * Sets the value of the securedAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredAcctRefType }
     *     
     */
    public void setSecuredAcctRef(SecuredAcctRefType value) {
        this.securedAcctRef = value;
    }

    /**
     * Gets the value of the holdReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReason() {
        return holdReason;
    }

    /**
     * Sets the value of the holdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReason(String value) {
        this.holdReason = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the reviewFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewFrequencyType }
     *     
     */
    public ReviewFrequencyType getReviewFrequency() {
        return reviewFrequency;
    }

    /**
     * Sets the value of the reviewFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewFrequencyType }
     *     
     */
    public void setReviewFrequency(ReviewFrequencyType value) {
        this.reviewFrequency = value;
    }

    /**
     * Gets the value of the lastReviewDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReviewDt() {
        return lastReviewDt;
    }

    /**
     * Sets the value of the lastReviewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReviewDt(XMLGregorianCalendar value) {
        this.lastReviewDt = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the acctHoldIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctHoldIdent() {
        return acctHoldIdent;
    }

    /**
     * Sets the value of the acctHoldIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctHoldIdent(String value) {
        this.acctHoldIdent = value;
    }

}
