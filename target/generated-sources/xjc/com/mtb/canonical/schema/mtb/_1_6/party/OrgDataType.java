//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_6.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ifx2_3.OrgCategoryType;


/**
 * <p>Java class for OrgData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}OrgName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OrgCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Department" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Division" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}Region" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}OrgId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgData_Type", propOrder = {
    "orgName",
    "orgCategory",
    "department",
    "division",
    "region",
    "orgId"
})
public class OrgDataType
    extends PartyDataType
{

    @XmlElement(name = "OrgName")
    protected List<OrgNameType> orgName;
    @XmlElement(name = "OrgCategory", namespace = "IFX2_3")
    protected OrgCategoryType orgCategory;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "OrgId")
    protected Integer orgId;

    /**
     * Gets the value of the orgName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgNameType }
     * 
     * 
     */
    public List<OrgNameType> getOrgName() {
        if (orgName == null) {
            orgName = new ArrayList<OrgNameType>();
        }
        return this.orgName;
    }

    /**
     * Gets the value of the orgCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OrgCategoryType }
     *     
     */
    public OrgCategoryType getOrgCategory() {
        return orgCategory;
    }

    /**
     * Sets the value of the orgCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgCategoryType }
     *     
     */
    public void setOrgCategory(OrgCategoryType value) {
        this.orgCategory = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrgId(Integer value) {
        this.orgId = value;
    }

}
