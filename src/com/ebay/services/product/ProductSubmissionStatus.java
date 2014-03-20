
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Status details for a single product submission.
 * 					
 * 
 * <p>Java class for ProductSubmissionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSubmissionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productSubmissionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmissionStatusCode"/>
 *         &lt;element name="statusReasonCode" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmissionStatusReasonCode" minOccurs="0"/>
 *         &lt;element name="statusReasonDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ePID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSubmissionStatus", propOrder = {
    "productSubmissionId",
    "statusCode",
    "statusReasonCode",
    "statusReasonDetail",
    "epid"
})
public class ProductSubmissionStatus
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String productSubmissionId;
    @XmlElement(required = true)
    protected ProductSubmissionStatusCode statusCode;
    protected String statusReasonCode;
    protected String statusReasonDetail;
    @XmlElement(name = "ePID")
    protected List<String> epid;

    /**
     * Gets the value of the productSubmissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubmissionId() {
        return productSubmissionId;
    }

    /**
     * Sets the value of the productSubmissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubmissionId(String value) {
        this.productSubmissionId = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubmissionStatusCode }
     *     
     */
    public ProductSubmissionStatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubmissionStatusCode }
     *     
     */
    public void setStatusCode(ProductSubmissionStatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Sets the value of the statusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasonCode(String value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the statusReasonDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasonDetail() {
        return statusReasonDetail;
    }

    /**
     * Sets the value of the statusReasonDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasonDetail(String value) {
        this.statusReasonDetail = value;
    }

    /**
     * Gets the value of the epid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEPID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEPID() {
        if (epid == null) {
            epid = new ArrayList<String>();
        }
        return this.epid;
    }

}
