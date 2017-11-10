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
 * <p>Java class for AthSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AthSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}AthKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}AcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}AthType" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}CurAmtRange" minOccurs="0"/&gt;
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
@XmlType(name = "AthSel_Type", propOrder = {
    "athKeysOrAcctKeysAndDtRange"
})
public class AthSelType {

    @XmlElements({
        @XmlElement(name = "AthKeys", type = AthKeysType.class),
        @XmlElement(name = "AcctKeys", type = AcctKeysType.class),
        @XmlElement(name = "DtRange", type = DtRangeType.class),
        @XmlElement(name = "AthType", type = String.class),
        @XmlElement(name = "CurAmtRange", type = CurAmtRangeType.class)
    })
    protected List<Object> athKeysOrAcctKeysAndDtRange;

    /**
     * Gets the value of the athKeysOrAcctKeysAndDtRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the athKeysOrAcctKeysAndDtRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAthKeysOrAcctKeysAndDtRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AthKeysType }
     * {@link AcctKeysType }
     * {@link DtRangeType }
     * {@link String }
     * {@link CurAmtRangeType }
     * 
     * 
     */
    public List<Object> getAthKeysOrAcctKeysAndDtRange() {
        if (athKeysOrAcctKeysAndDtRange == null) {
            athKeysOrAcctKeysAndDtRange = new ArrayList<Object>();
        }
        return this.athKeysOrAcctKeysAndDtRange;
    }

}