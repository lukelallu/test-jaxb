//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctAcctRelSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAcctRelSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}AcctAcctRelKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}AcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}RelAcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}AcctRelType" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}AcctRelName" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}IncludeAllRelInd" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAcctRelSel_Type", propOrder = {
    "acctAcctRelKeysOrAcctKeysAndRelAcctKeys"
})
public class AcctAcctRelSelType {

    @XmlElementRefs({
        @XmlElementRef(name = "AcctKeys", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DtRange", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RelAcctKeys", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctRelType", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctRelName", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IncludeAllRelInd", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctAcctRelKeys", namespace = "IFX2_3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> acctAcctRelKeysOrAcctKeysAndRelAcctKeys;

    /**
     * Gets the value of the acctAcctRelKeysOrAcctKeysAndRelAcctKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctAcctRelKeysOrAcctKeysAndRelAcctKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctAcctRelKeysOrAcctKeysAndRelAcctKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link DtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelAcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctAcctRelKeysType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAcctAcctRelKeysOrAcctKeysAndRelAcctKeys() {
        if (acctAcctRelKeysOrAcctKeysAndRelAcctKeys == null) {
            acctAcctRelKeysOrAcctKeysAndRelAcctKeys = new ArrayList<JAXBElement<?>>();
        }
        return this.acctAcctRelKeysOrAcctKeysAndRelAcctKeys;
    }

}