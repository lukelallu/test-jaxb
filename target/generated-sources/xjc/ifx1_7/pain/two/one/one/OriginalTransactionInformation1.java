//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.two.one.one;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalTransactionInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalTransactionInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{urn:swift:xsd:pain.002.001.01}AmountType1Choice"/&gt;
 *         &lt;element name="Cdtr" type="{urn:swift:xsd:pain.002.001.01}PartyIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="CdtrAcct" type="{urn:swift:xsd:pain.002.001.01}CashAccount3" minOccurs="0"/&gt;
 *         &lt;element name="FnlAgt" type="{urn:swift:xsd:pain.002.001.01}BranchAndFinancialInstitutionIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionInformation1", propOrder = {
    "amt",
    "cdtr",
    "cdtrAcct",
    "fnlAgt"
})
public class OriginalTransactionInformation1 {

    @XmlElement(name = "Amt", required = true)
    protected AmountType1Choice amt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification1 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount3 cdtrAcct;
    @XmlElement(name = "FnlAgt")
    protected BranchAndFinancialInstitutionIdentification fnlAgt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType1Choice }
     *     
     */
    public AmountType1Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType1Choice }
     *     
     */
    public void setAmt(AmountType1Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public void setCdtr(PartyIdentification1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public void setCdtrAcct(CashAccount3 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setFnlAgt(BranchAndFinancialInstitutionIdentification value) {
        this.fnlAgt = value;
    }

}