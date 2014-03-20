
package com.ebay.services.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						Request object for getProductFitmentDetails operation.
 * 					
 * 
 * <p>Java class for GetProductCompatibilitiesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductCompatibilitiesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="productIdentifier" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductIdentifier"/>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PaginationInput" minOccurs="0"/>
 *         &lt;element name="applicationPropertyFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataset" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}CompatibilitySort" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disabledProductFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductStatus" minOccurs="0"/>
 *         &lt;element name="datasetPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductCompatibilitiesRequest", propOrder = {
    "productIdentifier",
    "paginationInput",
    "applicationPropertyFilter",
    "dataset",
    "sortOrder",
    "disabledProductFilter",
    "datasetPropertyName"
})
public class GetProductCompatibilitiesRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected ProductIdentifier productIdentifier;
    protected PaginationInput paginationInput;
    protected List<PropertyValue> applicationPropertyFilter;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> dataset;
    protected List<CompatibilitySort> sortOrder;
    protected ProductStatus disabledProductFilter;
    @XmlElement(required = true)
    protected List<String> datasetPropertyName;

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier }
     *     
     */
    public ProductIdentifier getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier }
     *     
     */
    public void setProductIdentifier(ProductIdentifier value) {
        this.productIdentifier = value;
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
     * Gets the value of the applicationPropertyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationPropertyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationPropertyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValue }
     * 
     * 
     */
    public List<PropertyValue> getApplicationPropertyFilter() {
        if (applicationPropertyFilter == null) {
            applicationPropertyFilter = new ArrayList<PropertyValue>();
        }
        return this.applicationPropertyFilter;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataset() {
        if (dataset == null) {
            dataset = new ArrayList<String>();
        }
        return this.dataset;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompatibilitySort }
     * 
     * 
     */
    public List<CompatibilitySort> getSortOrder() {
        if (sortOrder == null) {
            sortOrder = new ArrayList<CompatibilitySort>();
        }
        return this.sortOrder;
    }

    /**
     * Gets the value of the disabledProductFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getDisabledProductFilter() {
        return disabledProductFilter;
    }

    /**
     * Sets the value of the disabledProductFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setDisabledProductFilter(ProductStatus value) {
        this.disabledProductFilter = value;
    }

    /**
     * Gets the value of the datasetPropertyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetPropertyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetPropertyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatasetPropertyName() {
        if (datasetPropertyName == null) {
            datasetPropertyName = new ArrayList<String>();
        }
        return this.datasetPropertyName;
    }

}
