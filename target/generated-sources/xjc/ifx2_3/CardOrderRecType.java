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
 * <p>Java class for CardOrderRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardOrderId"/&gt;
 *         &lt;element ref="{IFX2_3}CardOrderInfo"/&gt;
 *         &lt;element ref="{IFX2_3}CardOrderEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardOrderStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderRec_Type", propOrder = {
    "svcIdent",
    "cardOrderId",
    "cardOrderInfo",
    "cardOrderEnvr",
    "cardOrderStatus"
})
public class CardOrderRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "CardOrderId", required = true)
    protected String cardOrderId;
    @XmlElement(name = "CardOrderInfo", required = true)
    protected CardOrderInfoType cardOrderInfo;
    @XmlElement(name = "CardOrderEnvr")
    protected CardOrderEnvrType cardOrderEnvr;
    @XmlElement(name = "CardOrderStatus", required = true)
    protected CardOrderStatusType cardOrderStatus;

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
     * Gets the value of the cardOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOrderId() {
        return cardOrderId;
    }

    /**
     * Sets the value of the cardOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOrderId(String value) {
        this.cardOrderId = value;
    }

    /**
     * Gets the value of the cardOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderInfoType }
     *     
     */
    public CardOrderInfoType getCardOrderInfo() {
        return cardOrderInfo;
    }

    /**
     * Sets the value of the cardOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderInfoType }
     *     
     */
    public void setCardOrderInfo(CardOrderInfoType value) {
        this.cardOrderInfo = value;
    }

    /**
     * Gets the value of the cardOrderEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderEnvrType }
     *     
     */
    public CardOrderEnvrType getCardOrderEnvr() {
        return cardOrderEnvr;
    }

    /**
     * Sets the value of the cardOrderEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderEnvrType }
     *     
     */
    public void setCardOrderEnvr(CardOrderEnvrType value) {
        this.cardOrderEnvr = value;
    }

    /**
     * Gets the value of the cardOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderStatusType }
     *     
     */
    public CardOrderStatusType getCardOrderStatus() {
        return cardOrderStatus;
    }

    /**
     * Sets the value of the cardOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderStatusType }
     *     
     */
    public void setCardOrderStatus(CardOrderStatusType value) {
        this.cardOrderStatus = value;
    }

}
