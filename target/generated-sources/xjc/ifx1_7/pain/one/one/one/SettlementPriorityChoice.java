//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.one.one.one;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementPriorityChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPriorityChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Prty" type="{urn:swift:xsd:pain.001.001.01}Priority2Code"/&gt;
 *         &lt;element name="PmtSchme" type="{urn:swift:xsd:pain.001.001.01}PaymentSchemeChoice"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementPriorityChoice", propOrder = {
    "prty",
    "pmtSchme"
})
public class SettlementPriorityChoice {

    @XmlElement(name = "Prty")
    @XmlSchemaType(name = "string")
    protected Priority2Code prty;
    @XmlElement(name = "PmtSchme")
    protected PaymentSchemeChoice pmtSchme;

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setPrty(Priority2Code value) {
        this.prty = value;
    }

    /**
     * Gets the value of the pmtSchme property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSchemeChoice }
     *     
     */
    public PaymentSchemeChoice getPmtSchme() {
        return pmtSchme;
    }

    /**
     * Sets the value of the pmtSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSchemeChoice }
     *     
     */
    public void setPmtSchme(PaymentSchemeChoice value) {
        this.pmtSchme = value;
    }

}
