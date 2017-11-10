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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PassbkRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PassbkAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkDelRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkRevRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkStatusModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PassbkStatusInqRs"/&gt;
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
@XmlType(name = "PassbkRsMsg_Type", propOrder = {
    "msgRecDt",
    "passbkAddRs",
    "passbkModRs",
    "passbkDelRs",
    "passbkRevRs",
    "passbkInqRs",
    "passbkStatusModRs",
    "passbkStatusInqRs"
})
public class PassbkRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "PassbkAddRs")
    protected PassbkAddRsType passbkAddRs;
    @XmlElement(name = "PassbkModRs")
    protected PassbkModRsType passbkModRs;
    @XmlElement(name = "PassbkDelRs")
    protected PassbkDelRsType passbkDelRs;
    @XmlElement(name = "PassbkRevRs")
    protected PassbkRevRsType passbkRevRs;
    @XmlElement(name = "PassbkInqRs")
    protected PassbkInqRsType passbkInqRs;
    @XmlElement(name = "PassbkStatusModRs")
    protected PassbkStatusModRsType passbkStatusModRs;
    @XmlElement(name = "PassbkStatusInqRs")
    protected PassbkStatusInqRsType passbkStatusInqRs;

    /**
     * Gets the value of the msgRecDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgRecDt() {
        return msgRecDt;
    }

    /**
     * Sets the value of the msgRecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgRecDt(XMLGregorianCalendar value) {
        this.msgRecDt = value;
    }

    /**
     * Gets the value of the passbkAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkAddRsType }
     *     
     */
    public PassbkAddRsType getPassbkAddRs() {
        return passbkAddRs;
    }

    /**
     * Sets the value of the passbkAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkAddRsType }
     *     
     */
    public void setPassbkAddRs(PassbkAddRsType value) {
        this.passbkAddRs = value;
    }

    /**
     * Gets the value of the passbkModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkModRsType }
     *     
     */
    public PassbkModRsType getPassbkModRs() {
        return passbkModRs;
    }

    /**
     * Sets the value of the passbkModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkModRsType }
     *     
     */
    public void setPassbkModRs(PassbkModRsType value) {
        this.passbkModRs = value;
    }

    /**
     * Gets the value of the passbkDelRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkDelRsType }
     *     
     */
    public PassbkDelRsType getPassbkDelRs() {
        return passbkDelRs;
    }

    /**
     * Sets the value of the passbkDelRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkDelRsType }
     *     
     */
    public void setPassbkDelRs(PassbkDelRsType value) {
        this.passbkDelRs = value;
    }

    /**
     * Gets the value of the passbkRevRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkRevRsType }
     *     
     */
    public PassbkRevRsType getPassbkRevRs() {
        return passbkRevRs;
    }

    /**
     * Sets the value of the passbkRevRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkRevRsType }
     *     
     */
    public void setPassbkRevRs(PassbkRevRsType value) {
        this.passbkRevRs = value;
    }

    /**
     * Gets the value of the passbkInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkInqRsType }
     *     
     */
    public PassbkInqRsType getPassbkInqRs() {
        return passbkInqRs;
    }

    /**
     * Sets the value of the passbkInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkInqRsType }
     *     
     */
    public void setPassbkInqRs(PassbkInqRsType value) {
        this.passbkInqRs = value;
    }

    /**
     * Gets the value of the passbkStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkStatusModRsType }
     *     
     */
    public PassbkStatusModRsType getPassbkStatusModRs() {
        return passbkStatusModRs;
    }

    /**
     * Sets the value of the passbkStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkStatusModRsType }
     *     
     */
    public void setPassbkStatusModRs(PassbkStatusModRsType value) {
        this.passbkStatusModRs = value;
    }

    /**
     * Gets the value of the passbkStatusInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkStatusInqRsType }
     *     
     */
    public PassbkStatusInqRsType getPassbkStatusInqRs() {
        return passbkStatusInqRs;
    }

    /**
     * Sets the value of the passbkStatusInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkStatusInqRsType }
     *     
     */
    public void setPassbkStatusInqRs(PassbkStatusInqRsType value) {
        this.passbkStatusInqRs = value;
    }

}