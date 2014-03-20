
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is a request object containing input for the 
 * 						findProductsByCompatibility operation. 
 * 					
 * 
 * <p>Java class for FindProductsByCompatibilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindProductsByCompatibilityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="productByCompatibilitySearch" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductByCompatibilityRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindProductsByCompatibilityRequest", propOrder = {
    "productByCompatibilitySearch"
})
public class FindProductsByCompatibilityRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<ProductByCompatibilityRequest> productByCompatibilitySearch;

    /**
     * Gets the value of the productByCompatibilitySearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productByCompatibilitySearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductByCompatibilitySearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductByCompatibilityRequest }
     * 
     * 
     */
    public List<ProductByCompatibilityRequest> getProductByCompatibilitySearch() {
        if (productByCompatibilitySearch == null) {
            productByCompatibilitySearch = new ArrayList<ProductByCompatibilityRequest>();
        }
        return this.productByCompatibilitySearch;
    }

}
