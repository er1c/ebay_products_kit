
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
 * 						This is a request object containing input for adding one or more products to 
 * 						the eBay catalog.
 * 					
 * 
 * <p>Java class for AddProductsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProductsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="addProductRequest" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmission" maxOccurs="unbounded"/>
 *         &lt;element name="clientBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddProductsRequest", propOrder = {
    "addProductRequest",
    "clientBatchId"
})
public class AddProductsRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<ProductSubmission> addProductRequest;
    protected String clientBatchId;

    /**
     * Gets the value of the addProductRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addProductRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddProductRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubmission }
     * 
     * 
     */
    public List<ProductSubmission> getAddProductRequest() {
        if (addProductRequest == null) {
            addProductRequest = new ArrayList<ProductSubmission>();
        }
        return this.addProductRequest;
    }

    /**
     * Gets the value of the clientBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBatchId() {
        return clientBatchId;
    }

    /**
     * Sets the value of the clientBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBatchId(String value) {
        this.clientBatchId = value;
    }

}
