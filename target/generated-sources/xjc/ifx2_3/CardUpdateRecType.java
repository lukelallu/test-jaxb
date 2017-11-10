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
 * <p>Java class for CardUpdateRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardUpdateRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardUpdateId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}ICCUpdateInfo"/&gt;
 *           &lt;element ref="{IFX2_3}MagCardUpdateInfo"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}CardUpdateEnvr" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}ICCUpdateStatus"/&gt;
 *           &lt;element ref="{IFX2_3}MagCardUpdateStatus"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardUpdateRec_Type", propOrder = {
    "svcIdent",
    "cardUpdateId",
    "iccUpdateInfo",
    "magCardUpdateInfo",
    "cardUpdateEnvr",
    "iccUpdateStatus",
    "magCardUpdateStatus"
})
public class CardUpdateRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "CardUpdateId", required = true)
    protected String cardUpdateId;
    @XmlElement(name = "ICCUpdateInfo")
    protected ICCUpdateInfoType iccUpdateInfo;
    @XmlElement(name = "MagCardUpdateInfo")
    protected MagCardUpdateInfoType magCardUpdateInfo;
    @XmlElement(name = "CardUpdateEnvr")
    protected CardUpdateEnvrType cardUpdateEnvr;
    @XmlElement(name = "ICCUpdateStatus")
    protected ICCUpdateStatusType iccUpdateStatus;
    @XmlElement(name = "MagCardUpdateStatus")
    protected MagCardUpdateStatusType magCardUpdateStatus;

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
     * Gets the value of the cardUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardUpdateId() {
        return cardUpdateId;
    }

    /**
     * Sets the value of the cardUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardUpdateId(String value) {
        this.cardUpdateId = value;
    }

    /**
     * Gets the value of the iccUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public ICCUpdateInfoType getICCUpdateInfo() {
        return iccUpdateInfo;
    }

    /**
     * Sets the value of the iccUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public void setICCUpdateInfo(ICCUpdateInfoType value) {
        this.iccUpdateInfo = value;
    }

    /**
     * Gets the value of the magCardUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public MagCardUpdateInfoType getMagCardUpdateInfo() {
        return magCardUpdateInfo;
    }

    /**
     * Sets the value of the magCardUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public void setMagCardUpdateInfo(MagCardUpdateInfoType value) {
        this.magCardUpdateInfo = value;
    }

    /**
     * Gets the value of the cardUpdateEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CardUpdateEnvrType }
     *     
     */
    public CardUpdateEnvrType getCardUpdateEnvr() {
        return cardUpdateEnvr;
    }

    /**
     * Sets the value of the cardUpdateEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardUpdateEnvrType }
     *     
     */
    public void setCardUpdateEnvr(CardUpdateEnvrType value) {
        this.cardUpdateEnvr = value;
    }

    /**
     * Gets the value of the iccUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public ICCUpdateStatusType getICCUpdateStatus() {
        return iccUpdateStatus;
    }

    /**
     * Sets the value of the iccUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public void setICCUpdateStatus(ICCUpdateStatusType value) {
        this.iccUpdateStatus = value;
    }

    /**
     * Gets the value of the magCardUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public MagCardUpdateStatusType getMagCardUpdateStatus() {
        return magCardUpdateStatus;
    }

    /**
     * Sets the value of the magCardUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public void setMagCardUpdateStatus(MagCardUpdateStatusType value) {
        this.magCardUpdateStatus = value;
    }

}