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
 * <p>Java class for AthEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AthEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}BaseEnvr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}AcctStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ExpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AthEnvr_Type", propOrder = {
    "acctStatusCode",
    "cardStatusCode",
    "expDt"
})
public class AthEnvrType
    extends BaseEnvrType
{

    @XmlElement(name = "AcctStatusCode")
    protected String acctStatusCode;
    @XmlElement(name = "CardStatusCode")
    protected String cardStatusCode;
    @XmlElement(name = "ExpDt")
    protected String expDt;

    /**
     * Gets the value of the acctStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatusCode() {
        return acctStatusCode;
    }

    /**
     * Sets the value of the acctStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatusCode(String value) {
        this.acctStatusCode = value;
    }

    /**
     * Gets the value of the cardStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusCode() {
        return cardStatusCode;
    }

    /**
     * Sets the value of the cardStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusCode(String value) {
        this.cardStatusCode = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

}