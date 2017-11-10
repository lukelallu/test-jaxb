//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EffUrgency_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EffUrgency_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Immediate"/&gt;
 *     &lt;enumeration value="CurrentTransactionEnd"/&gt;
 *     &lt;enumeration value="SessionEnd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EffUrgency_Type")
@XmlEnum
public enum EffUrgencyType {

    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("CurrentTransactionEnd")
    CURRENT_TRANSACTION_END("CurrentTransactionEnd"),
    @XmlEnumValue("SessionEnd")
    SESSION_END("SessionEnd");
    private final String value;

    EffUrgencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EffUrgencyType fromValue(String v) {
        for (EffUrgencyType c: EffUrgencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}