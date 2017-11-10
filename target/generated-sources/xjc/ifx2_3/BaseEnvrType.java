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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{IFX2_3}CreatedDt"/&gt;
 *         &lt;element ref="{IFX2_3}CreateRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ClientCreateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ClientBusinessDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastUpdateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LastUpdateRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}CardKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PassbkKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}NetworkTrnData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ServerTerminalSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}PointOfServiceData" minOccurs="0"/&gt;
 *         &lt;element ref="{IFX2_3}ClientTerminalSeqNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseEnvr_Type", propOrder = {
    "createdDt",
    "createRefIdent",
    "clientCreateDt",
    "clientBusinessDt",
    "lastUpdateDt",
    "lastUpdateRqUID",
    "loginName",
    "partyKeys",
    "cardKeys",
    "passbkKeys",
    "networkTrnData",
    "serverTerminalSeqNum",
    "pointOfServiceData",
    "clientTerminalSeqNum"
})
@XmlSeeAlso({
    AcctAcctRelEnvrType.class,
    AcctEnvrType.class,
    AcctHoldEnvrType.class,
    AcctPayOffEnvrType.class,
    AcctStmtEnvrType.class,
    AcctTrnEnvrType.class,
    AcctTrnImgEnvrType.class,
    AlertEnvrType.class,
    AthEnvrType.class,
    BillEnvrType.class,
    BillerEnvrType.class,
    CardAcctRelEnvrType.class,
    CardEnvrType.class,
    CardOrderEnvrType.class,
    CardUpdateEnvrType.class,
    ChkAcceptEnvrType.class,
    ChkIssueEnvrType.class,
    ChkOrdEnvrType.class,
    ChksumEnvrType.class,
    CompRemitStmtEnvrType.class,
    CreditEnvrType.class,
    CustPayeeEnvrType.class,
    DebitEnvrType.class,
    DepBkOrdEnvrType.class,
    DevEnvrType.class,
    DiscEnvrType.class,
    DisputeEnvrType.class,
    ForExDealEnvrType.class,
    ForExQuoteEnvrType.class,
    ForExRateSheetEnvrType.class,
    InventoryEnvrType.class,
    MediaAcctEnvrType.class,
    MediaAcctTrnEnvrType.class,
    NoteEnvrType.class,
    OfferEnvrType.class,
    PartyCardRelEnvrType.class,
    PartyEnvrType.class,
    PartySvcAcctRelEnvrType.class,
    PartySvcRelEnvrType.class,
    PassbkEnvrType.class,
    PassbkItemEnvrType.class,
    PmtBatchEnvrType.class,
    PmtBatchStatEnvrType.class,
    PmtEnclEnvrType.class,
    PmtEnvrType.class,
    ProdIntRateEnvrType.class,
    PurchItemEnvrType.class,
    RecurChkOrdEnvrType.class,
    RecurPmtEnvrType.class,
    RecurXferEnvrType.class,
    RemitEnvrType.class,
    SecObjEnvrType.class,
    StdPayeeEnvrType.class,
    StopChkEnvrType.class,
    SvcEnvrType.class,
    SvcProviderEnvrType.class,
    TerminalObjEnvrType.class,
    TerminalSPObjEnvrType.class,
    XferEnvrType.class,
    PartyAcctRelEnvrType.class,
    PartyPartyRelEnvrType.class
})
public class BaseEnvrType {

    @XmlElement(name = "CreatedDt", required = true)
    protected String createdDt;
    @XmlElement(name = "CreateRefIdent")
    protected String createRefIdent;
    @XmlElement(name = "ClientCreateDt")
    protected String clientCreateDt;
    @XmlElement(name = "ClientBusinessDt")
    protected String clientBusinessDt;
    @XmlElement(name = "LastUpdateDt")
    protected String lastUpdateDt;
    @XmlElement(name = "LastUpdateRqUID")
    protected String lastUpdateRqUID;
    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "PartyKeys")
    protected PartyKeysType partyKeys;
    @XmlElement(name = "CardKeys")
    protected CardKeysType cardKeys;
    @XmlElement(name = "PassbkKeys")
    protected PassbkKeysType passbkKeys;
    @XmlElement(name = "NetworkTrnData")
    protected NetworkTrnDataType networkTrnData;
    @XmlElement(name = "ServerTerminalSeqNum")
    protected String serverTerminalSeqNum;
    @XmlElement(name = "PointOfServiceData")
    protected PointOfServiceDataType pointOfServiceData;
    @XmlElement(name = "ClientTerminalSeqNum")
    protected String clientTerminalSeqNum;

    /**
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDt(String value) {
        this.createdDt = value;
    }

    /**
     * Gets the value of the createRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateRefIdent() {
        return createRefIdent;
    }

    /**
     * Sets the value of the createRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateRefIdent(String value) {
        this.createRefIdent = value;
    }

    /**
     * Gets the value of the clientCreateDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCreateDt() {
        return clientCreateDt;
    }

    /**
     * Sets the value of the clientCreateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCreateDt(String value) {
        this.clientCreateDt = value;
    }

    /**
     * Gets the value of the clientBusinessDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBusinessDt() {
        return clientBusinessDt;
    }

    /**
     * Sets the value of the clientBusinessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBusinessDt(String value) {
        this.clientBusinessDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDt(String value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the lastUpdateRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateRqUID() {
        return lastUpdateRqUID;
    }

    /**
     * Sets the value of the lastUpdateRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateRqUID(String value) {
        this.lastUpdateRqUID = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PartyKeysType }
     *     
     */
    public PartyKeysType getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyKeysType }
     *     
     */
    public void setPartyKeys(PartyKeysType value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the cardKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CardKeysType }
     *     
     */
    public CardKeysType getCardKeys() {
        return cardKeys;
    }

    /**
     * Sets the value of the cardKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardKeysType }
     *     
     */
    public void setCardKeys(CardKeysType value) {
        this.cardKeys = value;
    }

    /**
     * Gets the value of the passbkKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkKeysType }
     *     
     */
    public PassbkKeysType getPassbkKeys() {
        return passbkKeys;
    }

    /**
     * Sets the value of the passbkKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkKeysType }
     *     
     */
    public void setPassbkKeys(PassbkKeysType value) {
        this.passbkKeys = value;
    }

    /**
     * Gets the value of the networkTrnData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTrnDataType }
     *     
     */
    public NetworkTrnDataType getNetworkTrnData() {
        return networkTrnData;
    }

    /**
     * Sets the value of the networkTrnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTrnDataType }
     *     
     */
    public void setNetworkTrnData(NetworkTrnDataType value) {
        this.networkTrnData = value;
    }

    /**
     * Gets the value of the serverTerminalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTerminalSeqNum() {
        return serverTerminalSeqNum;
    }

    /**
     * Sets the value of the serverTerminalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTerminalSeqNum(String value) {
        this.serverTerminalSeqNum = value;
    }

    /**
     * Gets the value of the pointOfServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public PointOfServiceDataType getPointOfServiceData() {
        return pointOfServiceData;
    }

    /**
     * Sets the value of the pointOfServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public void setPointOfServiceData(PointOfServiceDataType value) {
        this.pointOfServiceData = value;
    }

    /**
     * Gets the value of the clientTerminalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTerminalSeqNum() {
        return clientTerminalSeqNum;
    }

    /**
     * Sets the value of the clientTerminalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTerminalSeqNum(String value) {
        this.clientTerminalSeqNum = value;
    }

}