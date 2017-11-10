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
 * <p>Java class for PartySvcRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySvcRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PartySvcRelId"/&gt;
 *         &lt;element ref="{IFX2_3}PartySvcRelInfo"/&gt;
 *         &lt;element ref="{IFX2_3}PartySvcRelEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PartySvcRelAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PartySvcRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartySvcRelRec_Type", propOrder = {
    "svcIdent",
    "partySvcRelId",
    "partySvcRelInfo",
    "partySvcRelEnvr",
    "partySvcRelAuth",
    "partySvcRelStatus"
})
public class PartySvcRelRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "PartySvcRelId", required = true)
    protected String partySvcRelId;
    @XmlElement(name = "PartySvcRelInfo", required = true)
    protected PartySvcRelInfoType partySvcRelInfo;
    @XmlElement(name = "PartySvcRelEnvr")
    protected PartySvcRelEnvrType partySvcRelEnvr;
    @XmlElement(name = "PartySvcRelAuth")
    protected PartySvcRelAuthType partySvcRelAuth;
    @XmlElement(name = "PartySvcRelStatus", required = true)
    protected PartySvcRelStatusType partySvcRelStatus;

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
     * Gets the value of the partySvcRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySvcRelId() {
        return partySvcRelId;
    }

    /**
     * Sets the value of the partySvcRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySvcRelId(String value) {
        this.partySvcRelId = value;
    }

    /**
     * Gets the value of the partySvcRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartySvcRelInfoType }
     *     
     */
    public PartySvcRelInfoType getPartySvcRelInfo() {
        return partySvcRelInfo;
    }

    /**
     * Sets the value of the partySvcRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySvcRelInfoType }
     *     
     */
    public void setPartySvcRelInfo(PartySvcRelInfoType value) {
        this.partySvcRelInfo = value;
    }

    /**
     * Gets the value of the partySvcRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartySvcRelEnvrType }
     *     
     */
    public PartySvcRelEnvrType getPartySvcRelEnvr() {
        return partySvcRelEnvr;
    }

    /**
     * Sets the value of the partySvcRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySvcRelEnvrType }
     *     
     */
    public void setPartySvcRelEnvr(PartySvcRelEnvrType value) {
        this.partySvcRelEnvr = value;
    }

    /**
     * Gets the value of the partySvcRelAuth property.
     * 
     * @return
     *     possible object is
     *     {@link PartySvcRelAuthType }
     *     
     */
    public PartySvcRelAuthType getPartySvcRelAuth() {
        return partySvcRelAuth;
    }

    /**
     * Sets the value of the partySvcRelAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySvcRelAuthType }
     *     
     */
    public void setPartySvcRelAuth(PartySvcRelAuthType value) {
        this.partySvcRelAuth = value;
    }

    /**
     * Gets the value of the partySvcRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartySvcRelStatusType }
     *     
     */
    public PartySvcRelStatusType getPartySvcRelStatus() {
        return partySvcRelStatus;
    }

    /**
     * Sets the value of the partySvcRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySvcRelStatusType }
     *     
     */
    public void setPartySvcRelStatus(PartySvcRelStatusType value) {
        this.partySvcRelStatus = value;
    }

}
