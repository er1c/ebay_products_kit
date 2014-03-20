
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is a request object for retrieving status for one or more product 
 * 						submissions.
 * 					
 * 
 * <p>Java class for GetProductSubmissionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSubmissionsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productSubmissionFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductSubmissionFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputSelector" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}OutputSelector" minOccurs="0"/>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PaginationInput" minOccurs="0"/>
 *         &lt;element name="sortOption" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}SortOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSubmissionsRequest", propOrder = {
    "productSubmissionFilter",
    "outputSelector",
    "paginationInput",
    "sortOption"
})
public class GetProductSubmissionsRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<ProductSubmissionFilter> productSubmissionFilter;
    protected OutputSelector outputSelector;
    protected PaginationInput paginationInput;
    protected List<SortOption> sortOption;

    /**
     * Gets the value of the productSubmissionFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSubmissionFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSubmissionFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubmissionFilter }
     * 
     * 
     */
    public List<ProductSubmissionFilter> getProductSubmissionFilter() {
        if (productSubmissionFilter == null) {
            productSubmissionFilter = new ArrayList<ProductSubmissionFilter>();
        }
        return this.productSubmissionFilter;
    }

    /**
     * Gets the value of the outputSelector property.
     * 
     * @return
     *     possible object is
     *     {@link OutputSelector }
     *     
     */
    public OutputSelector getOutputSelector() {
        return outputSelector;
    }

    /**
     * Sets the value of the outputSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSelector }
     *     
     */
    public void setOutputSelector(OutputSelector value) {
        this.outputSelector = value;
    }

    /**
     * Gets the value of the paginationInput property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPaginationInput() {
        return paginationInput;
    }

    /**
     * Sets the value of the paginationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPaginationInput(PaginationInput value) {
        this.paginationInput = value;
    }

    /**
     * Gets the value of the sortOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortOption }
     * 
     * 
     */
    public List<SortOption> getSortOption() {
        if (sortOption == null) {
            sortOption = new ArrayList<SortOption>();
        }
        return this.sortOption;
    }

}
