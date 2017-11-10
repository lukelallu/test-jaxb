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
 * <p>Java class for PartyRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PartyAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyDelRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyRevRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyAdviseRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyStatusModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyStatusInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyAuthModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PartyAuthInqRs"/&gt;
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
@XmlType(name = "PartyRsMsg_Type", propOrder = {
    "msgRecDt",
    "partyAddRs",
    "partyModRs",
    "partyDelRs",
    "partyRevRs",
    "partyInqRs",
    "partyAdviseRs",
    "partyStatusModRs",
    "partyStatusInqRs",
    "partyAuthModRs",
    "partyAuthInqRs"
})
public class PartyRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "PartyAddRs")
    protected PartyAddRsType partyAddRs;
    @XmlElement(name = "PartyModRs")
    protected PartyModRsType partyModRs;
    @XmlElement(name = "PartyDelRs")
    protected PartyDelRsType partyDelRs;
    @XmlElement(name = "PartyRevRs")
    protected PartyRevRsType partyRevRs;
    @XmlElement(name = "PartyInqRs")
    protected PartyInqRsType partyInqRs;
    @XmlElement(name = "PartyAdviseRs")
    protected PartyAdviseRsType partyAdviseRs;
    @XmlElement(name = "PartyStatusModRs")
    protected PartyStatusModRsType partyStatusModRs;
    @XmlElement(name = "PartyStatusInqRs")
    protected PartyStatusInqRsType partyStatusInqRs;
    @XmlElement(name = "PartyAuthModRs")
    protected PartyAuthModRsType partyAuthModRs;
    @XmlElement(name = "PartyAuthInqRs")
    protected PartyAuthInqRsType partyAuthInqRs;

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
     * Gets the value of the partyAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddRsType }
     *     
     */
    public PartyAddRsType getPartyAddRs() {
        return partyAddRs;
    }

    /**
     * Sets the value of the partyAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddRsType }
     *     
     */
    public void setPartyAddRs(PartyAddRsType value) {
        this.partyAddRs = value;
    }

    /**
     * Gets the value of the partyModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyModRsType }
     *     
     */
    public PartyModRsType getPartyModRs() {
        return partyModRs;
    }

    /**
     * Sets the value of the partyModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyModRsType }
     *     
     */
    public void setPartyModRs(PartyModRsType value) {
        this.partyModRs = value;
    }

    /**
     * Gets the value of the partyDelRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDelRsType }
     *     
     */
    public PartyDelRsType getPartyDelRs() {
        return partyDelRs;
    }

    /**
     * Sets the value of the partyDelRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDelRsType }
     *     
     */
    public void setPartyDelRs(PartyDelRsType value) {
        this.partyDelRs = value;
    }

    /**
     * Gets the value of the partyRevRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRevRsType }
     *     
     */
    public PartyRevRsType getPartyRevRs() {
        return partyRevRs;
    }

    /**
     * Sets the value of the partyRevRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRevRsType }
     *     
     */
    public void setPartyRevRs(PartyRevRsType value) {
        this.partyRevRs = value;
    }

    /**
     * Gets the value of the partyInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInqRsType }
     *     
     */
    public PartyInqRsType getPartyInqRs() {
        return partyInqRs;
    }

    /**
     * Sets the value of the partyInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInqRsType }
     *     
     */
    public void setPartyInqRs(PartyInqRsType value) {
        this.partyInqRs = value;
    }

    /**
     * Gets the value of the partyAdviseRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAdviseRsType }
     *     
     */
    public PartyAdviseRsType getPartyAdviseRs() {
        return partyAdviseRs;
    }

    /**
     * Sets the value of the partyAdviseRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAdviseRsType }
     *     
     */
    public void setPartyAdviseRs(PartyAdviseRsType value) {
        this.partyAdviseRs = value;
    }

    /**
     * Gets the value of the partyStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusModRsType }
     *     
     */
    public PartyStatusModRsType getPartyStatusModRs() {
        return partyStatusModRs;
    }

    /**
     * Sets the value of the partyStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusModRsType }
     *     
     */
    public void setPartyStatusModRs(PartyStatusModRsType value) {
        this.partyStatusModRs = value;
    }

    /**
     * Gets the value of the partyStatusInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusInqRsType }
     *     
     */
    public PartyStatusInqRsType getPartyStatusInqRs() {
        return partyStatusInqRs;
    }

    /**
     * Sets the value of the partyStatusInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusInqRsType }
     *     
     */
    public void setPartyStatusInqRs(PartyStatusInqRsType value) {
        this.partyStatusInqRs = value;
    }

    /**
     * Gets the value of the partyAuthModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuthModRsType }
     *     
     */
    public PartyAuthModRsType getPartyAuthModRs() {
        return partyAuthModRs;
    }

    /**
     * Sets the value of the partyAuthModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuthModRsType }
     *     
     */
    public void setPartyAuthModRs(PartyAuthModRsType value) {
        this.partyAuthModRs = value;
    }

    /**
     * Gets the value of the partyAuthInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuthInqRsType }
     *     
     */
    public PartyAuthInqRsType getPartyAuthInqRs() {
        return partyAuthInqRs;
    }

    /**
     * Sets the value of the partyAuthInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuthInqRsType }
     *     
     */
    public void setPartyAuthInqRs(PartyAuthInqRsType value) {
        this.partyAuthInqRs = value;
    }

}
