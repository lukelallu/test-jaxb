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
 * <p>Java class for SvcProviderKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcProviderKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}BaseKeys_Type"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}SvcProviderId"/&gt;
 *         &lt;element ref="{IFX2_3}SvcProviderName"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcProviderKeys_Type", propOrder = {
    "svcProviderId",
    "svcProviderName"
})
public class SvcProviderKeysType
    extends BaseKeysType
{

    @XmlElement(name = "SvcProviderId")
    protected String svcProviderId;
    @XmlElement(name = "SvcProviderName")
    protected String svcProviderName;

    /**
     * Gets the value of the svcProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProviderId() {
        return svcProviderId;
    }

    /**
     * Sets the value of the svcProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProviderId(String value) {
        this.svcProviderId = value;
    }

    /**
     * Gets the value of the svcProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProviderName() {
        return svcProviderName;
    }

    /**
     * Sets the value of the svcProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProviderName(String value) {
        this.svcProviderName = value;
    }

}