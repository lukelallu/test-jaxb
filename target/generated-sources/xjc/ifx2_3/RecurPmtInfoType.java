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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurPmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PmtInfo"/&gt;
 *         &lt;element ref="{IFX2_3}RecurModel" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}InitialCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}FinalCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PmtAmtOption" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}CurAmt"/&gt;
 *           &lt;element ref="{IFX2_3}BalPercent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}RetryCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RetryDays" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CreditHeldDays" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OvrdAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CreditReturnInd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CreditRtnAcctRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurPmtInfo_Type", propOrder = {
    "pmtInfo",
    "recurModel",
    "nickname",
    "initialCurAmt",
    "finalCurAmt",
    "pmtAmtOption",
    "curAmt",
    "balPercent",
    "retryCount",
    "retryDays",
    "creditHeldDays",
    "ovrdAmt",
    "creditReturnInd",
    "creditRtnAcctRef"
})
public class RecurPmtInfoType {

    @XmlElement(name = "PmtInfo", required = true)
    protected PmtInfoType pmtInfo;
    @XmlElement(name = "RecurModel")
    protected RecurModelType recurModel;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "InitialCurAmt")
    protected InitialCurAmtType initialCurAmt;
    @XmlElement(name = "FinalCurAmt")
    protected FinalCurAmtType finalCurAmt;
    @XmlElement(name = "PmtAmtOption")
    protected String pmtAmtOption;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "BalPercent")
    protected BigDecimal balPercent;
    @XmlElement(name = "RetryCount")
    protected Long retryCount;
    @XmlElement(name = "RetryDays")
    protected Long retryDays;
    @XmlElement(name = "CreditHeldDays")
    protected Long creditHeldDays;
    @XmlElement(name = "OvrdAmt")
    protected OvrdAmtType ovrdAmt;
    @XmlElement(name = "CreditReturnInd")
    protected Boolean creditReturnInd;
    @XmlElement(name = "CreditRtnAcctRef")
    protected CreditRtnAcctRefType creditRtnAcctRef;

    /**
     * Gets the value of the pmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtInfoType }
     *     
     */
    public PmtInfoType getPmtInfo() {
        return pmtInfo;
    }

    /**
     * Sets the value of the pmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtInfoType }
     *     
     */
    public void setPmtInfo(PmtInfoType value) {
        this.pmtInfo = value;
    }

    /**
     * Gets the value of the recurModel property.
     * 
     * @return
     *     possible object is
     *     {@link RecurModelType }
     *     
     */
    public RecurModelType getRecurModel() {
        return recurModel;
    }

    /**
     * Sets the value of the recurModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurModelType }
     *     
     */
    public void setRecurModel(RecurModelType value) {
        this.recurModel = value;
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
     * Gets the value of the initialCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitialCurAmtType }
     *     
     */
    public InitialCurAmtType getInitialCurAmt() {
        return initialCurAmt;
    }

    /**
     * Sets the value of the initialCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialCurAmtType }
     *     
     */
    public void setInitialCurAmt(InitialCurAmtType value) {
        this.initialCurAmt = value;
    }

    /**
     * Gets the value of the finalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinalCurAmtType }
     *     
     */
    public FinalCurAmtType getFinalCurAmt() {
        return finalCurAmt;
    }

    /**
     * Sets the value of the finalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalCurAmtType }
     *     
     */
    public void setFinalCurAmt(FinalCurAmtType value) {
        this.finalCurAmt = value;
    }

    /**
     * Gets the value of the pmtAmtOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAmtOption() {
        return pmtAmtOption;
    }

    /**
     * Sets the value of the pmtAmtOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtAmtOption(String value) {
        this.pmtAmtOption = value;
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
     * Gets the value of the balPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalPercent() {
        return balPercent;
    }

    /**
     * Sets the value of the balPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalPercent(BigDecimal value) {
        this.balPercent = value;
    }

    /**
     * Gets the value of the retryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the value of the retryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetryCount(Long value) {
        this.retryCount = value;
    }

    /**
     * Gets the value of the retryDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetryDays() {
        return retryDays;
    }

    /**
     * Sets the value of the retryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetryDays(Long value) {
        this.retryDays = value;
    }

    /**
     * Gets the value of the creditHeldDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditHeldDays() {
        return creditHeldDays;
    }

    /**
     * Sets the value of the creditHeldDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditHeldDays(Long value) {
        this.creditHeldDays = value;
    }

    /**
     * Gets the value of the ovrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OvrdAmtType }
     *     
     */
    public OvrdAmtType getOvrdAmt() {
        return ovrdAmt;
    }

    /**
     * Sets the value of the ovrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvrdAmtType }
     *     
     */
    public void setOvrdAmt(OvrdAmtType value) {
        this.ovrdAmt = value;
    }

    /**
     * Gets the value of the creditReturnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditReturnInd() {
        return creditReturnInd;
    }

    /**
     * Sets the value of the creditReturnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditReturnInd(Boolean value) {
        this.creditReturnInd = value;
    }

    /**
     * Gets the value of the creditRtnAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRtnAcctRefType }
     *     
     */
    public CreditRtnAcctRefType getCreditRtnAcctRef() {
        return creditRtnAcctRef;
    }

    /**
     * Sets the value of the creditRtnAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRtnAcctRefType }
     *     
     */
    public void setCreditRtnAcctRef(CreditRtnAcctRefType value) {
        this.creditRtnAcctRef = value;
    }

}