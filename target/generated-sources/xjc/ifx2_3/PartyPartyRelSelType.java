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
 * <p>Java class for PartyPartyRelSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}PartyPartyRelKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{IFX2_3}PartyKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}RelPartyKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}PartyRelName" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}PartyRelType" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}PartyRole" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}RelPartyRole" minOccurs="0"/&gt;
 *             &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelSel_Type", propOrder = {
    "partyPartyRelKeys",
    "partyKeys",
    "relPartyKeys",
    "partyRelName",
    "partyRelType",
    "partyRole",
    "relPartyRole",
    "dtRange"
})
public class PartyPartyRelSelType {

    @XmlElement(name = "PartyPartyRelKeys")
    protected PartyPartyRelKeysType partyPartyRelKeys;
    @XmlElement(name = "PartyKeys")
    protected PartyKeysType partyKeys;
    @XmlElement(name = "RelPartyKeys")
    protected RelPartyKeysType relPartyKeys;
    @XmlElement(name = "PartyRelName")
    protected String partyRelName;
    @XmlElement(name = "PartyRelType")
    protected String partyRelType;
    @XmlElement(name = "PartyRole")
    protected String partyRole;
    @XmlElement(name = "RelPartyRole")
    protected String relPartyRole;
    @XmlElement(name = "DtRange")
    protected DtRangeType dtRange;

    /**
     * Gets the value of the partyPartyRelKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelKeysType }
     *     
     */
    public PartyPartyRelKeysType getPartyPartyRelKeys() {
        return partyPartyRelKeys;
    }

    /**
     * Sets the value of the partyPartyRelKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelKeysType }
     *     
     */
    public void setPartyPartyRelKeys(PartyPartyRelKeysType value) {
        this.partyPartyRelKeys = value;
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
     * Gets the value of the relPartyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RelPartyKeysType }
     *     
     */
    public RelPartyKeysType getRelPartyKeys() {
        return relPartyKeys;
    }

    /**
     * Sets the value of the relPartyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelPartyKeysType }
     *     
     */
    public void setRelPartyKeys(RelPartyKeysType value) {
        this.relPartyKeys = value;
    }

    /**
     * Gets the value of the partyRelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelName() {
        return partyRelName;
    }

    /**
     * Sets the value of the partyRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelName(String value) {
        this.partyRelName = value;
    }

    /**
     * Gets the value of the partyRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelType() {
        return partyRelType;
    }

    /**
     * Sets the value of the partyRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelType(String value) {
        this.partyRelType = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRole(String value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the relPartyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelPartyRole() {
        return relPartyRole;
    }

    /**
     * Sets the value of the relPartyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelPartyRole(String value) {
        this.relPartyRole = value;
    }

    /**
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link DtRangeType }
     *     
     */
    public DtRangeType getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtRangeType }
     *     
     */
    public void setDtRange(DtRangeType value) {
        this.dtRange = value;
    }

}
