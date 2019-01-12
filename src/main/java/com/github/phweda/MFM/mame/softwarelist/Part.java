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
// Generated on: 2017.10.24 at 07:54:20 PM EDT 
//


package com.github.phweda.MFM.mame.softwarelist;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
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
 *       &lt;sequence>
 *         &lt;element ref="{}feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}dataarea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}diskarea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}dipswitch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interface" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@SuppressWarnings({"WeakerAccess", "squid:S00116"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "feature",
        "dataarea",
        "diskarea",
        "dipswitch"
})
@XmlRootElement(name = "part")
public class Part {

    protected List<Feature> feature;
    protected List<Dataarea> dataarea;
    protected List<Diskarea> diskarea;
    protected List<Dipswitch> dipswitch;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "interface", required = true)
    protected String _interface;

    /**
     * Gets the value of the feature property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the dataarea property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataarea property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataarea().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataarea }
     */
    public List<Dataarea> getDataarea() {
        if (dataarea == null) {
            dataarea = new ArrayList<>();
        }
        return this.dataarea;
    }

    /**
     * Gets the value of the diskarea property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskarea property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiskarea().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diskarea }
     */
    public List<Diskarea> getDiskarea() {
        if (diskarea == null) {
            diskarea = new ArrayList<>();
        }
        return this.diskarea;
    }

    /**
     * Gets the value of the dipswitch property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dipswitch property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDipswitch().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dipswitch }
     */
    public List<Dipswitch> getDipswitch() {
        if (dipswitch == null) {
            dipswitch = new ArrayList<>();
        }
        return this.dipswitch;
    }

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
     * Gets the value of the interface property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}
