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
 * <p>Java class for TerminalSPObjSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSPObjSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{IFX2_3}TerminalSPObjKeys"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSPObjSel_Type", propOrder = {
    "terminalSPObjKeys"
})
public class TerminalSPObjSelType {

    @XmlElement(name = "TerminalSPObjKeys")
    protected List<TerminalSPObjKeysType> terminalSPObjKeys;

    /**
     * Gets the value of the terminalSPObjKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalSPObjKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalSPObjKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalSPObjKeysType }
     * 
     * 
     */
    public List<TerminalSPObjKeysType> getTerminalSPObjKeys() {
        if (terminalSPObjKeys == null) {
            terminalSPObjKeys = new ArrayList<TerminalSPObjKeysType>();
        }
        return this.terminalSPObjKeys;
    }

}
