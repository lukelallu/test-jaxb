//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}ProductIdent"/&gt;
 *         &lt;element ref="{IFX2_3}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}IntRateData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RateChange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateInfo_Type", propOrder = {
    "productIdent",
    "acctType",
    "term",
    "intRateData",
    "rateChange"
})
public class ProdIntRateInfoType {

    @XmlElement(name = "ProductIdent", required = true)
    protected String productIdent;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "IntRateData")
    protected List<IntRateDataType> intRateData;
    @XmlElement(name = "RateChange")
    protected RateChangeType rateChange;

    /**
     * Gets the value of the productIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdent() {
        return productIdent;
    }

    /**
     * Sets the value of the productIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdent(String value) {
        this.productIdent = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the intRateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intRateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntRateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntRateDataType }
     * 
     * 
     */
    public List<IntRateDataType> getIntRateData() {
        if (intRateData == null) {
            intRateData = new ArrayList<IntRateDataType>();
        }
        return this.intRateData;
    }

    /**
     * Gets the value of the rateChange property.
     * 
     * @return
     *     possible object is
     *     {@link RateChangeType }
     *     
     */
    public RateChangeType getRateChange() {
        return rateChange;
    }

    /**
     * Sets the value of the rateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateChangeType }
     *     
     */
    public void setRateChange(RateChangeType value) {
        this.rateChange = value;
    }

}