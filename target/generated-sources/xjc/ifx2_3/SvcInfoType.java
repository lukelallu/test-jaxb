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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcName"/&gt;
 *         &lt;element ref="{IFX2_3}Version" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PrcSched"/&gt;
 *         &lt;element ref="{IFX2_3}MsgSupt" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{IFX2_3}OperSupt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DiscRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}SvcStatusDt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcInfo_Type", propOrder = {
    "svcName",
    "version",
    "prcSched",
    "msgSupt",
    "operSupt",
    "discRef",
    "svcStatusDt"
})
public class SvcInfoType {

    @XmlElement(name = "SvcName", required = true)
    protected String svcName;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "PrcSched", required = true)
    protected PrcSchedType prcSched;
    @XmlElement(name = "MsgSupt", required = true)
    protected List<String> msgSupt;
    @XmlElement(name = "OperSupt")
    protected List<String> operSupt;
    @XmlElement(name = "DiscRef")
    protected List<DiscRefType> discRef;
    @XmlElement(name = "SvcStatusDt", required = true)
    protected String svcStatusDt;

    /**
     * Gets the value of the svcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * Sets the value of the svcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcName(String value) {
        this.svcName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the prcSched property.
     * 
     * @return
     *     possible object is
     *     {@link PrcSchedType }
     *     
     */
    public PrcSchedType getPrcSched() {
        return prcSched;
    }

    /**
     * Sets the value of the prcSched property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrcSchedType }
     *     
     */
    public void setPrcSched(PrcSchedType value) {
        this.prcSched = value;
    }

    /**
     * Gets the value of the msgSupt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgSupt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgSupt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMsgSupt() {
        if (msgSupt == null) {
            msgSupt = new ArrayList<String>();
        }
        return this.msgSupt;
    }

    /**
     * Gets the value of the operSupt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operSupt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperSupt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperSupt() {
        if (operSupt == null) {
            operSupt = new ArrayList<String>();
        }
        return this.operSupt;
    }

    /**
     * Gets the value of the discRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscRefType }
     * 
     * 
     */
    public List<DiscRefType> getDiscRef() {
        if (discRef == null) {
            discRef = new ArrayList<DiscRefType>();
        }
        return this.discRef;
    }

    /**
     * Gets the value of the svcStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStatusDt() {
        return svcStatusDt;
    }

    /**
     * Sets the value of the svcStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStatusDt(String value) {
        this.svcStatusDt = value;
    }

}