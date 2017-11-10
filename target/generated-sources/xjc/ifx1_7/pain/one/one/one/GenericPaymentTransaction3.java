//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.one.one.one;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericPaymentTransaction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPaymentTransaction3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtId" type="{urn:swift:xsd:pain.001.001.01}PaymentIdentification"/&gt;
 *         &lt;element name="Purp" type="{urn:swift:xsd:pain.001.001.01}PurposeChoice" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:swift:xsd:pain.001.001.01}AmountType1Choice"/&gt;
 *         &lt;element name="ChqInstr" type="{urn:swift:xsd:pain.001.001.01}Cheque2" minOccurs="0"/&gt;
 *         &lt;element name="OrgtgPty" type="{urn:swift:xsd:pain.001.001.01}PartyIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="IntrmyAgt1" type="{urn:swift:xsd:pain.001.001.01}BranchAndFinancialInstitutionIdentification" minOccurs="0"/&gt;
 *         &lt;element name="IntrmyAgt2" type="{urn:swift:xsd:pain.001.001.01}BranchAndFinancialInstitutionIdentification" minOccurs="0"/&gt;
 *         &lt;element name="Cdtr" type="{urn:swift:xsd:pain.001.001.01}PartyIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="CdtrAcct" type="{urn:swift:xsd:pain.001.001.01}CashAccount3" minOccurs="0"/&gt;
 *         &lt;element name="CdtrCtryOfRes" type="{urn:swift:xsd:pain.001.001.01}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="FnlAgt" type="{urn:swift:xsd:pain.001.001.01}BranchAndFinancialInstitutionIdentification" minOccurs="0"/&gt;
 *         &lt;element name="FnlAgtAcct" type="{urn:swift:xsd:pain.001.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FnlPty" type="{urn:swift:xsd:pain.001.001.01}PartyIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:swift:xsd:pain.001.001.01}ChargeBearer1Code"/&gt;
 *         &lt;element name="XchgCtrctRef" type="{urn:swift:xsd:pain.001.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RgltryRptg" type="{urn:swift:xsd:pain.001.001.01}StructuredRegulatoryReporting2" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="InstrForFnlAgt" type="{urn:swift:xsd:pain.001.001.01}InstructionForFinalAgent" minOccurs="0"/&gt;
 *         &lt;element name="InstrForFrstAgt" type="{urn:swift:xsd:pain.001.001.01}InstructionForFirstAgent" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:swift:xsd:pain.001.001.01}RemittanceInformation3Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPaymentTransaction3", propOrder = {
    "pmtId",
    "purp",
    "amt",
    "chqInstr",
    "orgtgPty",
    "intrmyAgt1",
    "intrmyAgt2",
    "cdtr",
    "cdtrAcct",
    "cdtrCtryOfRes",
    "fnlAgt",
    "fnlAgtAcct",
    "fnlPty",
    "chrgBr",
    "xchgCtrctRef",
    "rgltryRptg",
    "instrForFnlAgt",
    "instrForFrstAgt",
    "rmtInf"
})
public class GenericPaymentTransaction3 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification pmtId;
    @XmlElement(name = "Purp")
    protected PurposeChoice purp;
    @XmlElement(name = "Amt", required = true)
    protected AmountType1Choice amt;
    @XmlElement(name = "ChqInstr")
    protected Cheque2 chqInstr;
    @XmlElement(name = "OrgtgPty")
    protected PartyIdentification1 orgtgPty;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification intrmyAgt1;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification intrmyAgt2;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification1 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount3 cdtrAcct;
    @XmlElement(name = "CdtrCtryOfRes")
    protected String cdtrCtryOfRes;
    @XmlElement(name = "FnlAgt")
    protected BranchAndFinancialInstitutionIdentification fnlAgt;
    @XmlElement(name = "FnlAgtAcct")
    protected String fnlAgtAcct;
    @XmlElement(name = "FnlPty")
    protected PartyIdentification1 fnlPty;
    @XmlElement(name = "ChrgBr", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code chrgBr;
    @XmlElement(name = "XchgCtrctRef")
    protected String xchgCtrctRef;
    @XmlElement(name = "RgltryRptg")
    protected List<StructuredRegulatoryReporting2> rgltryRptg;
    @XmlElement(name = "InstrForFnlAgt")
    protected InstructionForFinalAgent instrForFnlAgt;
    @XmlElement(name = "InstrForFrstAgt")
    protected InstructionForFirstAgent instrForFrstAgt;
    @XmlElement(name = "RmtInf")
    protected List<RemittanceInformation3Choice> rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification }
     *     
     */
    public PaymentIdentification getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification }
     *     
     */
    public void setPmtId(PaymentIdentification value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeChoice }
     *     
     */
    public PurposeChoice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeChoice }
     *     
     */
    public void setPurp(PurposeChoice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType1Choice }
     *     
     */
    public AmountType1Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType1Choice }
     *     
     */
    public void setAmt(AmountType1Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the chqInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque2 }
     *     
     */
    public Cheque2 getChqInstr() {
        return chqInstr;
    }

    /**
     * Sets the value of the chqInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque2 }
     *     
     */
    public void setChqInstr(Cheque2 value) {
        this.chqInstr = value;
    }

    /**
     * Gets the value of the orgtgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getOrgtgPty() {
        return orgtgPty;
    }

    /**
     * Sets the value of the orgtgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public void setOrgtgPty(PartyIdentification1 value) {
        this.orgtgPty = value;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification value) {
        this.intrmyAgt1 = value;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification value) {
        this.intrmyAgt2 = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public void setCdtr(PartyIdentification1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public void setCdtrAcct(CashAccount3 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the cdtrCtryOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrCtryOfRes() {
        return cdtrCtryOfRes;
    }

    /**
     * Sets the value of the cdtrCtryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrCtryOfRes(String value) {
        this.cdtrCtryOfRes = value;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setFnlAgt(BranchAndFinancialInstitutionIdentification value) {
        this.fnlAgt = value;
    }

    /**
     * Gets the value of the fnlAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnlAgtAcct() {
        return fnlAgtAcct;
    }

    /**
     * Sets the value of the fnlAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnlAgtAcct(String value) {
        this.fnlAgtAcct = value;
    }

    /**
     * Gets the value of the fnlPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getFnlPty() {
        return fnlPty;
    }

    /**
     * Sets the value of the fnlPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public void setFnlPty(PartyIdentification1 value) {
        this.fnlPty = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public ChargeBearer1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public void setChrgBr(ChargeBearer1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the xchgCtrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgCtrctRef() {
        return xchgCtrctRef;
    }

    /**
     * Sets the value of the xchgCtrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgCtrctRef(String value) {
        this.xchgCtrctRef = value;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRegulatoryReporting2 }
     * 
     * 
     */
    public List<StructuredRegulatoryReporting2> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<StructuredRegulatoryReporting2>();
        }
        return this.rgltryRptg;
    }

    /**
     * Gets the value of the instrForFnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForFinalAgent }
     *     
     */
    public InstructionForFinalAgent getInstrForFnlAgt() {
        return instrForFnlAgt;
    }

    /**
     * Sets the value of the instrForFnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForFinalAgent }
     *     
     */
    public void setInstrForFnlAgt(InstructionForFinalAgent value) {
        this.instrForFnlAgt = value;
    }

    /**
     * Gets the value of the instrForFrstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForFirstAgent }
     *     
     */
    public InstructionForFirstAgent getInstrForFrstAgt() {
        return instrForFrstAgt;
    }

    /**
     * Sets the value of the instrForFrstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForFirstAgent }
     *     
     */
    public void setInstrForFrstAgt(InstructionForFirstAgent value) {
        this.instrForFrstAgt = value;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceInformation3Choice }
     * 
     * 
     */
    public List<RemittanceInformation3Choice> getRmtInf() {
        if (rmtInf == null) {
            rmtInf = new ArrayList<RemittanceInformation3Choice>();
        }
        return this.rmtInf;
    }

}