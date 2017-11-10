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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevIpmBin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevIpmBin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevIpmBinNum"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmBinType"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmMediaType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevImpMediaInCount"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmCount"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmRetractOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmBinStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevIpmBin_Type", propOrder = {
    "devIpmBinNum",
    "devIpmBinType",
    "devIpmMediaType",
    "devImpMediaInCount",
    "devIpmCount",
    "devIpmRetractOperation",
    "devIpmBinStatus"
})
public class DevIpmBinType {

    @XmlElement(name = "DevIpmBinNum")
    protected long devIpmBinNum;
    @XmlElement(name = "DevIpmBinType", required = true)
    protected String devIpmBinType;
    @XmlElement(name = "DevIpmMediaType")
    @XmlSchemaType(name = "string")
    protected DevIpmMediaTypeType devIpmMediaType;
    @XmlElement(name = "DevImpMediaInCount")
    protected long devImpMediaInCount;
    @XmlElement(name = "DevIpmCount")
    protected long devIpmCount;
    @XmlElement(name = "DevIpmRetractOperation")
    protected Long devIpmRetractOperation;
    @XmlElement(name = "DevIpmBinStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DevIpmBinStatusType devIpmBinStatus;

    /**
     * Gets the value of the devIpmBinNum property.
     * 
     */
    public long getDevIpmBinNum() {
        return devIpmBinNum;
    }

    /**
     * Sets the value of the devIpmBinNum property.
     * 
     */
    public void setDevIpmBinNum(long value) {
        this.devIpmBinNum = value;
    }

    /**
     * Gets the value of the devIpmBinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevIpmBinType() {
        return devIpmBinType;
    }

    /**
     * Sets the value of the devIpmBinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevIpmBinType(String value) {
        this.devIpmBinType = value;
    }

    /**
     * Gets the value of the devIpmMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmMediaTypeType }
     *     
     */
    public DevIpmMediaTypeType getDevIpmMediaType() {
        return devIpmMediaType;
    }

    /**
     * Sets the value of the devIpmMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmMediaTypeType }
     *     
     */
    public void setDevIpmMediaType(DevIpmMediaTypeType value) {
        this.devIpmMediaType = value;
    }

    /**
     * Gets the value of the devImpMediaInCount property.
     * 
     */
    public long getDevImpMediaInCount() {
        return devImpMediaInCount;
    }

    /**
     * Sets the value of the devImpMediaInCount property.
     * 
     */
    public void setDevImpMediaInCount(long value) {
        this.devImpMediaInCount = value;
    }

    /**
     * Gets the value of the devIpmCount property.
     * 
     */
    public long getDevIpmCount() {
        return devIpmCount;
    }

    /**
     * Sets the value of the devIpmCount property.
     * 
     */
    public void setDevIpmCount(long value) {
        this.devIpmCount = value;
    }

    /**
     * Gets the value of the devIpmRetractOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevIpmRetractOperation() {
        return devIpmRetractOperation;
    }

    /**
     * Sets the value of the devIpmRetractOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevIpmRetractOperation(Long value) {
        this.devIpmRetractOperation = value;
    }

    /**
     * Gets the value of the devIpmBinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmBinStatusType }
     *     
     */
    public DevIpmBinStatusType getDevIpmBinStatus() {
        return devIpmBinStatus;
    }

    /**
     * Sets the value of the devIpmBinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmBinStatusType }
     *     
     */
    public void setDevIpmBinStatus(DevIpmBinStatusType value) {
        this.devIpmBinStatus = value;
    }

}