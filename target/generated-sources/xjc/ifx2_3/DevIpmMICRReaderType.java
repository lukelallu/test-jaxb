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
 * <p>Java class for DevIpmMICRReader_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevIpmMICRReader_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Fading"/&gt;
 *     &lt;enumeration value="Inoperable"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevIpmMICRReader_Type")
@XmlEnum
public enum DevIpmMICRReaderType {

    OK("OK"),
    @XmlEnumValue("Fading")
    FADING("Fading"),
    @XmlEnumValue("Inoperable")
    INOPERABLE("Inoperable"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevIpmMICRReaderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevIpmMICRReaderType fromValue(String v) {
        for (DevIpmMICRReaderType c: DevIpmMICRReaderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
