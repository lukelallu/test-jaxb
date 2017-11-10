//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclModRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}RqUID"/&gt;
 *         &lt;element ref="{IFX2_3}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PmtEnclKeys"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element ref="{IFX2_3}PmtEnclInfo"/&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;element ref="{IFX2_3}DelElements"/&gt;
 *             &lt;element ref="{IFX2_3}UpdElements"/&gt;
 *             &lt;element ref="{IFX2_3}NewElements"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclModRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "pmtEnclKeys",
    "pmtEnclInfoAndDelElementsOrUpdElements"
})
public class PmtEnclModRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "PmtEnclKeys", required = true)
    protected PmtEnclKeysType pmtEnclKeys;
    @XmlElementRefs({
        @XmlElementRef(name = "NewElements", namespace = "IFX2_3", type = JAXBElement.class),
        @XmlElementRef(name = "DelElements", namespace = "IFX2_3", type = JAXBElement.class),
        @XmlElementRef(name = "UpdElements", namespace = "IFX2_3", type = JAXBElement.class),
        @XmlElementRef(name = "PmtEnclInfo", namespace = "IFX2_3", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> pmtEnclInfoAndDelElementsOrUpdElements;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrType }
     *     
     */
    public MsgRqHdrType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the pmtEnclKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclKeysType }
     *     
     */
    public PmtEnclKeysType getPmtEnclKeys() {
        return pmtEnclKeys;
    }

    /**
     * Sets the value of the pmtEnclKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclKeysType }
     *     
     */
    public void setPmtEnclKeys(PmtEnclKeysType value) {
        this.pmtEnclKeys = value;
    }

    /**
     * Gets the value of the pmtEnclInfoAndDelElementsOrUpdElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtEnclInfoAndDelElementsOrUpdElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtEnclInfoAndDelElementsOrUpdElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PmtEnclInfoType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPmtEnclInfoAndDelElementsOrUpdElements() {
        if (pmtEnclInfoAndDelElementsOrUpdElements == null) {
            pmtEnclInfoAndDelElementsOrUpdElements = new ArrayList<JAXBElement<?>>();
        }
        return this.pmtEnclInfoAndDelElementsOrUpdElements;
    }

}
