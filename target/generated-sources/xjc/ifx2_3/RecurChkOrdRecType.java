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
 * <p>Java class for RecurChkOrdRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurChkOrdRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecurChkOrdId"/&gt;
 *         &lt;element ref="{IFX2_3}RecurChkOrdInfo"/&gt;
 *         &lt;element ref="{IFX2_3}RecurChkOrdEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecurChkOrdStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurChkOrdRec_Type", propOrder = {
    "svcIdent",
    "recurChkOrdId",
    "recurChkOrdInfo",
    "recurChkOrdEnvr",
    "recurChkOrdStatus"
})
public class RecurChkOrdRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "RecurChkOrdId", required = true)
    protected String recurChkOrdId;
    @XmlElement(name = "RecurChkOrdInfo", required = true)
    protected RecurChkOrdInfoType recurChkOrdInfo;
    @XmlElement(name = "RecurChkOrdEnvr")
    protected RecurChkOrdEnvrType recurChkOrdEnvr;
    @XmlElement(name = "RecurChkOrdStatus", required = true)
    protected RecurChkOrdStatusType recurChkOrdStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the recurChkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurChkOrdId() {
        return recurChkOrdId;
    }

    /**
     * Sets the value of the recurChkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurChkOrdId(String value) {
        this.recurChkOrdId = value;
    }

    /**
     * Gets the value of the recurChkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecurChkOrdInfoType }
     *     
     */
    public RecurChkOrdInfoType getRecurChkOrdInfo() {
        return recurChkOrdInfo;
    }

    /**
     * Sets the value of the recurChkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurChkOrdInfoType }
     *     
     */
    public void setRecurChkOrdInfo(RecurChkOrdInfoType value) {
        this.recurChkOrdInfo = value;
    }

    /**
     * Gets the value of the recurChkOrdEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link RecurChkOrdEnvrType }
     *     
     */
    public RecurChkOrdEnvrType getRecurChkOrdEnvr() {
        return recurChkOrdEnvr;
    }

    /**
     * Sets the value of the recurChkOrdEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurChkOrdEnvrType }
     *     
     */
    public void setRecurChkOrdEnvr(RecurChkOrdEnvrType value) {
        this.recurChkOrdEnvr = value;
    }

    /**
     * Gets the value of the recurChkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecurChkOrdStatusType }
     *     
     */
    public RecurChkOrdStatusType getRecurChkOrdStatus() {
        return recurChkOrdStatus;
    }

    /**
     * Sets the value of the recurChkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurChkOrdStatusType }
     *     
     */
    public void setRecurChkOrdStatus(RecurChkOrdStatusType value) {
        this.recurChkOrdStatus = value;
    }

}