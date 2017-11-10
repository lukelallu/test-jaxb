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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PersonData"/&gt;
 *           &lt;element ref="{IFX2_3}OrgData"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}DebtorAcctNumWithCreditor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorData_Type", propOrder = {
    "personData",
    "orgData",
    "debtorAcctNumWithCreditor"
})
@XmlSeeAlso({
    UltimateDebtorDataType.class
})
public class DebtorDataType {

    @XmlElement(name = "PersonData")
    protected PersonDataType personData;
    @XmlElement(name = "OrgData")
    protected OrgDataType orgData;
    @XmlElement(name = "DebtorAcctNumWithCreditor")
    protected String debtorAcctNumWithCreditor;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDataType }
     *     
     */
    public PersonDataType getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDataType }
     *     
     */
    public void setPersonData(PersonDataType value) {
        this.personData = value;
    }

    /**
     * Gets the value of the orgData property.
     * 
     * @return
     *     possible object is
     *     {@link OrgDataType }
     *     
     */
    public OrgDataType getOrgData() {
        return orgData;
    }

    /**
     * Sets the value of the orgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgDataType }
     *     
     */
    public void setOrgData(OrgDataType value) {
        this.orgData = value;
    }

    /**
     * Gets the value of the debtorAcctNumWithCreditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAcctNumWithCreditor() {
        return debtorAcctNumWithCreditor;
    }

    /**
     * Sets the value of the debtorAcctNumWithCreditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAcctNumWithCreditor(String value) {
        this.debtorAcctNumWithCreditor = value;
    }

}