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
 * <p>Java class for MediaAcctRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}MediaAcctAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}MediaAcctModRs"/&gt;
 *           &lt;element ref="{IFX2_3}MediaAcctInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}MediaAcctStatusModRs"/&gt;
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
@XmlType(name = "MediaAcctRsMsg_Type", propOrder = {
    "msgRecDt",
    "mediaAcctAddRs",
    "mediaAcctModRs",
    "mediaAcctInqRs",
    "mediaAcctStatusModRs"
})
public class MediaAcctRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "MediaAcctAddRs")
    protected MediaAcctAddRsType mediaAcctAddRs;
    @XmlElement(name = "MediaAcctModRs")
    protected MediaAcctModRsType mediaAcctModRs;
    @XmlElement(name = "MediaAcctInqRs")
    protected MediaAcctInqRsType mediaAcctInqRs;
    @XmlElement(name = "MediaAcctStatusModRs")
    protected MediaAcctStatusModRsType mediaAcctStatusModRs;

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
     * Gets the value of the mediaAcctAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctAddRsType }
     *     
     */
    public MediaAcctAddRsType getMediaAcctAddRs() {
        return mediaAcctAddRs;
    }

    /**
     * Sets the value of the mediaAcctAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctAddRsType }
     *     
     */
    public void setMediaAcctAddRs(MediaAcctAddRsType value) {
        this.mediaAcctAddRs = value;
    }

    /**
     * Gets the value of the mediaAcctModRs property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctModRsType }
     *     
     */
    public MediaAcctModRsType getMediaAcctModRs() {
        return mediaAcctModRs;
    }

    /**
     * Sets the value of the mediaAcctModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctModRsType }
     *     
     */
    public void setMediaAcctModRs(MediaAcctModRsType value) {
        this.mediaAcctModRs = value;
    }

    /**
     * Gets the value of the mediaAcctInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctInqRsType }
     *     
     */
    public MediaAcctInqRsType getMediaAcctInqRs() {
        return mediaAcctInqRs;
    }

    /**
     * Sets the value of the mediaAcctInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctInqRsType }
     *     
     */
    public void setMediaAcctInqRs(MediaAcctInqRsType value) {
        this.mediaAcctInqRs = value;
    }

    /**
     * Gets the value of the mediaAcctStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctStatusModRsType }
     *     
     */
    public MediaAcctStatusModRsType getMediaAcctStatusModRs() {
        return mediaAcctStatusModRs;
    }

    /**
     * Sets the value of the mediaAcctStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctStatusModRsType }
     *     
     */
    public void setMediaAcctStatusModRs(MediaAcctStatusModRsType value) {
        this.mediaAcctStatusModRs = value;
    }

}
