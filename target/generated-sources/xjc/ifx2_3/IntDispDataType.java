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
 * <p>Java class for IntDispData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntDispData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}IntDisposition"/&gt;
 *         &lt;element ref="{IFX2_3}IntDistAcctRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntDispData_Type", propOrder = {
    "intDisposition",
    "intDistAcctRef"
})
public class IntDispDataType {

    @XmlElement(name = "IntDisposition", required = true)
    protected String intDisposition;
    @XmlElement(name = "IntDistAcctRef")
    protected IntDistAcctRefType intDistAcctRef;

    /**
     * Gets the value of the intDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDisposition() {
        return intDisposition;
    }

    /**
     * Sets the value of the intDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDisposition(String value) {
        this.intDisposition = value;
    }

    /**
     * Gets the value of the intDistAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link IntDistAcctRefType }
     *     
     */
    public IntDistAcctRefType getIntDistAcctRef() {
        return intDistAcctRef;
    }

    /**
     * Sets the value of the intDistAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDistAcctRefType }
     *     
     */
    public void setIntDistAcctRef(IntDistAcctRefType value) {
        this.intDistAcctRef = value;
    }

}
