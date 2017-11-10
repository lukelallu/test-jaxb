//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}PartyRef"/&gt;
 *         &lt;element ref="{IFX2_3}AcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PartyAcctRelData" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{IFX2_3}OwnerPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OwnerInd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Nickname" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelInfo_Type", propOrder = {
    "partyRef",
    "acctRef",
    "partyAcctRelData",
    "ownerPercent",
    "ownerInd",
    "nickname"
})
public class PartyAcctRelInfoType {

    @XmlElement(name = "PartyRef", required = true)
    protected PartyRefType partyRef;
    @XmlElement(name = "AcctRef")
    protected AcctRefType acctRef;
    @XmlElement(name = "PartyAcctRelData", required = true)
    protected List<PartyAcctRelDataType> partyAcctRelData;
    @XmlElement(name = "OwnerPercent")
    protected BigDecimal ownerPercent;
    @XmlElement(name = "OwnerInd")
    protected Boolean ownerInd;
    @XmlElement(name = "Nickname")
    protected String nickname;

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the partyAcctRelData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAcctRelData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAcctRelData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAcctRelDataType }
     * 
     * 
     */
    public List<PartyAcctRelDataType> getPartyAcctRelData() {
        if (partyAcctRelData == null) {
            partyAcctRelData = new ArrayList<PartyAcctRelDataType>();
        }
        return this.partyAcctRelData;
    }

    /**
     * Gets the value of the ownerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerPercent() {
        return ownerPercent;
    }

    /**
     * Sets the value of the ownerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerPercent(BigDecimal value) {
        this.ownerPercent = value;
    }

    /**
     * Gets the value of the ownerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerInd() {
        return ownerInd;
    }

    /**
     * Sets the value of the ownerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerInd(Boolean value) {
        this.ownerInd = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

}
