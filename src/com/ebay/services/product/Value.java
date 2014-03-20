
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
 * 						A value can be one of the types: text (string), a number (
 * 					
 * 
 * <p>Java class for Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="text" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}StringValue"/>
 *           &lt;element name="number" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}NumericValue"/>
 *           &lt;element name="URL" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}URIValue"/>
 *         &lt;/choice>
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
@XmlType(name = "Value", propOrder = {
    "text",
    "number",
    "url",
    "any"
})
public class Value
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected StringValue text;
    protected NumericValue number;
    @XmlElement(name = "URL")
    protected URIValue url;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link StringValue }
     *     
     */
    public StringValue getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValue }
     *     
     */
    public void setText(StringValue value) {
        this.text = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link NumericValue }
     *     
     */
    public NumericValue getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValue }
     *     
     */
    public void setNumber(NumericValue value) {
        this.number = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URIValue }
     *     
     */
    public URIValue getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIValue }
     *     
     */
    public void setURL(URIValue value) {
        this.url = value;
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
