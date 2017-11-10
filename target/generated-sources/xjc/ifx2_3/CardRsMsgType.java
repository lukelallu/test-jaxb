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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}CardAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardModRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardDelRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardRevRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardAdviseRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardStatusModRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardStatusInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardAuthModRs"/&gt;
 *           &lt;element ref="{IFX2_3}CardAuthInqRs"/&gt;
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
@XmlType(name = "CardRsMsg_Type", propOrder = {
    "msgRecDt",
    "cardAddRs",
    "cardModRs",
    "cardDelRs",
    "cardRevRs",
    "cardInqRs",
    "cardAdviseRs",
    "cardStatusModRs",
    "cardStatusInqRs",
    "cardAuthModRs",
    "cardAuthInqRs"
})
public class CardRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "CardAddRs")
    protected CardAddRsType cardAddRs;
    @XmlElement(name = "CardModRs")
    protected CardModRsType cardModRs;
    @XmlElement(name = "CardDelRs")
    protected CardDelRsType cardDelRs;
    @XmlElement(name = "CardRevRs")
    protected CardRevRsType cardRevRs;
    @XmlElement(name = "CardInqRs")
    protected CardInqRsType cardInqRs;
    @XmlElement(name = "CardAdviseRs")
    protected CardAdviseRsType cardAdviseRs;
    @XmlElement(name = "CardStatusModRs")
    protected CardStatusModRsType cardStatusModRs;
    @XmlElement(name = "CardStatusInqRs")
    protected CardStatusInqRsType cardStatusInqRs;
    @XmlElement(name = "CardAuthModRs")
    protected CardAuthModRsType cardAuthModRs;
    @XmlElement(name = "CardAuthInqRs")
    protected CardAuthInqRsType cardAuthInqRs;

    /**
     * Gets the value of the msgRecDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgRecDt() {
        return msgRecDt;
    }

    /**
     * Sets the value of the msgRecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgRecDt(XMLGregorianCalendar value) {
        this.msgRecDt = value;
    }

    /**
     * Gets the value of the cardAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardAddRsType }
     *     
     */
    public CardAddRsType getCardAddRs() {
        return cardAddRs;
    }

    /**
     * Sets the value of the cardAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAddRsType }
     *     
     */
    public void setCardAddRs(CardAddRsType value) {
        this.cardAddRs = value;
    }

    /**
     * Gets the value of the cardModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardModRsType }
     *     
     */
    public CardModRsType getCardModRs() {
        return cardModRs;
    }

    /**
     * Sets the value of the cardModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardModRsType }
     *     
     */
    public void setCardModRs(CardModRsType value) {
        this.cardModRs = value;
    }

    /**
     * Gets the value of the cardDelRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardDelRsType }
     *     
     */
    public CardDelRsType getCardDelRs() {
        return cardDelRs;
    }

    /**
     * Sets the value of the cardDelRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDelRsType }
     *     
     */
    public void setCardDelRs(CardDelRsType value) {
        this.cardDelRs = value;
    }

    /**
     * Gets the value of the cardRevRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardRevRsType }
     *     
     */
    public CardRevRsType getCardRevRs() {
        return cardRevRs;
    }

    /**
     * Sets the value of the cardRevRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRevRsType }
     *     
     */
    public void setCardRevRs(CardRevRsType value) {
        this.cardRevRs = value;
    }

    /**
     * Gets the value of the cardInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardInqRsType }
     *     
     */
    public CardInqRsType getCardInqRs() {
        return cardInqRs;
    }

    /**
     * Sets the value of the cardInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInqRsType }
     *     
     */
    public void setCardInqRs(CardInqRsType value) {
        this.cardInqRs = value;
    }

    /**
     * Gets the value of the cardAdviseRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardAdviseRsType }
     *     
     */
    public CardAdviseRsType getCardAdviseRs() {
        return cardAdviseRs;
    }

    /**
     * Sets the value of the cardAdviseRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAdviseRsType }
     *     
     */
    public void setCardAdviseRs(CardAdviseRsType value) {
        this.cardAdviseRs = value;
    }

    /**
     * Gets the value of the cardStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusModRsType }
     *     
     */
    public CardStatusModRsType getCardStatusModRs() {
        return cardStatusModRs;
    }

    /**
     * Sets the value of the cardStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusModRsType }
     *     
     */
    public void setCardStatusModRs(CardStatusModRsType value) {
        this.cardStatusModRs = value;
    }

    /**
     * Gets the value of the cardStatusInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusInqRsType }
     *     
     */
    public CardStatusInqRsType getCardStatusInqRs() {
        return cardStatusInqRs;
    }

    /**
     * Sets the value of the cardStatusInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusInqRsType }
     *     
     */
    public void setCardStatusInqRs(CardStatusInqRsType value) {
        this.cardStatusInqRs = value;
    }

    /**
     * Gets the value of the cardAuthModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardAuthModRsType }
     *     
     */
    public CardAuthModRsType getCardAuthModRs() {
        return cardAuthModRs;
    }

    /**
     * Sets the value of the cardAuthModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAuthModRsType }
     *     
     */
    public void setCardAuthModRs(CardAuthModRsType value) {
        this.cardAuthModRs = value;
    }

    /**
     * Gets the value of the cardAuthInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardAuthInqRsType }
     *     
     */
    public CardAuthInqRsType getCardAuthInqRs() {
        return cardAuthInqRs;
    }

    /**
     * Sets the value of the cardAuthInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAuthInqRsType }
     *     
     */
    public void setCardAuthInqRs(CardAuthInqRsType value) {
        this.cardAuthInqRs = value;
    }

}