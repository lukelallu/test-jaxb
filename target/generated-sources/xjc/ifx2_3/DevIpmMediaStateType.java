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
 * <p>Java class for DevIpmMediaState_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevIpmMediaState_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Present"/&gt;
 *     &lt;enumeration value="NotPresent"/&gt;
 *     &lt;enumeration value="Jammed"/&gt;
 *     &lt;enumeration value="NotSuported"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Position"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevIpmMediaState_Type")
@XmlEnum
public enum DevIpmMediaStateType {

    @XmlEnumValue("Present")
    PRESENT("Present"),
    @XmlEnumValue("NotPresent")
    NOT_PRESENT("NotPresent"),
    @XmlEnumValue("Jammed")
    JAMMED("Jammed"),
    @XmlEnumValue("NotSuported")
    NOT_SUPORTED("NotSuported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Position")
    POSITION("Position");
    private final String value;

    DevIpmMediaStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevIpmMediaStateType fromValue(String v) {
        for (DevIpmMediaStateType c: DevIpmMediaStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
