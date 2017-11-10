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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}FIIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BranchIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}BranchName" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PostAddr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIData_Type", propOrder = {
    "fiIdentType",
    "fiIdent",
    "refData",
    "name",
    "branchIdent",
    "branchName",
    "postAddr"
})
public class FIDataType {

    @XmlElement(name = "FIIdentType")
    protected String fiIdentType;
    @XmlElement(name = "FIIdent")
    protected String fiIdent;
    @XmlElement(name = "RefData")
    protected List<RefDataType> refData;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BranchIdent")
    protected String branchIdent;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;

    /**
     * Gets the value of the fiIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdentType() {
        return fiIdentType;
    }

    /**
     * Sets the value of the fiIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdentType(String value) {
        this.fiIdentType = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the refData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefDataType }
     * 
     * 
     */
    public List<RefDataType> getRefData() {
        if (refData == null) {
            refData = new ArrayList<RefDataType>();
        }
        return this.refData;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType }
     *     
     */
    public PostAddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType }
     *     
     */
    public void setPostAddr(PostAddrType value) {
        this.postAddr = value;
    }

}
