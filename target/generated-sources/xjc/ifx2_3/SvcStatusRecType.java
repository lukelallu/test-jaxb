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
 * <p>Java class for SvcStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}SvcId"/&gt;
 *         &lt;element ref="{IFX2_3}SvcStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcStatusRec_Type", propOrder = {
    "svcIdent",
    "svcId",
    "svcStatus"
})
public class SvcStatusRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "SvcId", required = true)
    protected String svcId;
    @XmlElement(name = "SvcStatus", required = true)
    protected SvcStatusType svcStatus;

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
     * Gets the value of the svcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * Sets the value of the svcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcId(String value) {
        this.svcId = value;
    }

    /**
     * Gets the value of the svcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SvcStatusType }
     *     
     */
    public SvcStatusType getSvcStatus() {
        return svcStatus;
    }

    /**
     * Sets the value of the svcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcStatusType }
     *     
     */
    public void setSvcStatus(SvcStatusType value) {
        this.svcStatus = value;
    }

}