//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkOrdSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}ChkOrdKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}PartyKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}AcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}RecurChkOrdKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
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
@XmlType(name = "ChkOrdSel_Type", propOrder = {
    "chkOrdKeysOrPartyKeysAndAcctKeys"
})
public class ChkOrdSelType {

    @XmlElements({
        @XmlElement(name = "ChkOrdKeys", type = ChkOrdKeysType.class),
        @XmlElement(name = "PartyKeys", type = PartyKeysType.class),
        @XmlElement(name = "AcctKeys", type = AcctKeysType.class),
        @XmlElement(name = "RecurChkOrdKeys", type = RecurChkOrdKeysType.class),
        @XmlElement(name = "DtRange", type = DtRangeType.class)
    })
    protected List<Object> chkOrdKeysOrPartyKeysAndAcctKeys;

    /**
     * Gets the value of the chkOrdKeysOrPartyKeysAndAcctKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkOrdKeysOrPartyKeysAndAcctKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkOrdKeysOrPartyKeysAndAcctKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkOrdKeysType }
     * {@link PartyKeysType }
     * {@link AcctKeysType }
     * {@link RecurChkOrdKeysType }
     * {@link DtRangeType }
     * 
     * 
     */
    public List<Object> getChkOrdKeysOrPartyKeysAndAcctKeys() {
        if (chkOrdKeysOrPartyKeysAndAcctKeys == null) {
            chkOrdKeysOrPartyKeysAndAcctKeys = new ArrayList<Object>();
        }
        return this.chkOrdKeysOrPartyKeysAndAcctKeys;
    }

}
