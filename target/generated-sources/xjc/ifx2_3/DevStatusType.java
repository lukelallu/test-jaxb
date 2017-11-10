//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevStatusCode"/&gt;
 *         &lt;element ref="{IFX2_3}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}StatusModBy" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{IFX2_3}DevDetailCam"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailDep"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailApp"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailTtu"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailAlm"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailCdm"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailPIN"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailChk"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailPtr"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailIdc"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailCim"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailVdm"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailSiu"/&gt;
 *           &lt;element ref="{IFX2_3}DevDetailIpm"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{IFX2_3}DevPlatformData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevStatus_Type", propOrder = {
    "devStatusCode",
    "statusDesc",
    "effDt",
    "statusModBy",
    "devDetailCam",
    "devDetailDep",
    "devDetailApp",
    "devDetailTtu",
    "devDetailAlm",
    "devDetailCdm",
    "devDetailPIN",
    "devDetailChk",
    "devDetailPtr",
    "devDetailIdc",
    "devDetailCim",
    "devDetailVdm",
    "devDetailSiu",
    "devDetailIpm",
    "devPlatformData"
})
public class DevStatusType {

    @XmlElement(name = "DevStatusCode", required = true)
    protected String devStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;
    @XmlElement(name = "DevDetailCam")
    protected DevDetailCamType devDetailCam;
    @XmlElement(name = "DevDetailDep")
    protected DevDetailDepType devDetailDep;
    @XmlElement(name = "DevDetailApp")
    protected DevDetailAppType devDetailApp;
    @XmlElement(name = "DevDetailTtu")
    protected DevDetailTtuType devDetailTtu;
    @XmlElement(name = "DevDetailAlm")
    protected DevDetailAlmType devDetailAlm;
    @XmlElement(name = "DevDetailCdm")
    protected DevDetailCdmType devDetailCdm;
    @XmlElement(name = "DevDetailPIN")
    protected DevDetailPINType devDetailPIN;
    @XmlElement(name = "DevDetailChk")
    protected DevDetailChkType devDetailChk;
    @XmlElement(name = "DevDetailPtr")
    protected DevDetailPtrType devDetailPtr;
    @XmlElement(name = "DevDetailIdc")
    protected DevDetailIdcType devDetailIdc;
    @XmlElement(name = "DevDetailCim")
    protected DevDetailCimType devDetailCim;
    @XmlElement(name = "DevDetailVdm")
    protected DevDetailVdmType devDetailVdm;
    @XmlElement(name = "DevDetailSiu")
    protected DevDetailSiuType devDetailSiu;
    @XmlElement(name = "DevDetailIpm")
    protected DevDetailIpmType devDetailIpm;
    @XmlElement(name = "DevPlatformData")
    protected DevPlatformDataType devPlatformData;

    /**
     * Gets the value of the devStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevStatusCode() {
        return devStatusCode;
    }

    /**
     * Sets the value of the devStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevStatusCode(String value) {
        this.devStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

    /**
     * Gets the value of the devDetailCam property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCamType }
     *     
     */
    public DevDetailCamType getDevDetailCam() {
        return devDetailCam;
    }

    /**
     * Sets the value of the devDetailCam property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCamType }
     *     
     */
    public void setDevDetailCam(DevDetailCamType value) {
        this.devDetailCam = value;
    }

    /**
     * Gets the value of the devDetailDep property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailDepType }
     *     
     */
    public DevDetailDepType getDevDetailDep() {
        return devDetailDep;
    }

    /**
     * Sets the value of the devDetailDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailDepType }
     *     
     */
    public void setDevDetailDep(DevDetailDepType value) {
        this.devDetailDep = value;
    }

    /**
     * Gets the value of the devDetailApp property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailAppType }
     *     
     */
    public DevDetailAppType getDevDetailApp() {
        return devDetailApp;
    }

    /**
     * Sets the value of the devDetailApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailAppType }
     *     
     */
    public void setDevDetailApp(DevDetailAppType value) {
        this.devDetailApp = value;
    }

    /**
     * Gets the value of the devDetailTtu property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailTtuType }
     *     
     */
    public DevDetailTtuType getDevDetailTtu() {
        return devDetailTtu;
    }

    /**
     * Sets the value of the devDetailTtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailTtuType }
     *     
     */
    public void setDevDetailTtu(DevDetailTtuType value) {
        this.devDetailTtu = value;
    }

    /**
     * Gets the value of the devDetailAlm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailAlmType }
     *     
     */
    public DevDetailAlmType getDevDetailAlm() {
        return devDetailAlm;
    }

    /**
     * Sets the value of the devDetailAlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailAlmType }
     *     
     */
    public void setDevDetailAlm(DevDetailAlmType value) {
        this.devDetailAlm = value;
    }

    /**
     * Gets the value of the devDetailCdm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCdmType }
     *     
     */
    public DevDetailCdmType getDevDetailCdm() {
        return devDetailCdm;
    }

    /**
     * Sets the value of the devDetailCdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCdmType }
     *     
     */
    public void setDevDetailCdm(DevDetailCdmType value) {
        this.devDetailCdm = value;
    }

    /**
     * Gets the value of the devDetailPIN property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailPINType }
     *     
     */
    public DevDetailPINType getDevDetailPIN() {
        return devDetailPIN;
    }

    /**
     * Sets the value of the devDetailPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailPINType }
     *     
     */
    public void setDevDetailPIN(DevDetailPINType value) {
        this.devDetailPIN = value;
    }

    /**
     * Gets the value of the devDetailChk property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailChkType }
     *     
     */
    public DevDetailChkType getDevDetailChk() {
        return devDetailChk;
    }

    /**
     * Sets the value of the devDetailChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailChkType }
     *     
     */
    public void setDevDetailChk(DevDetailChkType value) {
        this.devDetailChk = value;
    }

    /**
     * Gets the value of the devDetailPtr property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailPtrType }
     *     
     */
    public DevDetailPtrType getDevDetailPtr() {
        return devDetailPtr;
    }

    /**
     * Sets the value of the devDetailPtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailPtrType }
     *     
     */
    public void setDevDetailPtr(DevDetailPtrType value) {
        this.devDetailPtr = value;
    }

    /**
     * Gets the value of the devDetailIdc property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailIdcType }
     *     
     */
    public DevDetailIdcType getDevDetailIdc() {
        return devDetailIdc;
    }

    /**
     * Sets the value of the devDetailIdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailIdcType }
     *     
     */
    public void setDevDetailIdc(DevDetailIdcType value) {
        this.devDetailIdc = value;
    }

    /**
     * Gets the value of the devDetailCim property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCimType }
     *     
     */
    public DevDetailCimType getDevDetailCim() {
        return devDetailCim;
    }

    /**
     * Sets the value of the devDetailCim property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCimType }
     *     
     */
    public void setDevDetailCim(DevDetailCimType value) {
        this.devDetailCim = value;
    }

    /**
     * Gets the value of the devDetailVdm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailVdmType }
     *     
     */
    public DevDetailVdmType getDevDetailVdm() {
        return devDetailVdm;
    }

    /**
     * Sets the value of the devDetailVdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailVdmType }
     *     
     */
    public void setDevDetailVdm(DevDetailVdmType value) {
        this.devDetailVdm = value;
    }

    /**
     * Gets the value of the devDetailSiu property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailSiuType }
     *     
     */
    public DevDetailSiuType getDevDetailSiu() {
        return devDetailSiu;
    }

    /**
     * Sets the value of the devDetailSiu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailSiuType }
     *     
     */
    public void setDevDetailSiu(DevDetailSiuType value) {
        this.devDetailSiu = value;
    }

    /**
     * Gets the value of the devDetailIpm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailIpmType }
     *     
     */
    public DevDetailIpmType getDevDetailIpm() {
        return devDetailIpm;
    }

    /**
     * Sets the value of the devDetailIpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailIpmType }
     *     
     */
    public void setDevDetailIpm(DevDetailIpmType value) {
        this.devDetailIpm = value;
    }

    /**
     * Gets the value of the devPlatformData property.
     * 
     * @return
     *     possible object is
     *     {@link DevPlatformDataType }
     *     
     */
    public DevPlatformDataType getDevPlatformData() {
        return devPlatformData;
    }

    /**
     * Sets the value of the devPlatformData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPlatformDataType }
     *     
     */
    public void setDevPlatformData(DevPlatformDataType value) {
        this.devPlatformData = value;
    }

}