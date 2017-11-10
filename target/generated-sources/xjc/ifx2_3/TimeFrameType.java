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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeFrame_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}StartDt" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}EndDt"/&gt;
 *           &lt;element ref="{IFX2_3}Duration"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}AllDayEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecurRule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RecurException" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame_Type", propOrder = {
    "startDt",
    "endDt",
    "duration",
    "allDayEvent",
    "recurRule",
    "recurException"
})
@XmlSeeAlso({
    CreditReviewTimeFrameType.class,
    EffTimeFrameType.class,
    ForExValDtTimeFrameType.class,
    HolidayTimeframeType.class,
    StmtTimeFrameType.class
})
public class TimeFrameType {

    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;
    @XmlElement(name = "Duration")
    protected DurationType duration;
    @XmlElement(name = "AllDayEvent")
    protected Boolean allDayEvent;
    @XmlElement(name = "RecurRule")
    protected List<RecurRuleType> recurRule;
    @XmlElement(name = "RecurException")
    protected List<RecurExceptionType> recurException;

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

    /**
     * Gets the value of the allDayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllDayEvent() {
        return allDayEvent;
    }

    /**
     * Sets the value of the allDayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDayEvent(Boolean value) {
        this.allDayEvent = value;
    }

    /**
     * Gets the value of the recurRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurRuleType }
     * 
     * 
     */
    public List<RecurRuleType> getRecurRule() {
        if (recurRule == null) {
            recurRule = new ArrayList<RecurRuleType>();
        }
        return this.recurRule;
    }

    /**
     * Gets the value of the recurException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurExceptionType }
     * 
     * 
     */
    public List<RecurExceptionType> getRecurException() {
        if (recurException == null) {
            recurException = new ArrayList<RecurExceptionType>();
        }
        return this.recurException;
    }

}