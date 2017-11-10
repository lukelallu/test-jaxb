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
 * <p>Java class for AcctAcctRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAcctRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}AcctRef"/&gt;
 *         &lt;element ref="{IFX2_3}RelAcctRef"/&gt;
 *         &lt;element ref="{IFX2_3}AcctRelType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AcctRelName" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RelEstablishDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}TimeFrame" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LimitAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Percent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctAcctRelInfo_Type", propOrder = {
    "acctRef",
    "relAcctRef",
    "acctRelType",
    "acctRelName",
    "relEstablishDt",
    "priority",
    "timeFrame",
    "limitAmt",
    "percent"
})
public class AcctAcctRelInfoType {

    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "RelAcctRef", required = true)
    protected RelAcctRefType relAcctRef;
    @XmlElement(name = "AcctRelType")
    protected String acctRelType;
    @XmlElement(name = "AcctRelName")
    protected String acctRelName;
    @XmlElement(name = "RelEstablishDt")
    protected String relEstablishDt;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "TimeFrame")
    protected TimeFrameType timeFrame;
    @XmlElement(name = "LimitAmt")
    protected LimitAmtType limitAmt;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

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
     * Gets the value of the relAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link RelAcctRefType }
     *     
     */
    public RelAcctRefType getRelAcctRef() {
        return relAcctRef;
    }

    /**
     * Sets the value of the relAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelAcctRefType }
     *     
     */
    public void setRelAcctRef(RelAcctRefType value) {
        this.relAcctRef = value;
    }

    /**
     * Gets the value of the acctRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelType() {
        return acctRelType;
    }

    /**
     * Sets the value of the acctRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelType(String value) {
        this.acctRelType = value;
    }

    /**
     * Gets the value of the acctRelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelName() {
        return acctRelName;
    }

    /**
     * Sets the value of the acctRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelName(String value) {
        this.acctRelName = value;
    }

    /**
     * Gets the value of the relEstablishDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelEstablishDt() {
        return relEstablishDt;
    }

    /**
     * Sets the value of the relEstablishDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelEstablishDt(String value) {
        this.relEstablishDt = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrameType }
     *     
     */
    public TimeFrameType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrameType }
     *     
     */
    public void setTimeFrame(TimeFrameType value) {
        this.timeFrame = value;
    }

    /**
     * Gets the value of the limitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitAmtType }
     *     
     */
    public LimitAmtType getLimitAmt() {
        return limitAmt;
    }

    /**
     * Sets the value of the limitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitAmtType }
     *     
     */
    public void setLimitAmt(LimitAmtType value) {
        this.limitAmt = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}