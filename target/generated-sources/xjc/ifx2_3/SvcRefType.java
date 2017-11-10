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
 * <p>Java class for SvcRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}SvcKeys"/&gt;
 *         &lt;element ref="{IFX2_3}SvcRec"/&gt;
 *         &lt;element ref="{IFX2_3}SvcInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcRef_Type", propOrder = {
    "svcKeys",
    "svcRec",
    "svcInfo"
})
public class SvcRefType {

    @XmlElement(name = "SvcKeys")
    protected SvcKeysType svcKeys;
    @XmlElement(name = "SvcRec")
    protected SvcRecType svcRec;
    @XmlElement(name = "SvcInfo")
    protected SvcInfoType svcInfo;

    /**
     * Gets the value of the svcKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SvcKeysType }
     *     
     */
    public SvcKeysType getSvcKeys() {
        return svcKeys;
    }

    /**
     * Sets the value of the svcKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcKeysType }
     *     
     */
    public void setSvcKeys(SvcKeysType value) {
        this.svcKeys = value;
    }

    /**
     * Gets the value of the svcRec property.
     * 
     * @return
     *     possible object is
     *     {@link SvcRecType }
     *     
     */
    public SvcRecType getSvcRec() {
        return svcRec;
    }

    /**
     * Sets the value of the svcRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcRecType }
     *     
     */
    public void setSvcRec(SvcRecType value) {
        this.svcRec = value;
    }

    /**
     * Gets the value of the svcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcInfoType }
     *     
     */
    public SvcInfoType getSvcInfo() {
        return svcInfo;
    }

    /**
     * Sets the value of the svcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcInfoType }
     *     
     */
    public void setSvcInfo(SvcInfoType value) {
        this.svcInfo = value;
    }

}
