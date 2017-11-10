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
 * <p>Java class for AcctHoldStatusModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldStatusModRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AcctHoldKeys"/&gt;
 *         &lt;element ref="{IFX2_3}AcctHoldStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldStatusModRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "acctHoldKeys",
    "acctHoldStatus"
})
public class AcctHoldStatusModRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "AcctHoldKeys", required = true)
    protected AcctHoldKeysType acctHoldKeys;
    @XmlElement(name = "AcctHoldStatus", required = true)
    protected AcctHoldStatusType acctHoldStatus;

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
     * Gets the value of the acctHoldKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldKeysType }
     *     
     */
    public AcctHoldKeysType getAcctHoldKeys() {
        return acctHoldKeys;
    }

    /**
     * Sets the value of the acctHoldKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldKeysType }
     *     
     */
    public void setAcctHoldKeys(AcctHoldKeysType value) {
        this.acctHoldKeys = value;
    }

    /**
     * Gets the value of the acctHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldStatusType }
     *     
     */
    public AcctHoldStatusType getAcctHoldStatus() {
        return acctHoldStatus;
    }

    /**
     * Sets the value of the acctHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldStatusType }
     *     
     */
    public void setAcctHoldStatus(AcctHoldStatusType value) {
        this.acctHoldStatus = value;
    }

}
