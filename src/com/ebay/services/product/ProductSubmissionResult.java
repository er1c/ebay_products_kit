
package com.ebay.services.product;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						TBD
 * 					
 * 
 * <p>Java class for ProductSubmissionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSubmissionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="productSubmission" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmission" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmissionStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSubmissionResult", propOrder = {
    "productSubmission",
    "status"
})
public class ProductSubmissionResult
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected ProductSubmission productSubmission;
    @XmlElement(required = true)
    protected ProductSubmissionStatus status;

    /**
     * Gets the value of the productSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubmission }
     *     
     */
    public ProductSubmission getProductSubmission() {
        return productSubmission;
    }

    /**
     * Sets the value of the productSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubmission }
     *     
     */
    public void setProductSubmission(ProductSubmission value) {
        this.productSubmission = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubmissionStatus }
     *     
     */
    public ProductSubmissionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubmissionStatus }
     *     
     */
    public void setStatus(ProductSubmissionStatus value) {
        this.status = value;
    }

}
