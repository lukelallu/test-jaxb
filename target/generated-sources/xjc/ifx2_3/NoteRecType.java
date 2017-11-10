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
 * <p>Java class for NoteRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}NoteId"/&gt;
 *         &lt;element ref="{IFX2_3}NoteInfo"/&gt;
 *         &lt;element ref="{IFX2_3}NoteEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}NoteStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteRec_Type", propOrder = {
    "svcIdent",
    "noteId",
    "noteInfo",
    "noteEnvr",
    "noteStatus"
})
public class NoteRecType {

    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;
    @XmlElement(name = "NoteId", required = true)
    protected String noteId;
    @XmlElement(name = "NoteInfo", required = true)
    protected NoteInfoType noteInfo;
    @XmlElement(name = "NoteEnvr")
    protected NoteEnvrType noteEnvr;
    @XmlElement(name = "NoteStatus", required = true)
    protected NoteStatusType noteStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteId(String value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the noteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NoteInfoType }
     *     
     */
    public NoteInfoType getNoteInfo() {
        return noteInfo;
    }

    /**
     * Sets the value of the noteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteInfoType }
     *     
     */
    public void setNoteInfo(NoteInfoType value) {
        this.noteInfo = value;
    }

    /**
     * Gets the value of the noteEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link NoteEnvrType }
     *     
     */
    public NoteEnvrType getNoteEnvr() {
        return noteEnvr;
    }

    /**
     * Sets the value of the noteEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteEnvrType }
     *     
     */
    public void setNoteEnvr(NoteEnvrType value) {
        this.noteEnvr = value;
    }

    /**
     * Gets the value of the noteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NoteStatusType }
     *     
     */
    public NoteStatusType getNoteStatus() {
        return noteStatus;
    }

    /**
     * Sets the value of the noteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteStatusType }
     *     
     */
    public void setNoteStatus(NoteStatusType value) {
        this.noteStatus = value;
    }

}
