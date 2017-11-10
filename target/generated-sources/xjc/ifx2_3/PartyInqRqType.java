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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInqRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DocCtrlIn" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecCtrlIn" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}PartySel"/&gt;
 *           &lt;element ref="{IFX2_3}RecSelect"/&gt;
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
@XmlType(name = "PartyInqRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "docCtrlIn",
    "recCtrlIn",
    "partySelOrRecSelect"
})
public class PartyInqRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "DocCtrlIn")
    protected DocCtrlInType docCtrlIn;
    @XmlElement(name = "RecCtrlIn")
    protected RecCtrlInType recCtrlIn;
    @XmlElements({
        @XmlElement(name = "PartySel", type = PartySelType.class),
        @XmlElement(name = "RecSelect", type = String.class)
    })
    protected List<Object> partySelOrRecSelect;

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
     * Gets the value of the docCtrlIn property.
     * 
     * @return
     *     possible object is
     *     {@link DocCtrlInType }
     *     
     */
    public DocCtrlInType getDocCtrlIn() {
        return docCtrlIn;
    }

    /**
     * Sets the value of the docCtrlIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocCtrlInType }
     *     
     */
    public void setDocCtrlIn(DocCtrlInType value) {
        this.docCtrlIn = value;
    }

    /**
     * Gets the value of the recCtrlIn property.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlInType }
     *     
     */
    public RecCtrlInType getRecCtrlIn() {
        return recCtrlIn;
    }

    /**
     * Sets the value of the recCtrlIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlInType }
     *     
     */
    public void setRecCtrlIn(RecCtrlInType value) {
        this.recCtrlIn = value;
    }

    /**
     * Gets the value of the partySelOrRecSelect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partySelOrRecSelect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartySelOrRecSelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartySelType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getPartySelOrRecSelect() {
        if (partySelOrRecSelect == null) {
            partySelOrRecSelect = new ArrayList<Object>();
        }
        return this.partySelOrRecSelect;
    }

}
