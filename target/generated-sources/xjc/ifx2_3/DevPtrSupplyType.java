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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrSupply_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPtrSupply_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevPtrSupplyLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevPtrSupplyLevel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPtrSupply_Type", propOrder = {
    "devPtrSupplyLocation",
    "devPtrSupplyLevel"
})
public class DevPtrSupplyType {

    @XmlElement(name = "DevPtrSupplyLocation")
    protected String devPtrSupplyLocation;
    @XmlElement(name = "DevPtrSupplyLevel", required = true)
    @XmlSchemaType(name = "string")
    protected DevPtrSupplyLevelType devPtrSupplyLevel;

    /**
     * Gets the value of the devPtrSupplyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPtrSupplyLocation() {
        return devPtrSupplyLocation;
    }

    /**
     * Sets the value of the devPtrSupplyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPtrSupplyLocation(String value) {
        this.devPtrSupplyLocation = value;
    }

    /**
     * Gets the value of the devPtrSupplyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrSupplyLevelType }
     *     
     */
    public DevPtrSupplyLevelType getDevPtrSupplyLevel() {
        return devPtrSupplyLevel;
    }

    /**
     * Sets the value of the devPtrSupplyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrSupplyLevelType }
     *     
     */
    public void setDevPtrSupplyLevel(DevPtrSupplyLevelType value) {
        this.devPtrSupplyLevel = value;
    }

}
