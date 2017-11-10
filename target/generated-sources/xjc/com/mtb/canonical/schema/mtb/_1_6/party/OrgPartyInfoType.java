//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package com.mtb.canonical.schema.mtb._1_6.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrgPartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgPartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}PartyInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}OrgData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}TaxExempt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}OrgEstablishDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}NumEmployees" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}FiscalYearEnd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}FinancialReportsURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}ValidInd" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.mtb.com/canonical/schema/MTB/1_6/Party}RelationshipMgr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgPartyInfo_Type", propOrder = {
    "rest"
})
public class OrgPartyInfoType
    extends PartyInfoType
{

    @XmlElementRefs({
        @XmlElementRef(name = "FiscalYearEnd", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrgEstablishDt", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LegalForm", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrgData", namespace = "http://www.mtb.com/canonical/schema/MTB/1_6/Party", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidInd", namespace = "http://www.mtb.com/canonical/schema/MTB/1_6/Party", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FinancialReportsURL", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxExempt", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NumEmployees", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StatusCode", namespace = "IFX2_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RelationshipMgr", namespace = "http://www.mtb.com/canonical/schema/MTB/1_6/Party", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RelationshipMgr" is used by two different parts of a schema. See: 
     * line 438 of file:/D:/ws/test-jaxb/src/main/resources/SharedResources/SchemaDefinitions/MTB/1_6/Party.xsd
     * line 465 of file:/D:/ws/test-jaxb/src/main/resources/SharedResources/SchemaDefinitions/MTB/1_6/Party.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OrgDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationshipMgrType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
