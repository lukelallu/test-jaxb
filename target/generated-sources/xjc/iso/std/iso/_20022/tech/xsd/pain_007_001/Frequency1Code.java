//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package iso.std.iso._20022.tech.xsd.pain_007_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency1Code")
@XmlEnum
public enum Frequency1Code {

    YEAR,
    MNTH,
    QURT,
    MIAN,
    WEEK,
    DAIL,
    ADHO,
    INDA;

    public String value() {
        return name();
    }

    public static Frequency1Code fromValue(String v) {
        return valueOf(v);
    }

}