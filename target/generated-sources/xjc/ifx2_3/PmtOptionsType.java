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
 * <p>Java class for PmtOptions_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtOptions_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PmtInstType"/&gt;
 *         &lt;element ref="{IFX2_3}Brand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtOptions_Type", propOrder = {
    "pmtInstType",
    "brand"
})
public class PmtOptionsType {

    @XmlElement(name = "PmtInstType", required = true)
    @XmlSchemaType(name = "string")
    protected PmtInstTypeType pmtInstType;
    @XmlElement(name = "Brand")
    protected String brand;

    /**
     * Gets the value of the pmtInstType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtInstTypeType }
     *     
     */
    public PmtInstTypeType getPmtInstType() {
        return pmtInstType;
    }

    /**
     * Sets the value of the pmtInstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtInstTypeType }
     *     
     */
    public void setPmtInstType(PmtInstTypeType value) {
        this.pmtInstType = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

}
