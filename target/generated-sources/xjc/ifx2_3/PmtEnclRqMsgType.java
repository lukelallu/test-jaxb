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
 * <p>Java class for PmtEnclRqMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclRqMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclAddRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclModRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclCanRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclInqRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclAdviseRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclAudRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclStatusModRq"/&gt;
 *         &lt;element ref="{IFX2_3}RevRqUID" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclRqMsg_Type", propOrder = {
    "pmtEnclAddRq",
    "pmtEnclModRq",
    "pmtEnclCanRq",
    "pmtEnclInqRq",
    "pmtEnclAdviseRq",
    "pmtEnclAudRq",
    "pmtEnclStatusModRq",
    "revRqUID"
})
public class PmtEnclRqMsgType {

    @XmlElement(name = "PmtEnclAddRq")
    protected PmtEnclAddRqType pmtEnclAddRq;
    @XmlElement(name = "PmtEnclModRq")
    protected PmtEnclModRqType pmtEnclModRq;
    @XmlElement(name = "PmtEnclCanRq")
    protected PmtEnclCanRqType pmtEnclCanRq;
    @XmlElement(name = "PmtEnclInqRq")
    protected PmtEnclInqRqType pmtEnclInqRq;
    @XmlElement(name = "PmtEnclAdviseRq")
    protected PmtEnclAdviseRqType pmtEnclAdviseRq;
    @XmlElement(name = "PmtEnclAudRq")
    protected PmtEnclAudRqType pmtEnclAudRq;
    @XmlElement(name = "PmtEnclStatusModRq")
    protected PmtEnclStatusModRqType pmtEnclStatusModRq;
    @XmlElement(name = "RevRqUID")
    protected String revRqUID;

    /**
     * Gets the value of the pmtEnclAddRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclAddRqType }
     *     
     */
    public PmtEnclAddRqType getPmtEnclAddRq() {
        return pmtEnclAddRq;
    }

    /**
     * Sets the value of the pmtEnclAddRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclAddRqType }
     *     
     */
    public void setPmtEnclAddRq(PmtEnclAddRqType value) {
        this.pmtEnclAddRq = value;
    }

    /**
     * Gets the value of the pmtEnclModRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclModRqType }
     *     
     */
    public PmtEnclModRqType getPmtEnclModRq() {
        return pmtEnclModRq;
    }

    /**
     * Sets the value of the pmtEnclModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclModRqType }
     *     
     */
    public void setPmtEnclModRq(PmtEnclModRqType value) {
        this.pmtEnclModRq = value;
    }

    /**
     * Gets the value of the pmtEnclCanRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclCanRqType }
     *     
     */
    public PmtEnclCanRqType getPmtEnclCanRq() {
        return pmtEnclCanRq;
    }

    /**
     * Sets the value of the pmtEnclCanRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclCanRqType }
     *     
     */
    public void setPmtEnclCanRq(PmtEnclCanRqType value) {
        this.pmtEnclCanRq = value;
    }

    /**
     * Gets the value of the pmtEnclInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclInqRqType }
     *     
     */
    public PmtEnclInqRqType getPmtEnclInqRq() {
        return pmtEnclInqRq;
    }

    /**
     * Sets the value of the pmtEnclInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclInqRqType }
     *     
     */
    public void setPmtEnclInqRq(PmtEnclInqRqType value) {
        this.pmtEnclInqRq = value;
    }

    /**
     * Gets the value of the pmtEnclAdviseRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclAdviseRqType }
     *     
     */
    public PmtEnclAdviseRqType getPmtEnclAdviseRq() {
        return pmtEnclAdviseRq;
    }

    /**
     * Sets the value of the pmtEnclAdviseRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclAdviseRqType }
     *     
     */
    public void setPmtEnclAdviseRq(PmtEnclAdviseRqType value) {
        this.pmtEnclAdviseRq = value;
    }

    /**
     * Gets the value of the pmtEnclAudRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclAudRqType }
     *     
     */
    public PmtEnclAudRqType getPmtEnclAudRq() {
        return pmtEnclAudRq;
    }

    /**
     * Sets the value of the pmtEnclAudRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclAudRqType }
     *     
     */
    public void setPmtEnclAudRq(PmtEnclAudRqType value) {
        this.pmtEnclAudRq = value;
    }

    /**
     * Gets the value of the pmtEnclStatusModRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclStatusModRqType }
     *     
     */
    public PmtEnclStatusModRqType getPmtEnclStatusModRq() {
        return pmtEnclStatusModRq;
    }

    /**
     * Sets the value of the pmtEnclStatusModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclStatusModRqType }
     *     
     */
    public void setPmtEnclStatusModRq(PmtEnclStatusModRqType value) {
        this.pmtEnclStatusModRq = value;
    }

    /**
     * Gets the value of the revRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevRqUID() {
        return revRqUID;
    }

    /**
     * Sets the value of the revRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevRqUID(String value) {
        this.revRqUID = value;
    }

}
