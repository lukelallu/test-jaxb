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
 * <p>Java class for CashClearingSystemCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashClearingSystemCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABE"/&gt;
 *     &lt;enumeration value="ART"/&gt;
 *     &lt;enumeration value="AVP"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="BAP"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BOF"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CAM"/&gt;
 *     &lt;enumeration value="CBJ"/&gt;
 *     &lt;enumeration value="CHP"/&gt;
 *     &lt;enumeration value="DKC"/&gt;
 *     &lt;enumeration value="RTP"/&gt;
 *     &lt;enumeration value="EBA"/&gt;
 *     &lt;enumeration value="ELS"/&gt;
 *     &lt;enumeration value="ERP"/&gt;
 *     &lt;enumeration value="XCT"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HRM"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="LGS"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="MOS"/&gt;
 *     &lt;enumeration value="MUP"/&gt;
 *     &lt;enumeration value="NOC"/&gt;
 *     &lt;enumeration value="PCH"/&gt;
 *     &lt;enumeration value="PDS"/&gt;
 *     &lt;enumeration value="PEG"/&gt;
 *     &lt;enumeration value="PNS"/&gt;
 *     &lt;enumeration value="PVE"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SPG"/&gt;
 *     &lt;enumeration value="SSK"/&gt;
 *     &lt;enumeration value="TBF"/&gt;
 *     &lt;enumeration value="TGT"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="FDW"/&gt;
 *     &lt;enumeration value="BOJ"/&gt;
 *     &lt;enumeration value="FEY"/&gt;
 *     &lt;enumeration value="ZEN"/&gt;
 *     &lt;enumeration value="RTG"/&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="CHI"/&gt;
 *     &lt;enumeration value="FDN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashClearingSystemCode")
@XmlEnum
public enum CashClearingSystemCode {

    ABE,
    ART,
    AVP,
    AZM,
    BAP,
    BEL,
    BOF,
    BRL,
    CAD,
    CAM,
    CBJ,
    CHP,
    DKC,
    RTP,
    EBA,
    ELS,
    ERP,
    XCT,
    HRK,
    HRM,
    HUF,
    LGS,
    LVL,
    MOS,
    MUP,
    NOC,
    PCH,
    PDS,
    PEG,
    PNS,
    PVE,
    SEC,
    SIT,
    SLB,
    SPG,
    SSK,
    TBF,
    TGT,
    TOP,
    FDW,
    BOJ,
    FEY,
    ZEN,
    RTG,
    ACH,
    CHI,
    FDN;

    public String value() {
        return name();
    }

    public static CashClearingSystemCode fromValue(String v) {
        return valueOf(v);
    }

}
