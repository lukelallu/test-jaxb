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
 * <p>Java class for PartyRqMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRqMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}PartyAddRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyModRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyDelRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyInqRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyAdviseRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyAudRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartySyncRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyStatusModRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyStatusInqRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyAuthModRq"/&gt;
 *         &lt;element ref="{IFX2_3}PartyAuthInqRq"/&gt;
 *         &lt;element ref="{IFX2_3}RevRqUID"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRqMsg_Type", propOrder = {
    "partyAddRq",
    "partyModRq",
    "partyDelRq",
    "partyInqRq",
    "partyAdviseRq",
    "partyAudRq",
    "partySyncRq",
    "partyStatusModRq",
    "partyStatusInqRq",
    "partyAuthModRq",
    "partyAuthInqRq",
    "revRqUID"
})
public class PartyRqMsgType {

    @XmlElement(name = "PartyAddRq")
    protected PartyAddRqType partyAddRq;
    @XmlElement(name = "PartyModRq")
    protected PartyModRqType partyModRq;
    @XmlElement(name = "PartyDelRq")
    protected PartyDelRqType partyDelRq;
    @XmlElement(name = "PartyInqRq")
    protected PartyInqRqType partyInqRq;
    @XmlElement(name = "PartyAdviseRq")
    protected PartyAdviseRqType partyAdviseRq;
    @XmlElement(name = "PartyAudRq")
    protected PartyAudRqType partyAudRq;
    @XmlElement(name = "PartySyncRq")
    protected PartySyncRqType partySyncRq;
    @XmlElement(name = "PartyStatusModRq")
    protected PartyStatusModRqType partyStatusModRq;
    @XmlElement(name = "PartyStatusInqRq")
    protected PartyStatusInqRqType partyStatusInqRq;
    @XmlElement(name = "PartyAuthModRq")
    protected PartyAuthModRqType partyAuthModRq;
    @XmlElement(name = "PartyAuthInqRq")
    protected PartyAuthInqRqType partyAuthInqRq;
    @XmlElement(name = "RevRqUID")
    protected String revRqUID;

    /**
     * Gets the value of the partyAddRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddRqType }
     *     
     */
    public PartyAddRqType getPartyAddRq() {
        return partyAddRq;
    }

    /**
     * Sets the value of the partyAddRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddRqType }
     *     
     */
    public void setPartyAddRq(PartyAddRqType value) {
        this.partyAddRq = value;
    }

    /**
     * Gets the value of the partyModRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyModRqType }
     *     
     */
    public PartyModRqType getPartyModRq() {
        return partyModRq;
    }

    /**
     * Sets the value of the partyModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyModRqType }
     *     
     */
    public void setPartyModRq(PartyModRqType value) {
        this.partyModRq = value;
    }

    /**
     * Gets the value of the partyDelRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDelRqType }
     *     
     */
    public PartyDelRqType getPartyDelRq() {
        return partyDelRq;
    }

    /**
     * Sets the value of the partyDelRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDelRqType }
     *     
     */
    public void setPartyDelRq(PartyDelRqType value) {
        this.partyDelRq = value;
    }

    /**
     * Gets the value of the partyInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInqRqType }
     *     
     */
    public PartyInqRqType getPartyInqRq() {
        return partyInqRq;
    }

    /**
     * Sets the value of the partyInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInqRqType }
     *     
     */
    public void setPartyInqRq(PartyInqRqType value) {
        this.partyInqRq = value;
    }

    /**
     * Gets the value of the partyAdviseRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAdviseRqType }
     *     
     */
    public PartyAdviseRqType getPartyAdviseRq() {
        return partyAdviseRq;
    }

    /**
     * Sets the value of the partyAdviseRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAdviseRqType }
     *     
     */
    public void setPartyAdviseRq(PartyAdviseRqType value) {
        this.partyAdviseRq = value;
    }

    /**
     * Gets the value of the partyAudRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAudRqType }
     *     
     */
    public PartyAudRqType getPartyAudRq() {
        return partyAudRq;
    }

    /**
     * Sets the value of the partyAudRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAudRqType }
     *     
     */
    public void setPartyAudRq(PartyAudRqType value) {
        this.partyAudRq = value;
    }

    /**
     * Gets the value of the partySyncRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartySyncRqType }
     *     
     */
    public PartySyncRqType getPartySyncRq() {
        return partySyncRq;
    }

    /**
     * Sets the value of the partySyncRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySyncRqType }
     *     
     */
    public void setPartySyncRq(PartySyncRqType value) {
        this.partySyncRq = value;
    }

    /**
     * Gets the value of the partyStatusModRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusModRqType }
     *     
     */
    public PartyStatusModRqType getPartyStatusModRq() {
        return partyStatusModRq;
    }

    /**
     * Sets the value of the partyStatusModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusModRqType }
     *     
     */
    public void setPartyStatusModRq(PartyStatusModRqType value) {
        this.partyStatusModRq = value;
    }

    /**
     * Gets the value of the partyStatusInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusInqRqType }
     *     
     */
    public PartyStatusInqRqType getPartyStatusInqRq() {
        return partyStatusInqRq;
    }

    /**
     * Sets the value of the partyStatusInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusInqRqType }
     *     
     */
    public void setPartyStatusInqRq(PartyStatusInqRqType value) {
        this.partyStatusInqRq = value;
    }

    /**
     * Gets the value of the partyAuthModRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuthModRqType }
     *     
     */
    public PartyAuthModRqType getPartyAuthModRq() {
        return partyAuthModRq;
    }

    /**
     * Sets the value of the partyAuthModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuthModRqType }
     *     
     */
    public void setPartyAuthModRq(PartyAuthModRqType value) {
        this.partyAuthModRq = value;
    }

    /**
     * Gets the value of the partyAuthInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuthInqRqType }
     *     
     */
    public PartyAuthInqRqType getPartyAuthInqRq() {
        return partyAuthInqRq;
    }

    /**
     * Sets the value of the partyAuthInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuthInqRqType }
     *     
     */
    public void setPartyAuthInqRq(PartyAuthInqRqType value) {
        this.partyAuthInqRq = value;
    }

    /**
     * Gets the value of the revRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevRqUID() {
        return revRqUID;
    }

    /**
     * Sets the value of the revRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevRqUID(String value) {
        this.revRqUID = value;
    }

}
