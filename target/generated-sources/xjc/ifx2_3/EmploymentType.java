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
 * <p>Java class for Employment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}EmploymentType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OrgData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Occupation" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AnnualIncome" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}JobTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}TimeFrame" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employment_Type", propOrder = {
    "employmentType",
    "orgData",
    "occupation",
    "annualIncome",
    "jobTitle",
    "timeFrame"
})
public class EmploymentType {

    @XmlElement(name = "EmploymentType")
    protected String employmentType;
    @XmlElement(name = "OrgData")
    protected OrgDataType orgData;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "AnnualIncome")
    protected AnnualIncomeType annualIncome;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "TimeFrame")
    protected TimeFrameType timeFrame;

    /**
     * Gets the value of the employmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the value of the employmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentType(String value) {
        this.employmentType = value;
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
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the annualIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualIncomeType }
     *     
     */
    public AnnualIncomeType getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Sets the value of the annualIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualIncomeType }
     *     
     */
    public void setAnnualIncome(AnnualIncomeType value) {
        this.annualIncome = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrameType }
     *     
     */
    public TimeFrameType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrameType }
     *     
     */
    public void setTimeFrame(TimeFrameType value) {
        this.timeFrame = value;
    }

}