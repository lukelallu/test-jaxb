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
 * <p>Java class for DevDetailAlm_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailAlm_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}DevDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevAlmType"/&gt;
 *         &lt;element ref="{IFX2_3}DevAlmOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevAlmAlarm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailAlm_Type", propOrder = {
    "devAlmType",
    "devAlmOperation",
    "devAlmAlarm"
})
public class DevDetailAlmType
    extends DevDetailType
{

    @XmlElement(name = "DevAlmType", required = true)
    protected String devAlmType;
    @XmlElement(name = "DevAlmOperation")
    protected String devAlmOperation;
    @XmlElement(name = "DevAlmAlarm", required = true)
    @XmlSchemaType(name = "string")
    protected DevAlmAlarmType devAlmAlarm;

    /**
     * Gets the value of the devAlmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevAlmType() {
        return devAlmType;
    }

    /**
     * Sets the value of the devAlmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevAlmType(String value) {
        this.devAlmType = value;
    }

    /**
     * Gets the value of the devAlmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevAlmOperation() {
        return devAlmOperation;
    }

    /**
     * Sets the value of the devAlmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevAlmOperation(String value) {
        this.devAlmOperation = value;
    }

    /**
     * Gets the value of the devAlmAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link DevAlmAlarmType }
     *     
     */
    public DevAlmAlarmType getDevAlmAlarm() {
        return devAlmAlarm;
    }

    /**
     * Sets the value of the devAlmAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevAlmAlarmType }
     *     
     */
    public void setDevAlmAlarm(DevAlmAlarmType value) {
        this.devAlmAlarm = value;
    }

}
