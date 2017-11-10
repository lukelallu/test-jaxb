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
 * <p>Java class for TermUnits_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TermUnits_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Weeks"/&gt;
 *     &lt;enumeration value="Months"/&gt;
 *     &lt;enumeration value="Years"/&gt;
 *     &lt;enumeration value="Indefinite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermUnits_Type")
@XmlEnum
public enum TermUnitsType {

    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite");
    private final String value;

    TermUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermUnitsType fromValue(String v) {
        for (TermUnitsType c: TermUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}