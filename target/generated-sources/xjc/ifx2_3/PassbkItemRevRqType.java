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
 * <p>Java class for PassbkItemRevRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkItemRevRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RevReasonCode"/&gt;
 *         &lt;element ref="{IFX2_3}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PassbkItemRqMsg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkItemRevRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "revReasonCode",
    "desc",
    "passbkItemRqMsg"
})
public class PassbkItemRevRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "RevReasonCode", required = true)
    protected RevReasonCodeType revReasonCode;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "PassbkItemRqMsg", required = true)
    protected PassbkItemRqMsgType passbkItemRqMsg;

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
     * Gets the value of the revReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link RevReasonCodeType }
     *     
     */
    public RevReasonCodeType getRevReasonCode() {
        return revReasonCode;
    }

    /**
     * Sets the value of the revReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevReasonCodeType }
     *     
     */
    public void setRevReasonCode(RevReasonCodeType value) {
        this.revReasonCode = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the passbkItemRqMsg property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemRqMsgType }
     *     
     */
    public PassbkItemRqMsgType getPassbkItemRqMsg() {
        return passbkItemRqMsg;
    }

    /**
     * Sets the value of the passbkItemRqMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemRqMsgType }
     *     
     */
    public void setPassbkItemRqMsg(PassbkItemRqMsgType value) {
        this.passbkItemRqMsg = value;
    }

}
