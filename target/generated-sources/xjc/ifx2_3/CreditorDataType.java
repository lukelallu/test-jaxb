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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}PersonData"/&gt;
 *           &lt;element ref="{IFX2_3}OrgData"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}CreditorAcctNumWithDebtor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorData_Type", propOrder = {
    "personDataOrOrgData",
    "creditorAcctNumWithDebtor"
})
@XmlSeeAlso({
    UltimateCreditorDataType.class
})
public class CreditorDataType {

    @XmlElements({
        @XmlElement(name = "PersonData", type = PersonDataType.class),
        @XmlElement(name = "OrgData", type = OrgDataType.class)
    })
    protected List<PartyDataType> personDataOrOrgData;
    @XmlElement(name = "CreditorAcctNumWithDebtor")
    protected String creditorAcctNumWithDebtor;

    /**
     * Gets the value of the personDataOrOrgData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDataOrOrgData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDataOrOrgData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDataType }
     * {@link OrgDataType }
     * 
     * 
     */
    public List<PartyDataType> getPersonDataOrOrgData() {
        if (personDataOrOrgData == null) {
            personDataOrOrgData = new ArrayList<PartyDataType>();
        }
        return this.personDataOrOrgData;
    }

    /**
     * Gets the value of the creditorAcctNumWithDebtor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorAcctNumWithDebtor() {
        return creditorAcctNumWithDebtor;
    }

    /**
     * Sets the value of the creditorAcctNumWithDebtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorAcctNumWithDebtor(String value) {
        this.creditorAcctNumWithDebtor = value;
    }

}
