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
 * <p>Java class for ChkIssueRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChkIssueId"/&gt;
 *         &lt;element ref="{IFX2_3}ChkIssueInfo"/&gt;
 *         &lt;element ref="{IFX2_3}ChkIssueEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChkIssueStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueRec_Type", propOrder = {
    "svcIdent",
    "chkIssueId",
    "chkIssueInfo",
    "chkIssueEnvr",
    "chkIssueStatus"
})
public class ChkIssueRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "ChkIssueId", required = true)
    protected String chkIssueId;
    @XmlElement(name = "ChkIssueInfo", required = true)
    protected ChkIssueInfoType chkIssueInfo;
    @XmlElement(name = "ChkIssueEnvr")
    protected ChkIssueEnvrType chkIssueEnvr;
    @XmlElement(name = "ChkIssueStatus", required = true)
    protected ChkIssueStatusType chkIssueStatus;

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
     * Gets the value of the chkIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkIssueId() {
        return chkIssueId;
    }

    /**
     * Sets the value of the chkIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkIssueId(String value) {
        this.chkIssueId = value;
    }

    /**
     * Gets the value of the chkIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueInfoType }
     *     
     */
    public ChkIssueInfoType getChkIssueInfo() {
        return chkIssueInfo;
    }

    /**
     * Sets the value of the chkIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueInfoType }
     *     
     */
    public void setChkIssueInfo(ChkIssueInfoType value) {
        this.chkIssueInfo = value;
    }

    /**
     * Gets the value of the chkIssueEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueEnvrType }
     *     
     */
    public ChkIssueEnvrType getChkIssueEnvr() {
        return chkIssueEnvr;
    }

    /**
     * Sets the value of the chkIssueEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueEnvrType }
     *     
     */
    public void setChkIssueEnvr(ChkIssueEnvrType value) {
        this.chkIssueEnvr = value;
    }

    /**
     * Gets the value of the chkIssueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public ChkIssueStatusType getChkIssueStatus() {
        return chkIssueStatus;
    }

    /**
     * Sets the value of the chkIssueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public void setChkIssueStatus(ChkIssueStatusType value) {
        this.chkIssueStatus = value;
    }

}