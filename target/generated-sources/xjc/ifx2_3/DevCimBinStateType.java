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
 * <p>Java class for DevCimBinState_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevCimBinState_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *     &lt;enumeration value="Inoperable"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *     &lt;enumeration value="NoReference"/&gt;
 *     &lt;enumeration value="Manipulated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevCimBinState_Type")
@XmlEnum
public enum DevCimBinStateType {

    OK("OK"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Inoperable")
    INOPERABLE("Inoperable"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("NoReference")
    NO_REFERENCE("NoReference"),
    @XmlEnumValue("Manipulated")
    MANIPULATED("Manipulated");
    private final String value;

    DevCimBinStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevCimBinStateType fromValue(String v) {
        for (DevCimBinStateType c: DevCimBinStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
