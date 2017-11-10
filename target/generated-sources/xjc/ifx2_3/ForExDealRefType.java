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
 * <p>Java class for ForExDealRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExDealRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}ForExDealKeys"/&gt;
 *         &lt;element ref="{IFX2_3}ForExDealRec"/&gt;
 *         &lt;element ref="{IFX2_3}ForExDealInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExDealRef_Type", propOrder = {
    "forExDealKeys",
    "forExDealRec",
    "forExDealInfo"
})
@XmlSeeAlso({
    RelatedForExDealRefType.class
})
public class ForExDealRefType {

    @XmlElement(name = "ForExDealKeys")
    protected ForExDealKeysType forExDealKeys;
    @XmlElement(name = "ForExDealRec")
    protected ForExDealRecType forExDealRec;
    @XmlElement(name = "ForExDealInfo")
    protected ForExDealInfoType forExDealInfo;

    /**
     * Gets the value of the forExDealKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealKeysType }
     *     
     */
    public ForExDealKeysType getForExDealKeys() {
        return forExDealKeys;
    }

    /**
     * Sets the value of the forExDealKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealKeysType }
     *     
     */
    public void setForExDealKeys(ForExDealKeysType value) {
        this.forExDealKeys = value;
    }

    /**
     * Gets the value of the forExDealRec property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealRecType }
     *     
     */
    public ForExDealRecType getForExDealRec() {
        return forExDealRec;
    }

    /**
     * Sets the value of the forExDealRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealRecType }
     *     
     */
    public void setForExDealRec(ForExDealRecType value) {
        this.forExDealRec = value;
    }

    /**
     * Gets the value of the forExDealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealInfoType }
     *     
     */
    public ForExDealInfoType getForExDealInfo() {
        return forExDealInfo;
    }

    /**
     * Sets the value of the forExDealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealInfoType }
     *     
     */
    public void setForExDealInfo(ForExDealInfoType value) {
        this.forExDealInfo = value;
    }

}
