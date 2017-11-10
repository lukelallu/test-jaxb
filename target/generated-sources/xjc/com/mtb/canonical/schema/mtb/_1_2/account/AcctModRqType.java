//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_2.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import ifx2_3.MsgRqHdrType;


/**
 * <p>Java class for AcctModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctModRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_2/Account}AcctKeys"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_2/Account}AcctInfo"/&gt;
 *           &lt;choice maxOccurs="unbounded"&gt;
 *             &lt;element ref="{IFX2_3}DelElements"/&gt;
 *             &lt;element ref="{IFX2_3}UpdElements"/&gt;
 *             &lt;element ref="{IFX2_3}NewElements"/&gt;
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
@XmlType(name = "AcctModRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "acctKeys",
    "acctInfoAndDelElementsOrUpdElements"
})
public class AcctModRqType {

    @XmlElement(name = "RqUID", namespace = "IFX2_3", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr", namespace = "IFX2_3")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "AcctKeys", required = true)
    protected AcctKeysType acctKeys;
    @XmlElementRefs({
        @XmlElementRef(name = "NewElements", namespace = "IFX2_3", type = JAXBElement.class),
        @XmlElementRef(name = "AcctInfo", namespace = "http://www.mtb.com/canonical/schema/MTB/1_2/Account", type = JAXBElement.class),
        @XmlElementRef(name = "DelElements", namespace = "IFX2_3", type = JAXBElement.class),
        @XmlElementRef(name = "UpdElements", namespace = "IFX2_3", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> acctInfoAndDelElementsOrUpdElements;

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
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setAcctKeys(AcctKeysType value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the acctInfoAndDelElementsOrUpdElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctInfoAndDelElementsOrUpdElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInfoAndDelElementsOrUpdElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctInfoType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAcctInfoAndDelElementsOrUpdElements() {
        if (acctInfoAndDelElementsOrUpdElements == null) {
            acctInfoAndDelElementsOrUpdElements = new ArrayList<JAXBElement<?>>();
        }
        return this.acctInfoAndDelElementsOrUpdElements;
    }

}
