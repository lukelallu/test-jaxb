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
 * <p>Java class for PmtBatchRqMsg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchRqMsg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}PmtBatchAddRq"/&gt;
 *         &lt;element ref="{IFX2_3}PmtBatchCanRq"/&gt;
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
@XmlType(name = "PmtBatchRqMsg_Type", propOrder = {
    "pmtBatchAddRq",
    "pmtBatchCanRq",
    "revRqUID"
})
public class PmtBatchRqMsgType {

    @XmlElement(name = "PmtBatchAddRq")
    protected PmtBatchAddRqType pmtBatchAddRq;
    @XmlElement(name = "PmtBatchCanRq")
    protected PmtBatchCanRqType pmtBatchCanRq;
    @XmlElement(name = "RevRqUID")
    protected String revRqUID;

    /**
     * Gets the value of the pmtBatchAddRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchAddRqType }
     *     
     */
    public PmtBatchAddRqType getPmtBatchAddRq() {
        return pmtBatchAddRq;
    }

    /**
     * Sets the value of the pmtBatchAddRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchAddRqType }
     *     
     */
    public void setPmtBatchAddRq(PmtBatchAddRqType value) {
        this.pmtBatchAddRq = value;
    }

    /**
     * Gets the value of the pmtBatchCanRq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchCanRqType }
     *     
     */
    public PmtBatchCanRqType getPmtBatchCanRq() {
        return pmtBatchCanRq;
    }

    /**
     * Sets the value of the pmtBatchCanRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchCanRqType }
     *     
     */
    public void setPmtBatchCanRq(PmtBatchCanRqType value) {
        this.pmtBatchCanRq = value;
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
