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
 * <p>Java class for AcctPeriodData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctPeriodData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}AcctAmtType"/&gt;
 *         &lt;element ref="{IFX2_3}AcctPeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastOccurInd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastOccuranceDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctPeriodData_Type", propOrder = {
    "acctAmtType",
    "acctPeriodType",
    "lastOccurInd",
    "effDt",
    "expDt",
    "amt",
    "count",
    "lastOccuranceDt"
})
public class AcctPeriodDataType {

    @XmlElement(name = "AcctAmtType", required = true)
    protected String acctAmtType;
    @XmlElement(name = "AcctPeriodType")
    protected String acctPeriodType;
    @XmlElement(name = "LastOccurInd")
    protected Boolean lastOccurInd;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "LastOccuranceDt")
    protected String lastOccuranceDt;

    /**
     * Gets the value of the acctAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctAmtType() {
        return acctAmtType;
    }

    /**
     * Sets the value of the acctAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctAmtType(String value) {
        this.acctAmtType = value;
    }

    /**
     * Gets the value of the acctPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPeriodType() {
        return acctPeriodType;
    }

    /**
     * Sets the value of the acctPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPeriodType(String value) {
        this.acctPeriodType = value;
    }

    /**
     * Gets the value of the lastOccurInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastOccurInd() {
        return lastOccurInd;
    }

    /**
     * Sets the value of the lastOccurInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastOccurInd(Boolean value) {
        this.lastOccurInd = value;
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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the lastOccuranceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOccuranceDt() {
        return lastOccuranceDt;
    }

    /**
     * Sets the value of the lastOccuranceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOccuranceDt(String value) {
        this.lastOccuranceDt = value;
    }

}
