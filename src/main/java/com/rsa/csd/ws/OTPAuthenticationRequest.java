//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:13:42 PM EST 
//


package com.rsa.csd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines OTP Authentiaction Request
 * 
 * <p>Java class for OTPAuthenticationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTPAuthenticationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthenticationRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTPAuthenticationRequest", propOrder = {
    "otp"
})
public class OTPAuthenticationRequest
    extends AcspAuthenticationRequest
{

    protected String otp;

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp(String value) {
        this.otp = value;
    }

}
