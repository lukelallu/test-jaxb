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
 * <p>Java class for CardRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardId"/&gt;
 *         &lt;element ref="{IFX2_3}CardInfo"/&gt;
 *         &lt;element ref="{IFX2_3}CardEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardRec_Type", propOrder = {
    "svcIdent",
    "cardId",
    "cardInfo",
    "cardEnvr",
    "cardAuth",
    "cardStatus"
})
public class CardRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "CardId", required = true)
    protected String cardId;
    @XmlElement(name = "CardInfo", required = true)
    protected CardInfoType cardInfo;
    @XmlElement(name = "CardEnvr")
    protected CardEnvrType cardEnvr;
    @XmlElement(name = "CardAuth")
    protected CardAuthType cardAuth;
    @XmlElement(name = "CardStatus", required = true)
    protected CardStatusType cardStatus;

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
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCardInfo(CardInfoType value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the cardEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CardEnvrType }
     *     
     */
    public CardEnvrType getCardEnvr() {
        return cardEnvr;
    }

    /**
     * Sets the value of the cardEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardEnvrType }
     *     
     */
    public void setCardEnvr(CardEnvrType value) {
        this.cardEnvr = value;
    }

    /**
     * Gets the value of the cardAuth property.
     * 
     * @return
     *     possible object is
     *     {@link CardAuthType }
     *     
     */
    public CardAuthType getCardAuth() {
        return cardAuth;
    }

    /**
     * Sets the value of the cardAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAuthType }
     *     
     */
    public void setCardAuth(CardAuthType value) {
        this.cardAuth = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusType }
     *     
     */
    public CardStatusType getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusType }
     *     
     */
    public void setCardStatus(CardStatusType value) {
        this.cardStatus = value;
    }

}
