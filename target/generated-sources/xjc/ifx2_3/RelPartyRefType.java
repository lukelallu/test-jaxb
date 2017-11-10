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
 * <p>Java class for RelPartyRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelPartyRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}PartyRef_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RelPartyRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RelEstablishDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}TimeFrame" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelPartyRef_Type", propOrder = {
    "relPartyRole",
    "relEstablishDt",
    "timeFrame"
})
public class RelPartyRefType
    extends PartyRefType
{

    @XmlElement(name = "RelPartyRole")
    protected List<String> relPartyRole;
    @XmlElement(name = "RelEstablishDt")
    protected String relEstablishDt;
    @XmlElement(name = "TimeFrame")
    protected TimeFrameType timeFrame;

    /**
     * Gets the value of the relPartyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relPartyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelPartyRole() {
        if (relPartyRole == null) {
            relPartyRole = new ArrayList<String>();
        }
        return this.relPartyRole;
    }

    /**
     * Gets the value of the relEstablishDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelEstablishDt() {
        return relEstablishDt;
    }

    /**
     * Sets the value of the relEstablishDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelEstablishDt(String value) {
        this.relEstablishDt = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrameType }
     *     
     */
    public TimeFrameType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrameType }
     *     
     */
    public void setTimeFrame(TimeFrameType value) {
        this.timeFrame = value;
    }

}