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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentInformation6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformation6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqdExctnDt" type="{urn:swift:xsd:pain.001.001.01}ISODate"/&gt;
 *         &lt;element name="PmtMtdByFrstAgt" type="{urn:swift:xsd:pain.001.001.01}PaymentMethod1Code"/&gt;
 *         &lt;element name="CdtTrfTpId" type="{urn:swift:xsd:pain.001.001.01}CreditTransferTypeIdentification" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:swift:xsd:pain.001.001.01}PartyIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="DbtrCtryOfRes" type="{urn:swift:xsd:pain.001.001.01}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:swift:xsd:pain.001.001.01}CashAccount3"/&gt;
 *         &lt;element name="FrstAgt" type="{urn:swift:xsd:pain.001.001.01}BranchAndFinancialInstitutionIdentification"/&gt;
 *         &lt;element name="ChrgsAcct" type="{urn:swift:xsd:pain.001.001.01}CashAccount3" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsAcctAgt" type="{urn:swift:xsd:pain.001.001.01}BranchAndFinancialInstitutionIdentification" minOccurs="0"/&gt;
 *         &lt;element name="PmtTx" type="{urn:swift:xsd:pain.001.001.01}GenericPaymentTransaction3" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformation6", propOrder = {
    "reqdExctnDt",
    "pmtMtdByFrstAgt",
    "cdtTrfTpId",
    "dbtr",
    "dbtrCtryOfRes",
    "dbtrAcct",
    "frstAgt",
    "chrgsAcct",
    "chrgsAcctAgt",
    "pmtTx"
})
public class PaymentInformation6 {

    @XmlElement(name = "ReqdExctnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "PmtMtdByFrstAgt", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod1Code pmtMtdByFrstAgt;
    @XmlElement(name = "CdtTrfTpId")
    protected CreditTransferTypeIdentification cdtTrfTpId;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification1 dbtr;
    @XmlElement(name = "DbtrCtryOfRes")
    protected String dbtrCtryOfRes;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccount3 dbtrAcct;
    @XmlElement(name = "FrstAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification frstAgt;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount3 chrgsAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification chrgsAcctAgt;
    @XmlElement(name = "PmtTx", required = true)
    protected List<GenericPaymentTransaction3> pmtTx;

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the pmtMtdByFrstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod1Code }
     *     
     */
    public PaymentMethod1Code getPmtMtdByFrstAgt() {
        return pmtMtdByFrstAgt;
    }

    /**
     * Sets the value of the pmtMtdByFrstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod1Code }
     *     
     */
    public void setPmtMtdByFrstAgt(PaymentMethod1Code value) {
        this.pmtMtdByFrstAgt = value;
    }

    /**
     * Gets the value of the cdtTrfTpId property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTypeIdentification }
     *     
     */
    public CreditTransferTypeIdentification getCdtTrfTpId() {
        return cdtTrfTpId;
    }

    /**
     * Sets the value of the cdtTrfTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTypeIdentification }
     *     
     */
    public void setCdtTrfTpId(CreditTransferTypeIdentification value) {
        this.cdtTrfTpId = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public void setDbtr(PartyIdentification1 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrCtryOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrCtryOfRes() {
        return dbtrCtryOfRes;
    }

    /**
     * Sets the value of the dbtrCtryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrCtryOfRes(String value) {
        this.dbtrCtryOfRes = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public void setDbtrAcct(CashAccount3 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setFrstAgt(BranchAndFinancialInstitutionIdentification value) {
        this.frstAgt = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public void setChrgsAcct(CashAccount3 value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification value) {
        this.chrgsAcctAgt = value;
    }

    /**
     * Gets the value of the pmtTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPaymentTransaction3 }
     * 
     * 
     */
    public List<GenericPaymentTransaction3> getPmtTx() {
        if (pmtTx == null) {
            pmtTx = new ArrayList<GenericPaymentTransaction3>();
        }
        return this.pmtTx;
    }

}
