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
 * <p>Java class for PassbkStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PassbkStatusCode"/&gt;
 *         &lt;element ref="{IFX2_3}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ApprovalIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StatusModBy" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PassbkNewItemsToPrint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkStatus_Type", propOrder = {
    "passbkStatusCode",
    "statusDesc",
    "effDt",
    "approvalIdent",
    "statusModBy",
    "passbkNewItemsToPrint"
})
public class PassbkStatusType {

    @XmlElement(name = "PassbkStatusCode", required = true)
    protected String passbkStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ApprovalIdent")
    protected String approvalIdent;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;
    @XmlElement(name = "PassbkNewItemsToPrint")
    protected Long passbkNewItemsToPrint;

    /**
     * Gets the value of the passbkStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkStatusCode() {
        return passbkStatusCode;
    }

    /**
     * Sets the value of the passbkStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkStatusCode(String value) {
        this.passbkStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the approvalIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalIdent() {
        return approvalIdent;
    }

    /**
     * Sets the value of the approvalIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalIdent(String value) {
        this.approvalIdent = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

    /**
     * Gets the value of the passbkNewItemsToPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkNewItemsToPrint() {
        return passbkNewItemsToPrint;
    }

    /**
     * Sets the value of the passbkNewItemsToPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkNewItemsToPrint(Long value) {
        this.passbkNewItemsToPrint = value;
    }

}
