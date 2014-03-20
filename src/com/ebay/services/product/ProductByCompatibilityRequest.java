
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						This is the base class for product queries by compatible application. 
 * 					
 * 
 * <p>Java class for ProductByCompatibilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductByCompatibilityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationPropertyFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}CompatibilityPropertyFilter" minOccurs="0"/>
 *         &lt;element name="productSearch" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductRequest"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductByCompatibilityRequest", propOrder = {
    "applicationPropertyFilter",
    "productSearch",
    "any"
})
public class ProductByCompatibilityRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CompatibilityPropertyFilter applicationPropertyFilter;
    @XmlElement(required = true)
    protected ProductRequest productSearch;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the applicationPropertyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CompatibilityPropertyFilter }
     *     
     */
    public CompatibilityPropertyFilter getApplicationPropertyFilter() {
        return applicationPropertyFilter;
    }

    /**
     * Sets the value of the applicationPropertyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompatibilityPropertyFilter }
     *     
     */
    public void setApplicationPropertyFilter(CompatibilityPropertyFilter value) {
        this.applicationPropertyFilter = value;
    }

    /**
     * Gets the value of the productSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequest }
     *     
     */
    public ProductRequest getProductSearch() {
        return productSearch;
    }

    /**
     * Sets the value of the productSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequest }
     *     
     */
    public void setProductSearch(ProductRequest value) {
        this.productSearch = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
