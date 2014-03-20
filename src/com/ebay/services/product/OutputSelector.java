
package com.ebay.services.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputSelector.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputSelector">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProductSubmission"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputSelector")
@XmlEnum
public enum OutputSelector {


    /**
     * 
     * 								Include the product submission details in the response. These are the
     * 								name-value properties used to describe the product. In some cases, the
     * 								returned properties may vary from the submitted properties. [This was
     * 								mentioned in a meeting. When does this happen? Does this only happen for
     * 								submissions that are approved?]
     * 							
     * 
     */
    @XmlEnumValue("ProductSubmission")
    PRODUCT_SUBMISSION("ProductSubmission");
    private final String value;

    OutputSelector(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputSelector fromValue(String v) {
        for (OutputSelector c: OutputSelector.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
