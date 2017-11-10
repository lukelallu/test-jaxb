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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrcSched_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrcSched_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PrcDaysOff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CutoffTm"/&gt;
 *         &lt;element ref="{IFX2_3}PrcDtAdj"/&gt;
 *         &lt;element ref="{IFX2_3}HolidayData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrcSched_Type", propOrder = {
    "prcDaysOff",
    "cutoffTm",
    "prcDtAdj",
    "holidayData"
})
public class PrcSchedType {

    @XmlElement(name = "PrcDaysOff")
    @XmlSchemaType(name = "string")
    protected List<PrcDaysOffType> prcDaysOff;
    @XmlElement(name = "CutoffTm", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutoffTm;
    @XmlElement(name = "PrcDtAdj", required = true)
    protected String prcDtAdj;
    @XmlElement(name = "HolidayData")
    protected List<HolidayDataType> holidayData;

    /**
     * Gets the value of the prcDaysOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcDaysOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcDaysOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrcDaysOffType }
     * 
     * 
     */
    public List<PrcDaysOffType> getPrcDaysOff() {
        if (prcDaysOff == null) {
            prcDaysOff = new ArrayList<PrcDaysOffType>();
        }
        return this.prcDaysOff;
    }

    /**
     * Gets the value of the cutoffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffTm() {
        return cutoffTm;
    }

    /**
     * Sets the value of the cutoffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffTm(XMLGregorianCalendar value) {
        this.cutoffTm = value;
    }

    /**
     * Gets the value of the prcDtAdj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcDtAdj() {
        return prcDtAdj;
    }

    /**
     * Sets the value of the prcDtAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcDtAdj(String value) {
        this.prcDtAdj = value;
    }

    /**
     * Gets the value of the holidayData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayDataType }
     * 
     * 
     */
    public List<HolidayDataType> getHolidayData() {
        if (holidayData == null) {
            holidayData = new ArrayList<HolidayDataType>();
        }
        return this.holidayData;
    }

}