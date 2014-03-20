
package com.ebay.services.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSubmissionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSubmissionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductSubmissionStatusCode")
@XmlEnum
public enum ProductSubmissionStatusCode {


    /**
     * 
     * 								The product submission is under review. 
     * 							
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 								The product submission has been approved and added to the eBay 
     * 								catalog. 
     * 							
     * 
     */
    @XmlEnumValue("Approved")
    APPROVED("Approved"),

    /**
     * 
     * 								The product submission was rejected. The product did not meet all 
     * 								acceptance criteria. 
     * 							
     * 
     */
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    ProductSubmissionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSubmissionStatusCode fromValue(String v) {
        for (ProductSubmissionStatusCode c: ProductSubmissionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
