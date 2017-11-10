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
 * <p>Java class for CardAcctRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}BaseKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}CardAcctRelId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{IFX2_3}CardKeys"/&gt;
 *             &lt;element ref="{IFX2_3}AcctKeys"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctRelKeys_Type", propOrder = {
    "svcIdent",
    "cardAcctRelId",
    "cardKeys",
    "acctKeys"
})
public class CardAcctRelKeysType
    extends BaseKeysType
{

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "CardAcctRelId")
    protected String cardAcctRelId;
    @XmlElement(name = "CardKeys")
    protected CardKeysType cardKeys;
    @XmlElement(name = "AcctKeys")
    protected AcctKeysType acctKeys;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the cardAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcctRelId() {
        return cardAcctRelId;
    }

    /**
     * Sets the value of the cardAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcctRelId(String value) {
        this.cardAcctRelId = value;
    }

    /**
     * Gets the value of the cardKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CardKeysType }
     *     
     */
    public CardKeysType getCardKeys() {
        return cardKeys;
    }

    /**
     * Sets the value of the cardKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardKeysType }
     *     
     */
    public void setCardKeys(CardKeysType value) {
        this.cardKeys = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setAcctKeys(AcctKeysType value) {
        this.acctKeys = value;
    }

}
