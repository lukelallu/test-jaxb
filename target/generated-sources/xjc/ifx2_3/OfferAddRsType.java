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
 * <p>Java class for OfferAddRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAddRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}RqUID"/&gt;
 *           &lt;element ref="{IFX2_3}MsgRsHdr" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{IFX2_3}OfferRec"/&gt;
 *             &lt;element ref="{IFX2_3}OfferStatusRec"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAddRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRsHdr",
    "offerRec",
    "offerStatusRec"
})
public class OfferAddRsType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRsHdr")
    protected MsgRsHdrType msgRsHdr;
    @XmlElement(name = "OfferRec")
    protected OfferRecType offerRec;
    @XmlElement(name = "OfferStatusRec")
    protected OfferStatusRecType offerStatusRec;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

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
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrType }
     *     
     */
    public MsgRsHdrType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the offerRec property.
     * 
     * @return
     *     possible object is
     *     {@link OfferRecType }
     *     
     */
    public OfferRecType getOfferRec() {
        return offerRec;
    }

    /**
     * Sets the value of the offerRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferRecType }
     *     
     */
    public void setOfferRec(OfferRecType value) {
        this.offerRec = value;
    }

    /**
     * Gets the value of the offerStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link OfferStatusRecType }
     *     
     */
    public OfferStatusRecType getOfferStatusRec() {
        return offerStatusRec;
    }

    /**
     * Sets the value of the offerStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferStatusRecType }
     *     
     */
    public void setOfferStatusRec(OfferStatusRecType value) {
        this.offerStatusRec = value;
    }

}
