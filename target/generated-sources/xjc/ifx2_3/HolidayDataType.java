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
 * <p>Java class for HolidayData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HolidayData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}Name"/&gt;
 *         &lt;element ref="{IFX2_3}HolidayTimeframe"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolidayData_Type", propOrder = {
    "name",
    "holidayTimeframe"
})
public class HolidayDataType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "HolidayTimeframe", required = true)
    protected HolidayTimeframeType holidayTimeframe;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the holidayTimeframe property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayTimeframeType }
     *     
     */
    public HolidayTimeframeType getHolidayTimeframe() {
        return holidayTimeframe;
    }

    /**
     * Sets the value of the holidayTimeframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayTimeframeType }
     *     
     */
    public void setHolidayTimeframe(HolidayTimeframeType value) {
        this.holidayTimeframe = value;
    }

}
