
package com.ebay.services.product;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Container for details about any media used to describe a product.
 * 					
 * 
 * <p>Java class for Media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Media">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediaIdentifier" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}MediaIdentifier"/>
 *         &lt;element name="mediaType" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}MediaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", propOrder = {
    "mediaIdentifier",
    "mediaType"
})
public class Media
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected MediaIdentifier mediaIdentifier;
    @XmlElement(required = true)
    protected MediaType mediaType;

    /**
     * Gets the value of the mediaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MediaIdentifier }
     *     
     */
    public MediaIdentifier getMediaIdentifier() {
        return mediaIdentifier;
    }

    /**
     * Sets the value of the mediaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaIdentifier }
     *     
     */
    public void setMediaIdentifier(MediaIdentifier value) {
        this.mediaIdentifier = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMediaType(MediaType value) {
        this.mediaType = value;
    }

}
