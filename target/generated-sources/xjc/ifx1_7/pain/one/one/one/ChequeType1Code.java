//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx1_7.pain.one.one.one;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequeType1Code"&gt;
 *   &lt;restriction base="{urn:swift:xsd:pain.001.001.01}ChequeTypeCode"&gt;
 *     &lt;enumeration value="CRCQ"/&gt;
 *     &lt;enumeration value="OPCQ"/&gt;
 *     &lt;enumeration value="ORCQ"/&gt;
 *     &lt;enumeration value="CLCQ"/&gt;
 *     &lt;enumeration value="BKDF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChequeType1Code")
@XmlEnum(ChequeTypeCode.class)
public enum ChequeType1Code {

    CRCQ,
    OPCQ,
    ORCQ,
    CLCQ,
    BKDF;

    public String value() {
        return name();
    }

    public static ChequeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
