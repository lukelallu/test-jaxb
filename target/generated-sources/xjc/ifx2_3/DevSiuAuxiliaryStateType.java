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
 * <p>Java class for DevSiuAuxiliaryState_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuAuxiliaryState_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevSiuVolume"/&gt;
 *         &lt;element ref="{IFX2_3}DevSiuUps"/&gt;
 *         &lt;element ref="{IFX2_3}DevSiuRemoteState"/&gt;
 *         &lt;element ref="{IFX2_3}DevSiuAudibleAlarm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuAuxiliaryState_Type", propOrder = {
    "devSiuVolume",
    "devSiuUps",
    "devSiuRemoteState",
    "devSiuAudibleAlarm"
})
public class DevSiuAuxiliaryStateType {

    @XmlElement(name = "DevSiuVolume")
    protected long devSiuVolume;
    @XmlElement(name = "DevSiuUps", required = true)
    protected String devSiuUps;
    @XmlElement(name = "DevSiuRemoteState", required = true)
    protected DevSiuRemoteStateType devSiuRemoteState;
    @XmlElement(name = "DevSiuAudibleAlarm", required = true)
    protected String devSiuAudibleAlarm;

    /**
     * Gets the value of the devSiuVolume property.
     * 
     */
    public long getDevSiuVolume() {
        return devSiuVolume;
    }

    /**
     * Sets the value of the devSiuVolume property.
     * 
     */
    public void setDevSiuVolume(long value) {
        this.devSiuVolume = value;
    }

    /**
     * Gets the value of the devSiuUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuUps() {
        return devSiuUps;
    }

    /**
     * Sets the value of the devSiuUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuUps(String value) {
        this.devSiuUps = value;
    }

    /**
     * Gets the value of the devSiuRemoteState property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuRemoteStateType }
     *     
     */
    public DevSiuRemoteStateType getDevSiuRemoteState() {
        return devSiuRemoteState;
    }

    /**
     * Sets the value of the devSiuRemoteState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuRemoteStateType }
     *     
     */
    public void setDevSiuRemoteState(DevSiuRemoteStateType value) {
        this.devSiuRemoteState = value;
    }

    /**
     * Gets the value of the devSiuAudibleAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuAudibleAlarm() {
        return devSiuAudibleAlarm;
    }

    /**
     * Sets the value of the devSiuAudibleAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuAudibleAlarm(String value) {
        this.devSiuAudibleAlarm = value;
    }

}