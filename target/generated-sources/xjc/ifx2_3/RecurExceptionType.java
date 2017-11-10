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
 * <p>Java class for RecurException_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurException_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RecurExceptionType"/&gt;
 *         &lt;element ref="{IFX2_3}SkipNextN" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StartDt"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}EndDt"/&gt;
 *           &lt;element ref="{IFX2_3}Duration"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurException_Type", propOrder = {
    "recurExceptionType",
    "skipNextN",
    "startDt",
    "endDt",
    "duration"
})
public class RecurExceptionType {

    @XmlElement(name = "RecurExceptionType", required = true)
    @XmlSchemaType(name = "string")
    protected RecurExceptionTypeType recurExceptionType;
    @XmlElement(name = "SkipNextN")
    protected Long skipNextN;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;
    @XmlElement(name = "Duration")
    protected DurationType duration;

    /**
     * Gets the value of the recurExceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurExceptionTypeType }
     *     
     */
    public RecurExceptionTypeType getRecurExceptionType() {
        return recurExceptionType;
    }

    /**
     * Sets the value of the recurExceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurExceptionTypeType }
     *     
     */
    public void setRecurExceptionType(RecurExceptionTypeType value) {
        this.recurExceptionType = value;
    }

    /**
     * Gets the value of the skipNextN property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSkipNextN() {
        return skipNextN;
    }

    /**
     * Sets the value of the skipNextN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSkipNextN(Long value) {
        this.skipNextN = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

}
