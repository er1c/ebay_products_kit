
package com.ebay.services.product;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Returns the processing status for an individual product submitted with 
 * 						addProducts.
 * 					
 * 
 * <p>Java class for AddProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProductResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="invocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AddProductResponse", propOrder = {
    "invocationId",
    "status"
})
public class AddProductResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String invocationId;
    @XmlElement(required = true)
    protected ProductSubmissionStatus status;

    /**
     * Gets the value of the invocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationId() {
        return invocationId;
    }

    /**
     * Sets the value of the invocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationId(String value) {
        this.invocationId = value;
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
