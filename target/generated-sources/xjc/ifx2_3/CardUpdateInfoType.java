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
 * <p>Java class for CardUpdateInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardUpdateInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}CardRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardUpdateInfo_Type", propOrder = {
    "cardRef"
})
@XmlSeeAlso({
    ICCUpdateInfoType.class,
    MagCardUpdateInfoType.class
})
public class CardUpdateInfoType {

    @XmlElement(name = "CardRef")
    protected CardRefType cardRef;

    /**
     * Gets the value of the cardRef property.
     * 
     * @return
     *     possible object is
     *     {@link CardRefType }
     *     
     */
    public CardRefType getCardRef() {
        return cardRef;
    }

    /**
     * Sets the value of the cardRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRefType }
     *     
     */
    public void setCardRef(CardRefType value) {
        this.cardRef = value;
    }

}