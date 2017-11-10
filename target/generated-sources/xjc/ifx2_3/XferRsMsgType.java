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
 * <p>Java class for XferRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}XferAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferModRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferCanRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferRevRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferAdviseRs"/&gt;
 *           &lt;element ref="{IFX2_3}XferStatusModRs"/&gt;
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
@XmlType(name = "XferRsMsg_Type", propOrder = {
    "msgRecDt",
    "xferAddRs",
    "xferModRs",
    "xferCanRs",
    "xferRevRs",
    "xferInqRs",
    "xferAdviseRs",
    "xferStatusModRs"
})
public class XferRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "XferAddRs")
    protected XferAddRsType xferAddRs;
    @XmlElement(name = "XferModRs")
    protected XferModRsType xferModRs;
    @XmlElement(name = "XferCanRs")
    protected XferCanRsType xferCanRs;
    @XmlElement(name = "XferRevRs")
    protected XferRevRsType xferRevRs;
    @XmlElement(name = "XferInqRs")
    protected XferInqRsType xferInqRs;
    @XmlElement(name = "XferAdviseRs")
    protected XferAdviseRsType xferAdviseRs;
    @XmlElement(name = "XferStatusModRs")
    protected XferStatusModRsType xferStatusModRs;

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
     * Gets the value of the xferAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferAddRsType }
     *     
     */
    public XferAddRsType getXferAddRs() {
        return xferAddRs;
    }

    /**
     * Sets the value of the xferAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAddRsType }
     *     
     */
    public void setXferAddRs(XferAddRsType value) {
        this.xferAddRs = value;
    }

    /**
     * Gets the value of the xferModRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferModRsType }
     *     
     */
    public XferModRsType getXferModRs() {
        return xferModRs;
    }

    /**
     * Sets the value of the xferModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferModRsType }
     *     
     */
    public void setXferModRs(XferModRsType value) {
        this.xferModRs = value;
    }

    /**
     * Gets the value of the xferCanRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferCanRsType }
     *     
     */
    public XferCanRsType getXferCanRs() {
        return xferCanRs;
    }

    /**
     * Sets the value of the xferCanRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferCanRsType }
     *     
     */
    public void setXferCanRs(XferCanRsType value) {
        this.xferCanRs = value;
    }

    /**
     * Gets the value of the xferRevRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferRevRsType }
     *     
     */
    public XferRevRsType getXferRevRs() {
        return xferRevRs;
    }

    /**
     * Sets the value of the xferRevRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferRevRsType }
     *     
     */
    public void setXferRevRs(XferRevRsType value) {
        this.xferRevRs = value;
    }

    /**
     * Gets the value of the xferInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferInqRsType }
     *     
     */
    public XferInqRsType getXferInqRs() {
        return xferInqRs;
    }

    /**
     * Sets the value of the xferInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferInqRsType }
     *     
     */
    public void setXferInqRs(XferInqRsType value) {
        this.xferInqRs = value;
    }

    /**
     * Gets the value of the xferAdviseRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferAdviseRsType }
     *     
     */
    public XferAdviseRsType getXferAdviseRs() {
        return xferAdviseRs;
    }

    /**
     * Sets the value of the xferAdviseRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAdviseRsType }
     *     
     */
    public void setXferAdviseRs(XferAdviseRsType value) {
        this.xferAdviseRs = value;
    }

    /**
     * Gets the value of the xferStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferStatusModRsType }
     *     
     */
    public XferStatusModRsType getXferStatusModRs() {
        return xferStatusModRs;
    }

    /**
     * Sets the value of the xferStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferStatusModRsType }
     *     
     */
    public void setXferStatusModRs(XferStatusModRsType value) {
        this.xferStatusModRs = value;
    }

}
