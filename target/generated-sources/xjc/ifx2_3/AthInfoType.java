//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AthInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AthInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}AthType"/&gt;
 *         &lt;element ref="{IFX2_3}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AcctKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DebitCredit"/&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AthProcCode" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Duration" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AthExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StandInInd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StandInLoc" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PreAthInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AthInfo_Type", propOrder = {
    "athType",
    "compositeCurAmt",
    "acctKeys",
    "debitCredit",
    "effDt",
    "athProcCode",
    "duration",
    "athExpDt",
    "standInInd",
    "standInLoc",
    "name",
    "preAthInd"
})
public class AthInfoType {

    @XmlElement(name = "AthType", required = true)
    protected String athType;
    @XmlElement(name = "CompositeCurAmt")
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "AcctKeys")
    protected AcctKeysType acctKeys;
    @XmlElement(name = "DebitCredit", required = true)
    @XmlSchemaType(name = "string")
    protected DebitCreditType debitCredit;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "AthProcCode")
    protected String athProcCode;
    @XmlElement(name = "Duration")
    protected DurationType duration;
    @XmlElement(name = "AthExpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar athExpDt;
    @XmlElement(name = "StandInInd")
    protected Boolean standInInd;
    @XmlElement(name = "StandInLoc")
    protected String standInLoc;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PreAthInd")
    protected Boolean preAthInd;

    /**
     * Gets the value of the athType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthType() {
        return athType;
    }

    /**
     * Sets the value of the athType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthType(String value) {
        this.athType = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setAcctKeys(AcctKeysType value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the debitCredit property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getDebitCredit() {
        return debitCredit;
    }

    /**
     * Sets the value of the debitCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setDebitCredit(DebitCreditType value) {
        this.debitCredit = value;
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
     * Gets the value of the athProcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthProcCode() {
        return athProcCode;
    }

    /**
     * Sets the value of the athProcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthProcCode(String value) {
        this.athProcCode = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the athExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAthExpDt() {
        return athExpDt;
    }

    /**
     * Sets the value of the athExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAthExpDt(XMLGregorianCalendar value) {
        this.athExpDt = value;
    }

    /**
     * Gets the value of the standInInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandInInd() {
        return standInInd;
    }

    /**
     * Sets the value of the standInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandInInd(Boolean value) {
        this.standInInd = value;
    }

    /**
     * Gets the value of the standInLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInLoc() {
        return standInLoc;
    }

    /**
     * Sets the value of the standInLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInLoc(String value) {
        this.standInLoc = value;
    }

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
     * Gets the value of the preAthInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAthInd() {
        return preAthInd;
    }

    /**
     * Sets the value of the preAthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAthInd(Boolean value) {
        this.preAthInd = value;
    }

}