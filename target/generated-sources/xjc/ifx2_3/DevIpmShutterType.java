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
 * <p>Java class for DevIpmShutter_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevIpmShutter_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Jammed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevIpmShutter_Type")
@XmlEnum
public enum DevIpmShutterType {

    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Jammed")
    JAMMED("Jammed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevIpmShutterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevIpmShutterType fromValue(String v) {
        for (DevIpmShutterType c: DevIpmShutterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
