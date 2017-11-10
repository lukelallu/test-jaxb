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
 * <p>Java class for BillSummAmtType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillSummAmtType_Type"&gt;
 *   &lt;restriction base="{IFX2_3}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Payable"/&gt;
 *     &lt;enumeration value="Supplemental"/&gt;
 *     &lt;enumeration value="InfoOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillSummAmtType_Type")
@XmlEnum
public enum BillSummAmtTypeType {

    @XmlEnumValue("Payable")
    PAYABLE("Payable"),
    @XmlEnumValue("Supplemental")
    SUPPLEMENTAL("Supplemental"),
    @XmlEnumValue("InfoOnly")
    INFO_ONLY("InfoOnly");
    private final String value;

    BillSummAmtTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillSummAmtTypeType fromValue(String v) {
        for (BillSummAmtTypeType c: BillSummAmtTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}