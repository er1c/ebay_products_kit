
package com.ebay.services.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ByProductSubmissionId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortType")
@XmlEnum
public enum SortType {


    /**
     * 
     * 								Sorts the response  by the product submission ID. The sortOrder 
     * 								value determines whether results are returned in ascending or 
     * 								descending order.
     * 							
     * 
     */
    @XmlEnumValue("ByProductSubmissionId")
    BY_PRODUCT_SUBMISSION_ID("ByProductSubmissionId");
    private final String value;

    SortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortType fromValue(String v) {
        for (SortType c: SortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
