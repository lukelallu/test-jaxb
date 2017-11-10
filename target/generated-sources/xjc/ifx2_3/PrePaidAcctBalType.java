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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrePaidAcctBal_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrePaidAcctBal_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PrePaidBalType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}CurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}PrePaidUnits" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Desc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePaidAcctBal_Type", propOrder = {
    "prePaidBalType",
    "curAmt",
    "prePaidUnits",
    "effDt",
    "expDt",
    "desc"
})
public class PrePaidAcctBalType {

    @XmlElement(name = "PrePaidBalType", required = true)
    protected String prePaidBalType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "PrePaidUnits")
    protected PrePaidUnitsType prePaidUnits;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the prePaidBalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePaidBalType() {
        return prePaidBalType;
    }

    /**
     * Sets the value of the prePaidBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePaidBalType(String value) {
        this.prePaidBalType = value;
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
     * Gets the value of the prePaidUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidUnitsType }
     *     
     */
    public PrePaidUnitsType getPrePaidUnits() {
        return prePaidUnits;
    }

    /**
     * Sets the value of the prePaidUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidUnitsType }
     *     
     */
    public void setPrePaidUnits(PrePaidUnitsType value) {
        this.prePaidUnits = value;
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
