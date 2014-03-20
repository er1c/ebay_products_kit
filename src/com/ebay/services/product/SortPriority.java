
package com.ebay.services.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sort1"/>
 *     &lt;enumeration value="Sort2"/>
 *     &lt;enumeration value="Sort3"/>
 *     &lt;enumeration value="Sort4"/>
 *     &lt;enumeration value="Sort5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortPriority")
@XmlEnum
public enum SortPriority {


    /**
     * 
     * 								Specifies that the associated property should be sorted first.
     * 							
     * 
     */
    @XmlEnumValue("Sort1")
    SORT_1("Sort1"),

    /**
     * 
     * 								Specifies that the associated property should be sorted second.
     * 							
     * 
     */
    @XmlEnumValue("Sort2")
    SORT_2("Sort2"),

    /**
     * 
     * 								Specifies that the associated property should be sorted third.
     * 							
     * 
     */
    @XmlEnumValue("Sort3")
    SORT_3("Sort3"),

    /**
     * 
     * 								Specifies that the associated property should be sorted fourth.
     * 							
     * 
     */
    @XmlEnumValue("Sort4")
    SORT_4("Sort4"),

    /**
     * 
     * 								Specifies that the associated property should be sorted fifth.
     * 							
     * 
     */
    @XmlEnumValue("Sort5")
    SORT_5("Sort5");
    private final String value;

    SortPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortPriority fromValue(String v) {
        for (SortPriority c: SortPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
