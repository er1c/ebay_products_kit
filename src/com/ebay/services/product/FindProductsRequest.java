
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is a request object containing input for the find product operation
 * 					
 * 
 * <p>Java class for FindProductsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindProductsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="productSearch" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindProductsRequest", propOrder = {
    "productSearch"
})
public class FindProductsRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<ProductRequest> productSearch;

    /**
     * Gets the value of the productSearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRequest }
     * 
     * 
     */
    public List<ProductRequest> getProductSearch() {
        if (productSearch == null) {
            productSearch = new ArrayList<ProductRequest>();
        }
        return this.productSearch;
    }

}
