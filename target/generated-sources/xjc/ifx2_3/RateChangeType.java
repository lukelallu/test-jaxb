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
 * <p>Java class for RateChange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateChange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RateChangeFreq" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RateChangeLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RateChangeVar" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BackDateAllowInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateChange_Type", propOrder = {
    "rateChangeFreq",
    "rateChangeLimit",
    "rateChangeVar",
    "backDateAllowInd"
})
public class RateChangeType {

    @XmlElement(name = "RateChangeFreq")
    protected String rateChangeFreq;
    @XmlElement(name = "RateChangeLimit")
    protected Long rateChangeLimit;
    @XmlElement(name = "RateChangeVar")
    protected BigDecimal rateChangeVar;
    @XmlElement(name = "BackDateAllowInd")
    protected Boolean backDateAllowInd;

    /**
     * Gets the value of the rateChangeFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateChangeFreq() {
        return rateChangeFreq;
    }

    /**
     * Sets the value of the rateChangeFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateChangeFreq(String value) {
        this.rateChangeFreq = value;
    }

    /**
     * Gets the value of the rateChangeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateChangeLimit() {
        return rateChangeLimit;
    }

    /**
     * Sets the value of the rateChangeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateChangeLimit(Long value) {
        this.rateChangeLimit = value;
    }

    /**
     * Gets the value of the rateChangeVar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateChangeVar() {
        return rateChangeVar;
    }

    /**
     * Sets the value of the rateChangeVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateChangeVar(BigDecimal value) {
        this.rateChangeVar = value;
    }

    /**
     * Gets the value of the backDateAllowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackDateAllowInd() {
        return backDateAllowInd;
    }

    /**
     * Sets the value of the backDateAllowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackDateAllowInd(Boolean value) {
        this.backDateAllowInd = value;
    }

}