
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
 * 						Returns the processing status for products submitted with addProducts.
 * 					
 * 
 * <p>Java class for AddProductsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProductsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="addProductResponse" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}AddProductResponse" maxOccurs="unbounded"/>
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
@XmlType(name = "AddProductsResponse", propOrder = {
    "addProductResponse",
    "clientBatchId"
})
public class AddProductsResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<AddProductResponse> addProductResponse;
    protected String clientBatchId;

    /**
     * Gets the value of the addProductResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addProductResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddProductResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddProductResponse }
     * 
     * 
     */
    public List<AddProductResponse> getAddProductResponse() {
        if (addProductResponse == null) {
            addProductResponse = new ArrayList<AddProductResponse>();
        }
        return this.addProductResponse;
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
