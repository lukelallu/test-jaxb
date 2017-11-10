//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.10 at 05:12:24 PM EST 
//


package ifx2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailIpm_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailIpm_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{IFX2_3}DevDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}DevIpmOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmAcceptor" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmMediaState" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmInk" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmToner" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmFrontImageScanner" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmBackImageScanner" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmMICRReader" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmStacker" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmReBuncher" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmMediaFeeder" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}DevIpmPosition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailIpm_Type", propOrder = {
    "devIpmOperation",
    "devIpmAcceptor",
    "devIpmMediaState",
    "devIpmInk",
    "devIpmToner",
    "devIpmFrontImageScanner",
    "devIpmBackImageScanner",
    "devIpmMICRReader",
    "devIpmStacker",
    "devIpmReBuncher",
    "devIpmMediaFeeder",
    "devIpmPosition"
})
public class DevDetailIpmType
    extends DevDetailType
{

    @XmlElement(name = "DevIpmOperation")
    protected String devIpmOperation;
    @XmlElement(name = "DevIpmAcceptor")
    protected DevIpmAcceptorType devIpmAcceptor;
    @XmlElement(name = "DevIpmMediaState")
    @XmlSchemaType(name = "string")
    protected DevIpmMediaStateType devIpmMediaState;
    @XmlElement(name = "DevIpmInk")
    @XmlSchemaType(name = "string")
    protected DevIpmInkType devIpmInk;
    @XmlElement(name = "DevIpmToner")
    @XmlSchemaType(name = "string")
    protected DevIpmTonerType devIpmToner;
    @XmlElement(name = "DevIpmFrontImageScanner")
    @XmlSchemaType(name = "string")
    protected DevIpmFrontImageScannerType devIpmFrontImageScanner;
    @XmlElement(name = "DevIpmBackImageScanner")
    @XmlSchemaType(name = "string")
    protected DevIpmBackImageScannerType devIpmBackImageScanner;
    @XmlElement(name = "DevIpmMICRReader")
    @XmlSchemaType(name = "string")
    protected DevIpmMICRReaderType devIpmMICRReader;
    @XmlElement(name = "DevIpmStacker")
    @XmlSchemaType(name = "string")
    protected DevIpmStackerType devIpmStacker;
    @XmlElement(name = "DevIpmReBuncher")
    @XmlSchemaType(name = "string")
    protected DevIpmReBuncherType devIpmReBuncher;
    @XmlElement(name = "DevIpmMediaFeeder")
    @XmlSchemaType(name = "string")
    protected DevIpmMediaFeederType devIpmMediaFeeder;
    @XmlElement(name = "DevIpmPosition")
    protected List<DevIpmPositionType> devIpmPosition;

    /**
     * Gets the value of the devIpmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevIpmOperation() {
        return devIpmOperation;
    }

    /**
     * Sets the value of the devIpmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevIpmOperation(String value) {
        this.devIpmOperation = value;
    }

    /**
     * Gets the value of the devIpmAcceptor property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmAcceptorType }
     *     
     */
    public DevIpmAcceptorType getDevIpmAcceptor() {
        return devIpmAcceptor;
    }

    /**
     * Sets the value of the devIpmAcceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmAcceptorType }
     *     
     */
    public void setDevIpmAcceptor(DevIpmAcceptorType value) {
        this.devIpmAcceptor = value;
    }

    /**
     * Gets the value of the devIpmMediaState property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmMediaStateType }
     *     
     */
    public DevIpmMediaStateType getDevIpmMediaState() {
        return devIpmMediaState;
    }

    /**
     * Sets the value of the devIpmMediaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmMediaStateType }
     *     
     */
    public void setDevIpmMediaState(DevIpmMediaStateType value) {
        this.devIpmMediaState = value;
    }

    /**
     * Gets the value of the devIpmInk property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmInkType }
     *     
     */
    public DevIpmInkType getDevIpmInk() {
        return devIpmInk;
    }

    /**
     * Sets the value of the devIpmInk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmInkType }
     *     
     */
    public void setDevIpmInk(DevIpmInkType value) {
        this.devIpmInk = value;
    }

    /**
     * Gets the value of the devIpmToner property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmTonerType }
     *     
     */
    public DevIpmTonerType getDevIpmToner() {
        return devIpmToner;
    }

    /**
     * Sets the value of the devIpmToner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmTonerType }
     *     
     */
    public void setDevIpmToner(DevIpmTonerType value) {
        this.devIpmToner = value;
    }

    /**
     * Gets the value of the devIpmFrontImageScanner property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmFrontImageScannerType }
     *     
     */
    public DevIpmFrontImageScannerType getDevIpmFrontImageScanner() {
        return devIpmFrontImageScanner;
    }

    /**
     * Sets the value of the devIpmFrontImageScanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmFrontImageScannerType }
     *     
     */
    public void setDevIpmFrontImageScanner(DevIpmFrontImageScannerType value) {
        this.devIpmFrontImageScanner = value;
    }

    /**
     * Gets the value of the devIpmBackImageScanner property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmBackImageScannerType }
     *     
     */
    public DevIpmBackImageScannerType getDevIpmBackImageScanner() {
        return devIpmBackImageScanner;
    }

    /**
     * Sets the value of the devIpmBackImageScanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmBackImageScannerType }
     *     
     */
    public void setDevIpmBackImageScanner(DevIpmBackImageScannerType value) {
        this.devIpmBackImageScanner = value;
    }

    /**
     * Gets the value of the devIpmMICRReader property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmMICRReaderType }
     *     
     */
    public DevIpmMICRReaderType getDevIpmMICRReader() {
        return devIpmMICRReader;
    }

    /**
     * Sets the value of the devIpmMICRReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmMICRReaderType }
     *     
     */
    public void setDevIpmMICRReader(DevIpmMICRReaderType value) {
        this.devIpmMICRReader = value;
    }

    /**
     * Gets the value of the devIpmStacker property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmStackerType }
     *     
     */
    public DevIpmStackerType getDevIpmStacker() {
        return devIpmStacker;
    }

    /**
     * Sets the value of the devIpmStacker property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmStackerType }
     *     
     */
    public void setDevIpmStacker(DevIpmStackerType value) {
        this.devIpmStacker = value;
    }

    /**
     * Gets the value of the devIpmReBuncher property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmReBuncherType }
     *     
     */
    public DevIpmReBuncherType getDevIpmReBuncher() {
        return devIpmReBuncher;
    }

    /**
     * Sets the value of the devIpmReBuncher property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmReBuncherType }
     *     
     */
    public void setDevIpmReBuncher(DevIpmReBuncherType value) {
        this.devIpmReBuncher = value;
    }

    /**
     * Gets the value of the devIpmMediaFeeder property.
     * 
     * @return
     *     possible object is
     *     {@link DevIpmMediaFeederType }
     *     
     */
    public DevIpmMediaFeederType getDevIpmMediaFeeder() {
        return devIpmMediaFeeder;
    }

    /**
     * Sets the value of the devIpmMediaFeeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIpmMediaFeederType }
     *     
     */
    public void setDevIpmMediaFeeder(DevIpmMediaFeederType value) {
        this.devIpmMediaFeeder = value;
    }

    /**
     * Gets the value of the devIpmPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devIpmPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevIpmPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevIpmPositionType }
     * 
     * 
     */
    public List<DevIpmPositionType> getDevIpmPosition() {
        if (devIpmPosition == null) {
            devIpmPosition = new ArrayList<DevIpmPositionType>();
        }
        return this.devIpmPosition;
    }

}