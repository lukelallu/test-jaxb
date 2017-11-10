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
 * <p>Java class for ChksumStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChksumStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChksumId"/&gt;
 *         &lt;element ref="{IFX2_3}ChksumStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChksumStatusRec_Type", propOrder = {
    "svcIdent",
    "chksumId",
    "chksumStatus"
})
public class ChksumStatusRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "ChksumId", required = true)
    protected String chksumId;
    @XmlElement(name = "ChksumStatus", required = true)
    protected ChksumStatusType chksumStatus;

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
     * Gets the value of the chksumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChksumId() {
        return chksumId;
    }

    /**
     * Sets the value of the chksumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChksumId(String value) {
        this.chksumId = value;
    }

    /**
     * Gets the value of the chksumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumStatusType }
     *     
     */
    public ChksumStatusType getChksumStatus() {
        return chksumStatus;
    }

    /**
     * Sets the value of the chksumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumStatusType }
     *     
     */
    public void setChksumStatus(ChksumStatusType value) {
        this.chksumStatus = value;
    }

}
