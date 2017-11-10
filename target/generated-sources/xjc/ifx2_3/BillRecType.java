//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BillId"/&gt;
 *         &lt;element ref="{IFX2_3}BillInfo"/&gt;
 *         &lt;element ref="{IFX2_3}BillEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BillStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillRec_Type", propOrder = {
    "svcIdent",
    "billId",
    "billInfo",
    "billEnvr",
    "billStatus"
})
public class BillRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "BillId", required = true)
    protected String billId;
    @XmlElement(name = "BillInfo", required = true)
    protected BillInfoType billInfo;
    @XmlElement(name = "BillEnvr")
    protected BillEnvrType billEnvr;
    @XmlElement(name = "BillStatus", required = true)
    protected BillStatusType billStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillInfoType }
     *     
     */
    public BillInfoType getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInfoType }
     *     
     */
    public void setBillInfo(BillInfoType value) {
        this.billInfo = value;
    }

    /**
     * Gets the value of the billEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BillEnvrType }
     *     
     */
    public BillEnvrType getBillEnvr() {
        return billEnvr;
    }

    /**
     * Sets the value of the billEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillEnvrType }
     *     
     */
    public void setBillEnvr(BillEnvrType value) {
        this.billEnvr = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatusType }
     *     
     */
    public BillStatusType getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatusType }
     *     
     */
    public void setBillStatus(BillStatusType value) {
        this.billStatus = value;
    }

}