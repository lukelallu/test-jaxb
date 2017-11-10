//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_6.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mtb.webservices.wsdl.esbservice_v1.MessageType;
import ifx2_3.MsgRqHdrType;


/**
 * <p>Java class for PartyPartyRelAddRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelAddRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyPartyRelInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}SrcKeys" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/webservices/wsdl/ESBService_v1}message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelAddRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "partyPartyRelInfo",
    "srcKeys",
    "message"
})
public class PartyPartyRelAddRqType {

    @XmlElement(name = "RqUID", namespace = "IFX2_3")
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr", namespace = "IFX2_3")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "PartyPartyRelInfo")
    protected PartyPartyRelInfoType partyPartyRelInfo;
    @XmlElement(name = "SrcKeys")
    protected List<SrcKeysType> srcKeys;
    @XmlElement(namespace = "http://www.mtb.com/webservices/wsdl/ESBService_v1")
    protected List<MessageType> message;

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
     * Gets the value of the partyPartyRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelInfoType }
     *     
     */
    public PartyPartyRelInfoType getPartyPartyRelInfo() {
        return partyPartyRelInfo;
    }

    /**
     * Sets the value of the partyPartyRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelInfoType }
     *     
     */
    public void setPartyPartyRelInfo(PartyPartyRelInfoType value) {
        this.partyPartyRelInfo = value;
    }

    /**
     * Gets the value of the srcKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SrcKeysType }
     * 
     * 
     */
    public List<SrcKeysType> getSrcKeys() {
        if (srcKeys == null) {
            srcKeys = new ArrayList<SrcKeysType>();
        }
        return this.srcKeys;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

}