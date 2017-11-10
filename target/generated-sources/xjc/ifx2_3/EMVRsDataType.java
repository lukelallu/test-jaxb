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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EMVRsData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMVRsData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}EMVRsRawData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}AuthRsCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMVRsData_Type", propOrder = {
    "emvRsRawData",
    "authRsCode"
})
public class EMVRsDataType {

    @XmlElement(name = "EMVRsRawData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] emvRsRawData;
    @XmlElement(name = "AuthRsCode", required = true)
    protected String authRsCode;

    /**
     * Gets the value of the emvRsRawData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEMVRsRawData() {
        return emvRsRawData;
    }

    /**
     * Sets the value of the emvRsRawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMVRsRawData(byte[] value) {
        this.emvRsRawData = value;
    }

    /**
     * Gets the value of the authRsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRsCode() {
        return authRsCode;
    }

    /**
     * Sets the value of the authRsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRsCode(String value) {
        this.authRsCode = value;
    }

}