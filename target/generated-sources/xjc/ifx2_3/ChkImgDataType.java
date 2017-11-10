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
 * <p>Java class for ChkImgData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkImgData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}CryptType"/&gt;
 *         &lt;element ref="{IFX2_3}SecObjId" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ChkImgFront"/&gt;
 *         &lt;element ref="{IFX2_3}ChkImgBack" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkImgData_Type", propOrder = {
    "cryptType",
    "secObjId",
    "chkImgFront",
    "chkImgBack"
})
public class ChkImgDataType {

    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "SecObjId")
    protected String secObjId;
    @XmlElement(name = "ChkImgFront", required = true)
    protected ChkImgFrontType chkImgFront;
    @XmlElement(name = "ChkImgBack")
    protected ChkImgBackType chkImgBack;

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the secObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjId() {
        return secObjId;
    }

    /**
     * Sets the value of the secObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjId(String value) {
        this.secObjId = value;
    }

    /**
     * Gets the value of the chkImgFront property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgFrontType }
     *     
     */
    public ChkImgFrontType getChkImgFront() {
        return chkImgFront;
    }

    /**
     * Sets the value of the chkImgFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgFrontType }
     *     
     */
    public void setChkImgFront(ChkImgFrontType value) {
        this.chkImgFront = value;
    }

    /**
     * Gets the value of the chkImgBack property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgBackType }
     *     
     */
    public ChkImgBackType getChkImgBack() {
        return chkImgBack;
    }

    /**
     * Sets the value of the chkImgBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgBackType }
     *     
     */
    public void setChkImgBack(ChkImgBackType value) {
        this.chkImgBack = value;
    }

}