//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyStatusInqRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyStatusInqRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}RqUID"/&gt;
 *           &lt;element ref="{IFX2_3}MsgRsHdr" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}RecCtrlOut" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}PartyStatusRec" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PartyStatusInqRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRsHdr",
    "recCtrlOut",
    "partyStatusRec"
})
public class PartyStatusInqRsType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRsHdr")
    protected MsgRsHdrType msgRsHdr;
    @XmlElement(name = "RecCtrlOut")
    protected RecCtrlOutType recCtrlOut;
    @XmlElement(name = "PartyStatusRec")
    protected List<PartyStatusRecType> partyStatusRec;

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
     * Gets the value of the recCtrlOut property.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlOutType }
     *     
     */
    public RecCtrlOutType getRecCtrlOut() {
        return recCtrlOut;
    }

    /**
     * Sets the value of the recCtrlOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlOutType }
     *     
     */
    public void setRecCtrlOut(RecCtrlOutType value) {
        this.recCtrlOut = value;
    }

    /**
     * Gets the value of the partyStatusRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyStatusRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyStatusRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyStatusRecType }
     * 
     * 
     */
    public List<PartyStatusRecType> getPartyStatusRec() {
        if (partyStatusRec == null) {
            partyStatusRec = new ArrayList<PartyStatusRecType>();
        }
        return this.partyStatusRec;
    }

}
