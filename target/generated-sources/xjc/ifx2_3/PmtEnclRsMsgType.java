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
 * <p>Java class for PmtEnclRsMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclRsMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclAddRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclModRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclCanRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclRevRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclInqRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclAdviseRs"/&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclStatusModRs"/&gt;
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
@XmlType(name = "PmtEnclRsMsg_Type", propOrder = {
    "msgRecDt",
    "pmtEnclAddRs",
    "pmtEnclModRs",
    "pmtEnclCanRs",
    "pmtEnclRevRs",
    "pmtEnclInqRs",
    "pmtEnclAdviseRs",
    "pmtEnclStatusModRs"
})
public class PmtEnclRsMsgType {

    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "PmtEnclAddRs")
    protected PmtEnclAddRsType pmtEnclAddRs;
    @XmlElement(name = "PmtEnclModRs")
    protected PmtEnclModRsType pmtEnclModRs;
    @XmlElement(name = "PmtEnclCanRs")
    protected PmtEnclCanRsType pmtEnclCanRs;
    @XmlElement(name = "PmtEnclRevRs")
    protected PmtEnclRevRsType pmtEnclRevRs;
    @XmlElement(name = "PmtEnclInqRs")
    protected PmtEnclInqRsType pmtEnclInqRs;
    @XmlElement(name = "PmtEnclAdviseRs")
    protected PmtEnclAdviseRsType pmtEnclAdviseRs;
    @XmlElement(name = "PmtEnclStatusModRs")
    protected PmtEnclStatusModRsType pmtEnclStatusModRs;

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
     * Gets the value of the pmtEnclAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclAddRsType }
     *     
     */
    public PmtEnclAddRsType getPmtEnclAddRs() {
        return pmtEnclAddRs;
    }

    /**
     * Sets the value of the pmtEnclAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclAddRsType }
     *     
     */
    public void setPmtEnclAddRs(PmtEnclAddRsType value) {
        this.pmtEnclAddRs = value;
    }

    /**
     * Gets the value of the pmtEnclModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclModRsType }
     *     
     */
    public PmtEnclModRsType getPmtEnclModRs() {
        return pmtEnclModRs;
    }

    /**
     * Sets the value of the pmtEnclModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclModRsType }
     *     
     */
    public void setPmtEnclModRs(PmtEnclModRsType value) {
        this.pmtEnclModRs = value;
    }

    /**
     * Gets the value of the pmtEnclCanRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclCanRsType }
     *     
     */
    public PmtEnclCanRsType getPmtEnclCanRs() {
        return pmtEnclCanRs;
    }

    /**
     * Sets the value of the pmtEnclCanRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclCanRsType }
     *     
     */
    public void setPmtEnclCanRs(PmtEnclCanRsType value) {
        this.pmtEnclCanRs = value;
    }

    /**
     * Gets the value of the pmtEnclRevRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclRevRsType }
     *     
     */
    public PmtEnclRevRsType getPmtEnclRevRs() {
        return pmtEnclRevRs;
    }

    /**
     * Sets the value of the pmtEnclRevRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclRevRsType }
     *     
     */
    public void setPmtEnclRevRs(PmtEnclRevRsType value) {
        this.pmtEnclRevRs = value;
    }

    /**
     * Gets the value of the pmtEnclInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclInqRsType }
     *     
     */
    public PmtEnclInqRsType getPmtEnclInqRs() {
        return pmtEnclInqRs;
    }

    /**
     * Sets the value of the pmtEnclInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclInqRsType }
     *     
     */
    public void setPmtEnclInqRs(PmtEnclInqRsType value) {
        this.pmtEnclInqRs = value;
    }

    /**
     * Gets the value of the pmtEnclAdviseRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclAdviseRsType }
     *     
     */
    public PmtEnclAdviseRsType getPmtEnclAdviseRs() {
        return pmtEnclAdviseRs;
    }

    /**
     * Sets the value of the pmtEnclAdviseRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclAdviseRsType }
     *     
     */
    public void setPmtEnclAdviseRs(PmtEnclAdviseRsType value) {
        this.pmtEnclAdviseRs = value;
    }

    /**
     * Gets the value of the pmtEnclStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclStatusModRsType }
     *     
     */
    public PmtEnclStatusModRsType getPmtEnclStatusModRs() {
        return pmtEnclStatusModRs;
    }

    /**
     * Sets the value of the pmtEnclStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclStatusModRsType }
     *     
     */
    public void setPmtEnclStatusModRs(PmtEnclStatusModRsType value) {
        this.pmtEnclStatusModRs = value;
    }

}
