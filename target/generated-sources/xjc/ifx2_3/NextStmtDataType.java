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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NextStmtData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextStmtData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}NextStmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}NextDueDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextStmtData_Type", propOrder = {
    "nextStmtDt",
    "nextDueDt"
})
public class NextStmtDataType {

    @XmlElement(name = "NextStmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextStmtDt;
    @XmlElement(name = "NextDueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDueDt;

    /**
     * Gets the value of the nextStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextStmtDt() {
        return nextStmtDt;
    }

    /**
     * Sets the value of the nextStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextStmtDt(XMLGregorianCalendar value) {
        this.nextStmtDt = value;
    }

    /**
     * Gets the value of the nextDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDueDt() {
        return nextDueDt;
    }

    /**
     * Sets the value of the nextDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDueDt(XMLGregorianCalendar value) {
        this.nextDueDt = value;
    }

}
