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
 * <p>Java class for PmtBatchStatAdviseRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatAdviseRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PmtBatchStatRec"/&gt;
 *           &lt;element ref="{IFX2_3}PmtBatchStatStatusRec"/&gt;
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
@XmlType(name = "PmtBatchStatAdviseRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "pmtBatchStatRec",
    "pmtBatchStatStatusRec"
})
public class PmtBatchStatAdviseRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "PmtBatchStatRec")
    protected PmtBatchStatRecType pmtBatchStatRec;
    @XmlElement(name = "PmtBatchStatStatusRec")
    protected PmtBatchStatStatusRecType pmtBatchStatStatusRec;

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
     * Gets the value of the pmtBatchStatRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatRecType }
     *     
     */
    public PmtBatchStatRecType getPmtBatchStatRec() {
        return pmtBatchStatRec;
    }

    /**
     * Sets the value of the pmtBatchStatRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatRecType }
     *     
     */
    public void setPmtBatchStatRec(PmtBatchStatRecType value) {
        this.pmtBatchStatRec = value;
    }

    /**
     * Gets the value of the pmtBatchStatStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatStatusRecType }
     *     
     */
    public PmtBatchStatStatusRecType getPmtBatchStatStatusRec() {
        return pmtBatchStatStatusRec;
    }

    /**
     * Sets the value of the pmtBatchStatStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatStatusRecType }
     *     
     */
    public void setPmtBatchStatStatusRec(PmtBatchStatStatusRecType value) {
        this.pmtBatchStatStatusRec = value;
    }

}