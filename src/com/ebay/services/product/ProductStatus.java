
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This will indicate if the product is disabled for the
 * 						specific application like selling flow, review flow or
 * 						half sell flow.
 * 					
 * 
 * <p>Java class for ProductStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="excludeForeBaySelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeForeBayReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeForHalfSelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductStatus", propOrder = {
    "excludeForeBaySelling",
    "excludeForeBayReviews",
    "excludeForHalfSelling",
    "any"
})
public class ProductStatus
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean excludeForeBaySelling;
    protected Boolean excludeForeBayReviews;
    protected Boolean excludeForHalfSelling;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the excludeForeBaySelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeForeBaySelling() {
        return excludeForeBaySelling;
    }

    /**
     * Sets the value of the excludeForeBaySelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeForeBaySelling(Boolean value) {
        this.excludeForeBaySelling = value;
    }

    /**
     * Gets the value of the excludeForeBayReviews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeForeBayReviews() {
        return excludeForeBayReviews;
    }

    /**
     * Sets the value of the excludeForeBayReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeForeBayReviews(Boolean value) {
        this.excludeForeBayReviews = value;
    }

    /**
     * Gets the value of the excludeForHalfSelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeForHalfSelling() {
        return excludeForHalfSelling;
    }

    /**
     * Sets the value of the excludeForHalfSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeForHalfSelling(Boolean value) {
        this.excludeForHalfSelling = value;
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
