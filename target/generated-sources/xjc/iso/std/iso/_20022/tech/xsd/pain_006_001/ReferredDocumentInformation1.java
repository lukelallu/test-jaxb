//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package iso.std.iso._20022.tech.xsd.pain_006_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferredDocumentInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfrdDocTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.006.001.01}ReferredDocumentType1" minOccurs="0"/&gt;
 *         &lt;element name="RfrdDocNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.006.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation1", propOrder = {
    "rfrdDocTp",
    "rfrdDocNb"
})
public class ReferredDocumentInformation1 {

    @XmlElement(name = "RfrdDocTp")
    protected ReferredDocumentType1 rfrdDocTp;
    @XmlElement(name = "RfrdDocNb")
    protected String rfrdDocNb;

    /**
     * Gets the value of the rfrdDocTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public ReferredDocumentType1 getRfrdDocTp() {
        return rfrdDocTp;
    }

    /**
     * Sets the value of the rfrdDocTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public void setRfrdDocTp(ReferredDocumentType1 value) {
        this.rfrdDocTp = value;
    }

    /**
     * Gets the value of the rfrdDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrdDocNb() {
        return rfrdDocNb;
    }

    /**
     * Sets the value of the rfrdDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrdDocNb(String value) {
        this.rfrdDocNb = value;
    }

}