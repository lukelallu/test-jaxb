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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueAudRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueAudRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecCtrlIn" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Method" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChkIssueKeys" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueAudRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "recCtrlIn",
    "dtRange",
    "method",
    "chkIssueKeys"
})
public class ChkIssueAudRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "RecCtrlIn")
    protected RecCtrlInType recCtrlIn;
    @XmlElement(name = "DtRange")
    protected DtRangeType dtRange;
    @XmlElement(name = "Method")
    @XmlSchemaType(name = "string")
    protected List<MethodType> method;
    @XmlElement(name = "ChkIssueKeys")
    protected List<ChkIssueKeysType> chkIssueKeys;

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
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link DtRangeType }
     *     
     */
    public DtRangeType getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtRangeType }
     *     
     */
    public void setDtRange(DtRangeType value) {
        this.dtRange = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodType }
     * 
     * 
     */
    public List<MethodType> getMethod() {
        if (method == null) {
            method = new ArrayList<MethodType>();
        }
        return this.method;
    }

    /**
     * Gets the value of the chkIssueKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkIssueKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkIssueKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkIssueKeysType }
     * 
     * 
     */
    public List<ChkIssueKeysType> getChkIssueKeys() {
        if (chkIssueKeys == null) {
            chkIssueKeys = new ArrayList<ChkIssueKeysType>();
        }
        return this.chkIssueKeys;
    }

}
