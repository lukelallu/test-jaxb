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
 * <p>Java class for NoteSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{IFX2_3}NoteKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{IFX2_3}AlternateKeys"/&gt;
 *           &lt;element ref="{IFX2_3}NoteUse" minOccurs="0"/&gt;
 *           &lt;element ref="{IFX2_3}DtRange" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteSel_Type", propOrder = {
    "noteKeys",
    "alternateKeys",
    "noteUse",
    "dtRange"
})
public class NoteSelType {

    @XmlElement(name = "NoteKeys")
    protected NoteKeysType noteKeys;
    @XmlElement(name = "AlternateKeys")
    protected AlternateKeysType alternateKeys;
    @XmlElement(name = "NoteUse")
    protected String noteUse;
    @XmlElement(name = "DtRange")
    protected DtRangeType dtRange;

    /**
     * Gets the value of the noteKeys property.
     * 
     * @return
     *     possible object is
     *     {@link NoteKeysType }
     *     
     */
    public NoteKeysType getNoteKeys() {
        return noteKeys;
    }

    /**
     * Sets the value of the noteKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteKeysType }
     *     
     */
    public void setNoteKeys(NoteKeysType value) {
        this.noteKeys = value;
    }

    /**
     * Gets the value of the alternateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateKeysType }
     *     
     */
    public AlternateKeysType getAlternateKeys() {
        return alternateKeys;
    }

    /**
     * Sets the value of the alternateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateKeysType }
     *     
     */
    public void setAlternateKeys(AlternateKeysType value) {
        this.alternateKeys = value;
    }

    /**
     * Gets the value of the noteUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteUse() {
        return noteUse;
    }

    /**
     * Sets the value of the noteUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteUse(String value) {
        this.noteUse = value;
    }

    /**
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link DtRangeType }
     *     
     */
    public DtRangeType getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtRangeType }
     *     
     */
    public void setDtRange(DtRangeType value) {
        this.dtRange = value;
    }

}
