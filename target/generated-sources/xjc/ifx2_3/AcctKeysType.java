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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}BaseKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}AcctId"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element ref="{IFX2_3}BBAN"/&gt;
 *               &lt;element ref="{IFX2_3}IBAN"/&gt;
 *               &lt;element ref="{IFX2_3}UPIC"/&gt;
 *               &lt;element ref="{IFX2_3}CLABE"/&gt;
 *               &lt;element ref="{IFX2_3}CardMagData"/&gt;
 *               &lt;element ref="{IFX2_3}CardKeys"/&gt;
 *               &lt;element ref="{IFX2_3}CardChipData"/&gt;
 *               &lt;element ref="{IFX2_3}AcctIdent"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{IFX2_3}AcctType" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}CurCode" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}FIIdentType" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}FIIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}BranchIdent" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctKeys_Type", propOrder = {
    "svcIdent",
    "acctId",
    "bban",
    "iban",
    "upic",
    "clabe",
    "cardMagData",
    "cardKeys",
    "cardChipData",
    "acctIdent",
    "acctType",
    "curCode",
    "fiIdentType",
    "fiIdent",
    "branchIdent"
})
@XmlSeeAlso({
    FeeAcctKeysType.class,
    ParentAcctKeysType.class,
    RelAcctKeysType.class,
    SecuredAcctKeysType.class,
    ToAcctKeysType.class,
    com.mtb.canonical.schema.mtb._1_2.account.AcctKeysType.class,
    com.mtb.canonical.schema.mtb._1_6.party.AcctKeysType.class
})
public class AcctKeysType
    extends BaseKeysType
{

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "CLABE")
    protected String clabe;
    @XmlElement(name = "CardMagData")
    protected CardMagDataType cardMagData;
    @XmlElement(name = "CardKeys")
    protected CardKeysType cardKeys;
    @XmlElement(name = "CardChipData")
    protected CardChipDataType cardChipData;
    @XmlElement(name = "AcctIdent")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "CurCode")
    protected CurCodeType curCode;
    @XmlElement(name = "FIIdentType")
    protected String fiIdentType;
    @XmlElement(name = "FIIdent")
    protected String fiIdent;
    @XmlElement(name = "BranchIdent")
    protected String branchIdent;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBAN(String value) {
        this.bban = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPIC(String value) {
        this.upic = value;
    }

    /**
     * Gets the value of the clabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLABE() {
        return clabe;
    }

    /**
     * Sets the value of the clabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLABE(String value) {
        this.clabe = value;
    }

    /**
     * Gets the value of the cardMagData property.
     * 
     * @return
     *     possible object is
     *     {@link CardMagDataType }
     *     
     */
    public CardMagDataType getCardMagData() {
        return cardMagData;
    }

    /**
     * Sets the value of the cardMagData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMagDataType }
     *     
     */
    public void setCardMagData(CardMagDataType value) {
        this.cardMagData = value;
    }

    /**
     * Gets the value of the cardKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CardKeysType }
     *     
     */
    public CardKeysType getCardKeys() {
        return cardKeys;
    }

    /**
     * Sets the value of the cardKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardKeysType }
     *     
     */
    public void setCardKeys(CardKeysType value) {
        this.cardKeys = value;
    }

    /**
     * Gets the value of the cardChipData property.
     * 
     * @return
     *     possible object is
     *     {@link CardChipDataType }
     *     
     */
    public CardChipDataType getCardChipData() {
        return cardChipData;
    }

    /**
     * Sets the value of the cardChipData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChipDataType }
     *     
     */
    public void setCardChipData(CardChipDataType value) {
        this.cardChipData = value;
    }

    /**
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the fiIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdentType() {
        return fiIdentType;
    }

    /**
     * Sets the value of the fiIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdentType(String value) {
        this.fiIdentType = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

}