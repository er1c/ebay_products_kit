
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
 * 						Container for a single compatibility filter.
 * 					
 * 
 * <p>Java class for CompatibilityPropertyFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompatibilityPropertyFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="propertyFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="AAIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="HSNTSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompatibilityPropertyFilter", propOrder = {
    "propertyFilter",
    "aaia",
    "hsntsn",
    "any"
})
public class CompatibilityPropertyFilter
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<PropertyValue> propertyFilter;
    @XmlElement(name = "AAIA")
    protected String aaia;
    @XmlElement(name = "HSNTSN")
    protected String hsntsn;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the propertyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValue }
     * 
     * 
     */
    public List<PropertyValue> getPropertyFilter() {
        if (propertyFilter == null) {
            propertyFilter = new ArrayList<PropertyValue>();
        }
        return this.propertyFilter;
    }

    /**
     * Gets the value of the aaia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAIA() {
        return aaia;
    }

    /**
     * Sets the value of the aaia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAIA(String value) {
        this.aaia = value;
    }

    /**
     * Gets the value of the hsntsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNTSN() {
        return hsntsn;
    }

    /**
     * Sets the value of the hsntsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNTSN(String value) {
        this.hsntsn = value;
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
