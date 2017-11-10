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
 * <p>Java class for ContextRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}ServerDt"/&gt;
 *         &lt;element ref="{IFX2_3}ServerTerminalSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Language" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}EMVRsData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}MsgAuthCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRsHdr_Type", propOrder = {
    "serverDt",
    "serverTerminalSeqNum",
    "language",
    "emvRsData",
    "msgAuthCode"
})
public class ContextRsHdrType {

    @XmlElement(name = "ServerDt", required = true)
    protected String serverDt;
    @XmlElement(name = "ServerTerminalSeqNum")
    protected String serverTerminalSeqNum;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "EMVRsData")
    protected EMVRsDataType emvRsData;
    @XmlElement(name = "MsgAuthCode")
    protected MsgAuthCodeType msgAuthCode;

    /**
     * Gets the value of the serverDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDt() {
        return serverDt;
    }

    /**
     * Sets the value of the serverDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDt(String value) {
        this.serverDt = value;
    }

    /**
     * Gets the value of the serverTerminalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTerminalSeqNum() {
        return serverTerminalSeqNum;
    }

    /**
     * Sets the value of the serverTerminalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTerminalSeqNum(String value) {
        this.serverTerminalSeqNum = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the emvRsData property.
     * 
     * @return
     *     possible object is
     *     {@link EMVRsDataType }
     *     
     */
    public EMVRsDataType getEMVRsData() {
        return emvRsData;
    }

    /**
     * Sets the value of the emvRsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMVRsDataType }
     *     
     */
    public void setEMVRsData(EMVRsDataType value) {
        this.emvRsData = value;
    }

    /**
     * Gets the value of the msgAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public MsgAuthCodeType getMsgAuthCode() {
        return msgAuthCode;
    }

    /**
     * Sets the value of the msgAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public void setMsgAuthCode(MsgAuthCodeType value) {
        this.msgAuthCode = value;
    }

}
