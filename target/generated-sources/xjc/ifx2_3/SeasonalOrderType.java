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
 * <p>Java class for SeasonalOrder_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeasonalOrder_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}EffTimeFrame"/&gt;
 *         &lt;element ref="{IFX2_3}OrderVolume" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ReorderLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeasonalOrder_Type", propOrder = {
    "effTimeFrame",
    "orderVolume",
    "reorderLevel"
})
public class SeasonalOrderType {

    @XmlElement(name = "EffTimeFrame", required = true)
    protected EffTimeFrameType effTimeFrame;
    @XmlElement(name = "OrderVolume")
    protected Long orderVolume;
    @XmlElement(name = "ReorderLevel")
    protected Long reorderLevel;

    /**
     * Gets the value of the effTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link EffTimeFrameType }
     *     
     */
    public EffTimeFrameType getEffTimeFrame() {
        return effTimeFrame;
    }

    /**
     * Sets the value of the effTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffTimeFrameType }
     *     
     */
    public void setEffTimeFrame(EffTimeFrameType value) {
        this.effTimeFrame = value;
    }

    /**
     * Gets the value of the orderVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderVolume() {
        return orderVolume;
    }

    /**
     * Sets the value of the orderVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderVolume(Long value) {
        this.orderVolume = value;
    }

    /**
     * Gets the value of the reorderLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReorderLevel() {
        return reorderLevel;
    }

    /**
     * Sets the value of the reorderLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReorderLevel(Long value) {
        this.reorderLevel = value;
    }

}