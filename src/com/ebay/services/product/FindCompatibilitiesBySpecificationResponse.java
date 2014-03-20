
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
 * 						Container for the Compatibility by specification
 * 						operation output.
 * 					
 * 
 * <p>Java class for FindCompatibilitiesBySpecificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompatibilitiesBySpecificationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="paginationOutput" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PaginationOutput"/>
 *         &lt;element name="compatibilityDetails" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}CompatibilityDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompatibilitiesBySpecificationResponse", propOrder = {
    "paginationOutput",
    "compatibilityDetails"
})
public class FindCompatibilitiesBySpecificationResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected PaginationOutput paginationOutput;
    protected List<CompatibilityDetails> compatibilityDetails;

    /**
     * Gets the value of the paginationOutput property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationOutput }
     *     
     */
    public PaginationOutput getPaginationOutput() {
        return paginationOutput;
    }

    /**
     * Sets the value of the paginationOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationOutput }
     *     
     */
    public void setPaginationOutput(PaginationOutput value) {
        this.paginationOutput = value;
    }

    /**
     * Gets the value of the compatibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompatibilityDetails }
     * 
     * 
     */
    public List<CompatibilityDetails> getCompatibilityDetails() {
        if (compatibilityDetails == null) {
            compatibilityDetails = new ArrayList<CompatibilityDetails>();
        }
        return this.compatibilityDetails;
    }

}
