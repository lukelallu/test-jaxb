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
 * <p>Java class for PartySvcAcctRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySvcAcctRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}BaseKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{IFX2_3}PartySvcAcctRelId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{IFX2_3}PartyKeys"/&gt;
 *             &lt;element ref="{IFX2_3}SvcKeys"/&gt;
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
@XmlType(name = "PartySvcAcctRelKeys_Type", propOrder = {
    "svcIdent",
    "partySvcAcctRelId",
    "partyKeys",
    "svcKeys",
    "acctKeys"
})
public class PartySvcAcctRelKeysType
    extends BaseKeysType
{

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "PartySvcAcctRelId")
    protected String partySvcAcctRelId;
    @XmlElement(name = "PartyKeys")
    protected PartyKeysType partyKeys;
    @XmlElement(name = "SvcKeys")
    protected SvcKeysType svcKeys;
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
     * Gets the value of the partySvcAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySvcAcctRelId() {
        return partySvcAcctRelId;
    }

    /**
     * Sets the value of the partySvcAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySvcAcctRelId(String value) {
        this.partySvcAcctRelId = value;
    }

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PartyKeysType }
     *     
     */
    public PartyKeysType getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyKeysType }
     *     
     */
    public void setPartyKeys(PartyKeysType value) {
        this.partyKeys = value;
    }

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