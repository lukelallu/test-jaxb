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
 * <p>Java class for OfferRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}OfferAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}OfferModRs"/&gt;
 *           &lt;element ref="{IFX2_3}OfferDelRs"/&gt;
 *           &lt;element ref="{IFX2_3}OfferInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}OfferStatusModRs"/&gt;
 *           &lt;element ref="{IFX2_3}OfferStatusInqRs"/&gt;
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
@XmlType(name = "OfferRsMsg_Type", propOrder = {
    "msgRecDt",
    "offerAddRs",
    "offerModRs",
    "offerDelRs",
    "offerInqRs",
    "offerStatusModRs",
    "offerStatusInqRs"
})
public class OfferRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "OfferAddRs")
    protected OfferAddRsType offerAddRs;
    @XmlElement(name = "OfferModRs")
    protected OfferModRsType offerModRs;
    @XmlElement(name = "OfferDelRs")
    protected OfferDelRsType offerDelRs;
    @XmlElement(name = "OfferInqRs")
    protected OfferInqRsType offerInqRs;
    @XmlElement(name = "OfferStatusModRs")
    protected OfferStatusModRsType offerStatusModRs;
    @XmlElement(name = "OfferStatusInqRs")
    protected OfferStatusInqRsType offerStatusInqRs;

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
     * Gets the value of the offerAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAddRsType }
     *     
     */
    public OfferAddRsType getOfferAddRs() {
        return offerAddRs;
    }

    /**
     * Sets the value of the offerAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAddRsType }
     *     
     */
    public void setOfferAddRs(OfferAddRsType value) {
        this.offerAddRs = value;
    }

    /**
     * Gets the value of the offerModRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferModRsType }
     *     
     */
    public OfferModRsType getOfferModRs() {
        return offerModRs;
    }

    /**
     * Sets the value of the offerModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferModRsType }
     *     
     */
    public void setOfferModRs(OfferModRsType value) {
        this.offerModRs = value;
    }

    /**
     * Gets the value of the offerDelRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDelRsType }
     *     
     */
    public OfferDelRsType getOfferDelRs() {
        return offerDelRs;
    }

    /**
     * Sets the value of the offerDelRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDelRsType }
     *     
     */
    public void setOfferDelRs(OfferDelRsType value) {
        this.offerDelRs = value;
    }

    /**
     * Gets the value of the offerInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferInqRsType }
     *     
     */
    public OfferInqRsType getOfferInqRs() {
        return offerInqRs;
    }

    /**
     * Sets the value of the offerInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferInqRsType }
     *     
     */
    public void setOfferInqRs(OfferInqRsType value) {
        this.offerInqRs = value;
    }

    /**
     * Gets the value of the offerStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferStatusModRsType }
     *     
     */
    public OfferStatusModRsType getOfferStatusModRs() {
        return offerStatusModRs;
    }

    /**
     * Sets the value of the offerStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferStatusModRsType }
     *     
     */
    public void setOfferStatusModRs(OfferStatusModRsType value) {
        this.offerStatusModRs = value;
    }

    /**
     * Gets the value of the offerStatusInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link OfferStatusInqRsType }
     *     
     */
    public OfferStatusInqRsType getOfferStatusInqRs() {
        return offerStatusInqRs;
    }

    /**
     * Sets the value of the offerStatusInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferStatusInqRsType }
     *     
     */
    public void setOfferStatusInqRs(OfferStatusInqRsType value) {
        this.offerStatusInqRs = value;
    }

}