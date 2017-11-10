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
 * <p>Java class for PaymentSchemeChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSchemeChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:swift:xsd:pain.001.001.01}CashClearingSystem2Code"/&gt;
 *         &lt;element name="PrtryInf" type="{urn:swift:xsd:pain.001.001.01}Max35Text"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchemeChoice", propOrder = {
    "cd",
    "prtryInf"
})
public class PaymentSchemeChoice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected CashClearingSystem2Code cd;
    @XmlElement(name = "PrtryInf")
    protected String prtryInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link CashClearingSystem2Code }
     *     
     */
    public CashClearingSystem2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashClearingSystem2Code }
     *     
     */
    public void setCd(CashClearingSystem2Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtryInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryInf() {
        return prtryInf;
    }

    /**
     * Sets the value of the prtryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryInf(String value) {
        this.prtryInf = value;
    }

}
