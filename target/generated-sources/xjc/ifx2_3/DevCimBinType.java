//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCimBin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevCimBin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinNum"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinType"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinState"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinDenomination" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinMaxCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinMinCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinCashInCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinInitialCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinDispensedCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinPresentedCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinRetractedCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinRejectedCount" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevCimBinAppLock" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevCimBin_Type", propOrder = {
    "devCimBinNum",
    "devCimBinType",
    "devCimBinItemType",
    "devCimBinState",
    "devCimBinCurCode",
    "devCimBinDenomination",
    "devCimBinCount",
    "devCimBinMaxCount",
    "devCimBinMinCount",
    "devCimBinCashInCount",
    "devCimBinInitialCount",
    "devCimBinDispensedCount",
    "devCimBinPresentedCount",
    "devCimBinRetractedCount",
    "devCimBinRejectedCount",
    "devCimBinNote",
    "devCimBinAppLock"
})
public class DevCimBinType {

    @XmlElement(name = "DevCimBinNum")
    protected long devCimBinNum;
    @XmlElement(name = "DevCimBinType", required = true)
    protected String devCimBinType;
    @XmlElement(name = "DevCimBinItemType", required = true)
    @XmlSchemaType(name = "string")
    protected List<DevCimBinItemTypeType> devCimBinItemType;
    @XmlElement(name = "DevCimBinState", required = true)
    @XmlSchemaType(name = "string")
    protected DevCimBinStateType devCimBinState;
    @XmlElement(name = "DevCimBinCurCode")
    protected DevCimBinCurCodeType devCimBinCurCode;
    @XmlElement(name = "DevCimBinDenomination")
    protected BigDecimal devCimBinDenomination;
    @XmlElement(name = "DevCimBinCount")
    protected Long devCimBinCount;
    @XmlElement(name = "DevCimBinMaxCount")
    protected Long devCimBinMaxCount;
    @XmlElement(name = "DevCimBinMinCount")
    protected Long devCimBinMinCount;
    @XmlElement(name = "DevCimBinCashInCount")
    protected Long devCimBinCashInCount;
    @XmlElement(name = "DevCimBinInitialCount")
    protected Long devCimBinInitialCount;
    @XmlElement(name = "DevCimBinDispensedCount")
    protected Long devCimBinDispensedCount;
    @XmlElement(name = "DevCimBinPresentedCount")
    protected Long devCimBinPresentedCount;
    @XmlElement(name = "DevCimBinRetractedCount")
    protected Long devCimBinRetractedCount;
    @XmlElement(name = "DevCimBinRejectedCount")
    protected Long devCimBinRejectedCount;
    @XmlElement(name = "DevCimBinNote")
    protected List<DevCimBinNoteType> devCimBinNote;
    @XmlElement(name = "DevCimBinAppLock")
    protected Boolean devCimBinAppLock;

    /**
     * Gets the value of the devCimBinNum property.
     * 
     */
    public long getDevCimBinNum() {
        return devCimBinNum;
    }

    /**
     * Sets the value of the devCimBinNum property.
     * 
     */
    public void setDevCimBinNum(long value) {
        this.devCimBinNum = value;
    }

    /**
     * Gets the value of the devCimBinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimBinType() {
        return devCimBinType;
    }

    /**
     * Sets the value of the devCimBinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimBinType(String value) {
        this.devCimBinType = value;
    }

    /**
     * Gets the value of the devCimBinItemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devCimBinItemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevCimBinItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevCimBinItemTypeType }
     * 
     * 
     */
    public List<DevCimBinItemTypeType> getDevCimBinItemType() {
        if (devCimBinItemType == null) {
            devCimBinItemType = new ArrayList<DevCimBinItemTypeType>();
        }
        return this.devCimBinItemType;
    }

    /**
     * Gets the value of the devCimBinState property.
     * 
     * @return
     *     possible object is
     *     {@link DevCimBinStateType }
     *     
     */
    public DevCimBinStateType getDevCimBinState() {
        return devCimBinState;
    }

    /**
     * Sets the value of the devCimBinState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCimBinStateType }
     *     
     */
    public void setDevCimBinState(DevCimBinStateType value) {
        this.devCimBinState = value;
    }

    /**
     * Gets the value of the devCimBinCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link DevCimBinCurCodeType }
     *     
     */
    public DevCimBinCurCodeType getDevCimBinCurCode() {
        return devCimBinCurCode;
    }

    /**
     * Sets the value of the devCimBinCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCimBinCurCodeType }
     *     
     */
    public void setDevCimBinCurCode(DevCimBinCurCodeType value) {
        this.devCimBinCurCode = value;
    }

    /**
     * Gets the value of the devCimBinDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDevCimBinDenomination() {
        return devCimBinDenomination;
    }

    /**
     * Sets the value of the devCimBinDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDevCimBinDenomination(BigDecimal value) {
        this.devCimBinDenomination = value;
    }

    /**
     * Gets the value of the devCimBinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinCount() {
        return devCimBinCount;
    }

    /**
     * Sets the value of the devCimBinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinCount(Long value) {
        this.devCimBinCount = value;
    }

    /**
     * Gets the value of the devCimBinMaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinMaxCount() {
        return devCimBinMaxCount;
    }

    /**
     * Sets the value of the devCimBinMaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinMaxCount(Long value) {
        this.devCimBinMaxCount = value;
    }

    /**
     * Gets the value of the devCimBinMinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinMinCount() {
        return devCimBinMinCount;
    }

    /**
     * Sets the value of the devCimBinMinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinMinCount(Long value) {
        this.devCimBinMinCount = value;
    }

    /**
     * Gets the value of the devCimBinCashInCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinCashInCount() {
        return devCimBinCashInCount;
    }

    /**
     * Sets the value of the devCimBinCashInCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinCashInCount(Long value) {
        this.devCimBinCashInCount = value;
    }

    /**
     * Gets the value of the devCimBinInitialCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinInitialCount() {
        return devCimBinInitialCount;
    }

    /**
     * Sets the value of the devCimBinInitialCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinInitialCount(Long value) {
        this.devCimBinInitialCount = value;
    }

    /**
     * Gets the value of the devCimBinDispensedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinDispensedCount() {
        return devCimBinDispensedCount;
    }

    /**
     * Sets the value of the devCimBinDispensedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinDispensedCount(Long value) {
        this.devCimBinDispensedCount = value;
    }

    /**
     * Gets the value of the devCimBinPresentedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinPresentedCount() {
        return devCimBinPresentedCount;
    }

    /**
     * Sets the value of the devCimBinPresentedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinPresentedCount(Long value) {
        this.devCimBinPresentedCount = value;
    }

    /**
     * Gets the value of the devCimBinRetractedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinRetractedCount() {
        return devCimBinRetractedCount;
    }

    /**
     * Sets the value of the devCimBinRetractedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinRetractedCount(Long value) {
        this.devCimBinRetractedCount = value;
    }

    /**
     * Gets the value of the devCimBinRejectedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinRejectedCount() {
        return devCimBinRejectedCount;
    }

    /**
     * Sets the value of the devCimBinRejectedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinRejectedCount(Long value) {
        this.devCimBinRejectedCount = value;
    }

    /**
     * Gets the value of the devCimBinNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devCimBinNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevCimBinNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevCimBinNoteType }
     * 
     * 
     */
    public List<DevCimBinNoteType> getDevCimBinNote() {
        if (devCimBinNote == null) {
            devCimBinNote = new ArrayList<DevCimBinNoteType>();
        }
        return this.devCimBinNote;
    }

    /**
     * Gets the value of the devCimBinAppLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDevCimBinAppLock() {
        return devCimBinAppLock;
    }

    /**
     * Sets the value of the devCimBinAppLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDevCimBinAppLock(Boolean value) {
        this.devCimBinAppLock = value;
    }

}