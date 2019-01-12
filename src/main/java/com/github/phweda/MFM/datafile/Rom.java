/*
 * MAME FILE MANAGER - MAME resources management tool
 * Copyright (c) 2011 - 2018.  Author phweda : phweda1@yahoo.com
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
// Generated on: 2016.10.24 at 07:22:36 PM EDT 
//


package com.github.phweda.MFM.datafile;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sha1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="md5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="merge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" default="good">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="baddump"/>
 *             &lt;enumeration value="nodump"/>
 *             &lt;enumeration value="good"/>
 *             &lt;enumeration value="verified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@SuppressWarnings("WeakerAccess")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "rom")
public class Rom {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "size", required = true)
    protected String size;
    @XmlAttribute(name = "crc")
    protected String crc;
    @XmlAttribute(name = "sha1")
    protected String sha1;
    @XmlAttribute(name = "md5")
    protected String md5;
    @XmlAttribute(name = "merge")
    protected String merge;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "date")
    protected String date;

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
     * Gets the value of the size property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the crc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCrc() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCrc(String value) {
        this.crc = value;
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
     * Gets the value of the date property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDate(String value) {
        this.date = value;
    }

}
