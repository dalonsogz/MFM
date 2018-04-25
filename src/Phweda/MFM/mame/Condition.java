//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 01:53:37 PM EDT 
//


package Phweda.MFM.mame;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="tag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mask" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relation" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="eq"/>
 *             &lt;enumeration value="ne"/>
 *             &lt;enumeration value="gt"/>
 *             &lt;enumeration value="le"/>
 *             &lt;enumeration value="lt"/>
 *             &lt;enumeration value="ge"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "condition")
public class Condition {

    @XmlAttribute(name = "tag", required = true)
    protected String tag;
    @XmlAttribute(name = "mask", required = true)
    protected String mask;
    @XmlAttribute(name = "relation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relation;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    // Catchall for any unknown Elements. As MAME DTD changes this will allow for
    // continuation of MFM without a code change. BUT IS NOT RECOMMENDED
    // Addition of Elements and Attributes should be handled with code updates.
    @XmlAnyElement(lax = true)
    private List<Object> unknownElements;

    /**
     * Gets the value of the tag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the mask property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the relation property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

}
