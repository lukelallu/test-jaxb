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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Segmentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BranchIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CampaignIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardDesign" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OrderVolume" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ReorderLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}SeasonalOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Remaining" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecurRule" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ContactName" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PostAddr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PhoneNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryInfo_Type", propOrder = {
    "fiIdent",
    "segmentation",
    "branchIdent",
    "campaignIdent",
    "cardDesign",
    "orderVolume",
    "reorderLevel",
    "seasonalOrder",
    "remaining",
    "recurRule",
    "nickname",
    "contactName",
    "postAddr",
    "phoneNum"
})
public class InventoryInfoType {

    @XmlElement(name = "FIIdent")
    protected String fiIdent;
    @XmlElement(name = "Segmentation")
    protected List<SegmentationType> segmentation;
    @XmlElement(name = "BranchIdent")
    protected String branchIdent;
    @XmlElement(name = "CampaignIdent")
    protected String campaignIdent;
    @XmlElement(name = "CardDesign")
    protected String cardDesign;
    @XmlElement(name = "OrderVolume")
    protected Long orderVolume;
    @XmlElement(name = "ReorderLevel")
    protected Long reorderLevel;
    @XmlElement(name = "SeasonalOrder")
    protected List<SeasonalOrderType> seasonalOrder;
    @XmlElement(name = "Remaining")
    protected Long remaining;
    @XmlElement(name = "RecurRule")
    protected RecurRuleType recurRule;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "PostAddr")
    protected List<PostAddrType> postAddr;
    @XmlElement(name = "PhoneNum")
    protected PhoneNumType phoneNum;

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
     * Gets the value of the segmentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentationType }
     * 
     * 
     */
    public List<SegmentationType> getSegmentation() {
        if (segmentation == null) {
            segmentation = new ArrayList<SegmentationType>();
        }
        return this.segmentation;
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

    /**
     * Gets the value of the campaignIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignIdent() {
        return campaignIdent;
    }

    /**
     * Sets the value of the campaignIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignIdent(String value) {
        this.campaignIdent = value;
    }

    /**
     * Gets the value of the cardDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesign() {
        return cardDesign;
    }

    /**
     * Sets the value of the cardDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesign(String value) {
        this.cardDesign = value;
    }

    /**
     * Gets the value of the orderVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderVolume() {
        return orderVolume;
    }

    /**
     * Sets the value of the orderVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderVolume(Long value) {
        this.orderVolume = value;
    }

    /**
     * Gets the value of the reorderLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReorderLevel() {
        return reorderLevel;
    }

    /**
     * Sets the value of the reorderLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReorderLevel(Long value) {
        this.reorderLevel = value;
    }

    /**
     * Gets the value of the seasonalOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasonalOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonalOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonalOrderType }
     * 
     * 
     */
    public List<SeasonalOrderType> getSeasonalOrder() {
        if (seasonalOrder == null) {
            seasonalOrder = new ArrayList<SeasonalOrderType>();
        }
        return this.seasonalOrder;
    }

    /**
     * Gets the value of the remaining property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemaining() {
        return remaining;
    }

    /**
     * Sets the value of the remaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemaining(Long value) {
        this.remaining = value;
    }

    /**
     * Gets the value of the recurRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecurRuleType }
     *     
     */
    public RecurRuleType getRecurRule() {
        return recurRule;
    }

    /**
     * Sets the value of the recurRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurRuleType }
     *     
     */
    public void setRecurRule(RecurRuleType value) {
        this.recurRule = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostAddrType }
     * 
     * 
     */
    public List<PostAddrType> getPostAddr() {
        if (postAddr == null) {
            postAddr = new ArrayList<PostAddrType>();
        }
        return this.postAddr;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setPhoneNum(PhoneNumType value) {
        this.phoneNum = value;
    }

}
