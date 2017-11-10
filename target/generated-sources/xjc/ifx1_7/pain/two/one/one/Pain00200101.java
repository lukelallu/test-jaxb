//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.two.one.one;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pain.002.001.01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pain.002.001.01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GnlInf" type="{urn:swift:xsd:pain.002.001.01}GeneralInformation1"/&gt;
 *         &lt;element name="OrgnlGrpRefInfAndSts" type="{urn:swift:xsd:pain.002.001.01}OriginalGroupReferenceInformation1"/&gt;
 *         &lt;element name="OrgnlPmtInf" type="{urn:swift:xsd:pain.002.001.01}PaymentInformation9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pain.002.001.01", propOrder = {
    "gnlInf",
    "orgnlGrpRefInfAndSts",
    "orgnlPmtInf"
})
public class Pain00200101 {

    @XmlElement(name = "GnlInf", required = true)
    protected GeneralInformation1 gnlInf;
    @XmlElement(name = "OrgnlGrpRefInfAndSts", required = true)
    protected OriginalGroupReferenceInformation1 orgnlGrpRefInfAndSts;
    @XmlElement(name = "OrgnlPmtInf")
    protected List<PaymentInformation9> orgnlPmtInf;

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation1 }
     *     
     */
    public GeneralInformation1 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation1 }
     *     
     */
    public void setGnlInf(GeneralInformation1 value) {
        this.gnlInf = value;
    }

    /**
     * Gets the value of the orgnlGrpRefInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupReferenceInformation1 }
     *     
     */
    public OriginalGroupReferenceInformation1 getOrgnlGrpRefInfAndSts() {
        return orgnlGrpRefInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpRefInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupReferenceInformation1 }
     *     
     */
    public void setOrgnlGrpRefInfAndSts(OriginalGroupReferenceInformation1 value) {
        this.orgnlGrpRefInfAndSts = value;
    }

    /**
     * Gets the value of the orgnlPmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInformation9 }
     * 
     * 
     */
    public List<PaymentInformation9> getOrgnlPmtInf() {
        if (orgnlPmtInf == null) {
            orgnlPmtInf = new ArrayList<PaymentInformation9>();
        }
        return this.orgnlPmtInf;
    }

}