//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.eight.one.one;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryAuthority"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthrtyNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="AuthrtyCtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.01}CountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryAuthority", propOrder = {
    "authrtyNm",
    "authrtyCtry"
})
public class RegulatoryAuthority {

    @XmlElement(name = "AuthrtyNm")
    protected String authrtyNm;
    @XmlElement(name = "AuthrtyCtry")
    protected String authrtyCtry;

    /**
     * Gets the value of the authrtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyNm() {
        return authrtyNm;
    }

    /**
     * Sets the value of the authrtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyNm(String value) {
        this.authrtyNm = value;
    }

    /**
     * Gets the value of the authrtyCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyCtry() {
        return authrtyCtry;
    }

    /**
     * Sets the value of the authrtyCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyCtry(String value) {
        this.authrtyCtry = value;
    }

}
