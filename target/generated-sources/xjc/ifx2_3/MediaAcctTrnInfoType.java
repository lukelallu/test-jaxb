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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctTrnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctTrnInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MediaAcctTrnType"/&gt;
 *         &lt;element ref="{IFX2_3}MediaAcctKeys"/&gt;
 *         &lt;element ref="{IFX2_3}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}CreditRef"/&gt;
 *           &lt;element ref="{IFX2_3}DebitRef"/&gt;
 *           &lt;element ref="{IFX2_3}AcctTrnRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}TrnRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}MediaItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctTrnInfo_Type", propOrder = {
    "mediaAcctTrnType",
    "mediaAcctKeys",
    "curAmt",
    "exchangeRate",
    "creditRefOrDebitRefOrAcctTrnRef",
    "trnRqUID",
    "mediaItem"
})
public class MediaAcctTrnInfoType {

    @XmlElement(name = "MediaAcctTrnType", required = true)
    protected String mediaAcctTrnType;
    @XmlElement(name = "MediaAcctKeys", required = true)
    protected MediaAcctKeysType mediaAcctKeys;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRateType exchangeRate;
    @XmlElements({
        @XmlElement(name = "CreditRef", type = CreditRefType.class),
        @XmlElement(name = "DebitRef", type = DebitRefType.class),
        @XmlElement(name = "AcctTrnRef", type = AcctTrnRefType.class)
    })
    protected List<TrnRefType> creditRefOrDebitRefOrAcctTrnRef;
    @XmlElement(name = "TrnRqUID")
    protected String trnRqUID;
    @XmlElement(name = "MediaItem", required = true)
    protected List<MediaItemType> mediaItem;

    /**
     * Gets the value of the mediaAcctTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctTrnType() {
        return mediaAcctTrnType;
    }

    /**
     * Sets the value of the mediaAcctTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctTrnType(String value) {
        this.mediaAcctTrnType = value;
    }

    /**
     * Gets the value of the mediaAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public MediaAcctKeysType getMediaAcctKeys() {
        return mediaAcctKeys;
    }

    /**
     * Sets the value of the mediaAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public void setMediaAcctKeys(MediaAcctKeysType value) {
        this.mediaAcctKeys = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the creditRefOrDebitRefOrAcctTrnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditRefOrDebitRefOrAcctTrnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditRefOrDebitRefOrAcctTrnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditRefType }
     * {@link DebitRefType }
     * {@link AcctTrnRefType }
     * 
     * 
     */
    public List<TrnRefType> getCreditRefOrDebitRefOrAcctTrnRef() {
        if (creditRefOrDebitRefOrAcctTrnRef == null) {
            creditRefOrDebitRefOrAcctTrnRef = new ArrayList<TrnRefType>();
        }
        return this.creditRefOrDebitRefOrAcctTrnRef;
    }

    /**
     * Gets the value of the trnRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnRqUID() {
        return trnRqUID;
    }

    /**
     * Sets the value of the trnRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnRqUID(String value) {
        this.trnRqUID = value;
    }

    /**
     * Gets the value of the mediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItemType }
     * 
     * 
     */
    public List<MediaItemType> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<MediaItemType>();
        }
        return this.mediaItem;
    }

}