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
 * <p>Java class for PartyCardRelAdviseRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCardRelAdviseRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PartyCardRelRec"/&gt;
 *           &lt;element ref="{IFX2_3}PartyCardRelStatusRec"/&gt;
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
@XmlType(name = "PartyCardRelAdviseRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "partyCardRelRec",
    "partyCardRelStatusRec"
})
public class PartyCardRelAdviseRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "PartyCardRelRec")
    protected PartyCardRelRecType partyCardRelRec;
    @XmlElement(name = "PartyCardRelStatusRec")
    protected PartyCardRelStatusRecType partyCardRelStatusRec;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrType }
     *     
     */
    public MsgRqHdrType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the partyCardRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelRecType }
     *     
     */
    public PartyCardRelRecType getPartyCardRelRec() {
        return partyCardRelRec;
    }

    /**
     * Sets the value of the partyCardRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelRecType }
     *     
     */
    public void setPartyCardRelRec(PartyCardRelRecType value) {
        this.partyCardRelRec = value;
    }

    /**
     * Gets the value of the partyCardRelStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelStatusRecType }
     *     
     */
    public PartyCardRelStatusRecType getPartyCardRelStatusRec() {
        return partyCardRelStatusRec;
    }

    /**
     * Sets the value of the partyCardRelStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelStatusRecType }
     *     
     */
    public void setPartyCardRelStatusRec(PartyCardRelStatusRecType value) {
        this.partyCardRelStatusRec = value;
    }

}