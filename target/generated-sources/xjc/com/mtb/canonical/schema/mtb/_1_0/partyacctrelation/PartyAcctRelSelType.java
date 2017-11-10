//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_0.partyacctrelation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import ifx2_3.AcctKeysType;
import ifx2_3.AcctTypeType;
import ifx2_3.PartyAcctRelKeysType;


/**
 * <p>Java class for PartyAcctRelSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}PartyAcctRelKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.mtb.com/canonical/schema/mtb/1_0/PartyAcctRelation}PartyKeys" minOccurs="0"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element ref="{IFX2_3}AcctKeys"/&gt;
 *             &lt;element ref="{IFX2_3}AcctType"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{IFX2_3}PartyAcctRelType" minOccurs="0"/&gt;
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
@XmlType(name = "PartyAcctRelSel_Type", propOrder = {
    "partyAcctRelKeysOrPartyKeysAndAcctKeys"
})
public class PartyAcctRelSelType {

    @XmlElements({
        @XmlElement(name = "PartyAcctRelKeys", namespace = "IFX2_3", type = PartyAcctRelKeysType.class),
        @XmlElement(name = "PartyKeys", type = PartyKeysType.class),
        @XmlElement(name = "AcctKeys", namespace = "IFX2_3", type = AcctKeysType.class),
        @XmlElement(name = "AcctType", namespace = "IFX2_3", type = AcctTypeType.class),
        @XmlElement(name = "PartyAcctRelType", namespace = "IFX2_3", type = String.class)
    })
    protected List<Object> partyAcctRelKeysOrPartyKeysAndAcctKeys;

    /**
     * Gets the value of the partyAcctRelKeysOrPartyKeysAndAcctKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAcctRelKeysOrPartyKeysAndAcctKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAcctRelKeysOrPartyKeysAndAcctKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAcctRelKeysType }
     * {@link PartyKeysType }
     * {@link AcctKeysType }
     * {@link AcctTypeType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getPartyAcctRelKeysOrPartyKeysAndAcctKeys() {
        if (partyAcctRelKeysOrPartyKeysAndAcctKeys == null) {
            partyAcctRelKeysOrPartyKeysAndAcctKeys = new ArrayList<Object>();
        }
        return this.partyAcctRelKeysOrPartyKeysAndAcctKeys;
    }

}
