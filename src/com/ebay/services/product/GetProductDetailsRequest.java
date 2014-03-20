
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Retrieve product details for the specified product ID, including whether 
 * 						the product has fitment information or not.
 * 					
 * 
 * <p>Java class for GetProductDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductDetailsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="productDetailsRequest" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductDetailsRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductDetailsRequest", propOrder = {
    "productDetailsRequest"
})
public class GetProductDetailsRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<ProductDetailsRequestType> productDetailsRequest;

    /**
     * Gets the value of the productDetailsRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDetailsRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDetailsRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetailsRequestType }
     * 
     * 
     */
    public List<ProductDetailsRequestType> getProductDetailsRequest() {
        if (productDetailsRequest == null) {
            productDetailsRequest = new ArrayList<ProductDetailsRequestType>();
        }
        return this.productDetailsRequest;
    }

}
