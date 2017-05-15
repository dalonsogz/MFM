/*
 * MAME FILE MANAGER - MAME resources management tool
 * Copyright (c) 2017.  Author phweda : phweda1@yahoo.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.19 at 10:16:00 AM EDT 
//


package Phweda.MFM.mame;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sha1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="merge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="writable" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="status" default="good">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="baddump"/>
 *             &lt;enumeration value="nodump"/>
 *             &lt;enumeration value="good"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="optional" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "disk")
public class Disk implements Serializable {

    private static final long serialVersionUID = -6245630220631860847L;

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "sha1")
    protected String sha1;
    @XmlAttribute(name = "md5")
    protected String md5;
    @XmlAttribute(name = "merge")
    protected String merge;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "index")
    protected String index;
    @XmlAttribute(name = "writable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writable;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "optional")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optional;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sha1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * Sets the value of the sha1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSha1(String value) {
        this.sha1 = value;
    }

    /**
     * Gets the value of the md5 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMd5() {
        return md5;
    }

    /**
     * Sets the value of the md5 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMd5(String value) {
        this.md5 = value;
    }

    /**
     * Gets the value of the merge property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMerge() {
        return merge;
    }

    /**
     * Sets the value of the merge property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMerge(String value) {
        this.merge = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the index property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the writable property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWritable() {
        if (writable == null) {
            return "no";
        } else {
            return writable;
        }
    }

    /**
     * Sets the value of the writable property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWritable(String value) {
        this.writable = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        if (status == null) {
            return "good";
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the optional property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptional() {
        if (optional == null) {
            return "no";
        } else {
            return optional;
        }
    }

    /**
     * Sets the value of the optional property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptional(String value) {
        this.optional = value;
    }

}
