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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartySel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}PartyKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}PersonIndicator" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}IssuedIdentValue" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}IssuedIdentType" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}FullName" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}Addr1" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}PostalCode" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}BirthDt" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}Phone" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}EmailAddr" minOccurs="0"/&gt;
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
@XmlType(name = "PartySel_Type", propOrder = {
    "partyKeysOrPersonIndicatorAndIssuedIdentValue"
})
@XmlSeeAlso({
    com.mtb.canonical.schema.mtb._1_6.party.PartySelType.class
})
public class PartySelType {

    @XmlElementRefs({
        @XmlElementRef(name = "Phone", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PersonIndicator", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IssuedIdentType", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PostalCode", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IssuedIdentValue", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Addr1", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PartyKeys", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EmailAddr", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FullName", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BirthDt", namespace = "IFX2_3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> partyKeysOrPersonIndicatorAndIssuedIdentValue;

    /**
     * Gets the value of the partyKeysOrPersonIndicatorAndIssuedIdentValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyKeysOrPersonIndicatorAndIssuedIdentValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyKeysOrPersonIndicatorAndIssuedIdentValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPartyKeysOrPersonIndicatorAndIssuedIdentValue() {
        if (partyKeysOrPersonIndicatorAndIssuedIdentValue == null) {
            partyKeysOrPersonIndicatorAndIssuedIdentValue = new ArrayList<JAXBElement<?>>();
        }
        return this.partyKeysOrPersonIndicatorAndIssuedIdentValue;
    }

}
