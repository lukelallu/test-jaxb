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
 * <p>Java class for RecurXferCanRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurXferCanRs_Type"&gt;
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
 *             &lt;element ref="{IFX2_3}RecurXferRec"/&gt;
 *             &lt;element ref="{IFX2_3}RecurXferStatusRec"/&gt;
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
@XmlType(name = "RecurXferCanRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRsHdr",
    "recurXferRec",
    "recurXferStatusRec"
})
public class RecurXferCanRsType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRsHdr")
    protected MsgRsHdrType msgRsHdr;
    @XmlElement(name = "RecurXferRec")
    protected RecurXferRecType recurXferRec;
    @XmlElement(name = "RecurXferStatusRec")
    protected RecurXferStatusRecType recurXferStatusRec;

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
     * Gets the value of the recurXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link RecurXferRecType }
     *     
     */
    public RecurXferRecType getRecurXferRec() {
        return recurXferRec;
    }

    /**
     * Sets the value of the recurXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurXferRecType }
     *     
     */
    public void setRecurXferRec(RecurXferRecType value) {
        this.recurXferRec = value;
    }

    /**
     * Gets the value of the recurXferStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link RecurXferStatusRecType }
     *     
     */
    public RecurXferStatusRecType getRecurXferStatusRec() {
        return recurXferStatusRec;
    }

    /**
     * Sets the value of the recurXferStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurXferStatusRecType }
     *     
     */
    public void setRecurXferStatusRec(RecurXferStatusRecType value) {
        this.recurXferStatusRec = value;
    }

}
