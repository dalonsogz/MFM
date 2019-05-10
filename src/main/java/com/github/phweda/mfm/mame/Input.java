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
// Generated on: 2016.09.19 at 10:16:00 AM EDT 
//


package com.github.phweda.mfm.mame;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{http://MFM.Phweda/MAME}control" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="service" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tilt" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="players" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buttons" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coins" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "control",
        "unknownElements"
})
@XmlRootElement(name = "input")
public class Input {

    protected List<Control> control;
    @XmlAttribute(name = "service")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String service;
    @XmlAttribute(name = "tilt")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tilt;
    @XmlAttribute(name = "players", required = true)
    protected String players;
    @XmlAttribute(name = "buttons")
    protected String buttons;
    @XmlAttribute(name = "coins")
    protected String coins;

    // Catchall for any unknown Elements. As MAME DTD changes this will allow for
    // continuation of MFM without a code change. BUT IS NOT RECOMMENDED.
    // Addition of Elements and Attributes should be handled with code updates.
    @XmlAnyElement(lax = true)
    private List<Object> unknownElements;

    /**
     * Gets the value of the control property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
     */
    public List<Control> getControl() {
        if (control == null) {
            control = new ArrayList<Control>();
        }
        return this.control;
    }

    /**
     * Gets the value of the service property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getService() {
        if (service == null) {
            return "no";
        } else {
            return service;
        }
    }

    /**
     * Sets the value of the service property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the tilt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTilt() {
        if (tilt == null) {
            return "no";
        } else {
            return tilt;
        }
    }

    /**
     * Sets the value of the tilt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTilt(String value) {
        this.tilt = value;
    }

    /**
     * Gets the value of the players property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlayers() {
        return players;
    }

    /**
     * Sets the value of the players property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlayers(String value) {
        this.players = value;
    }

    /**
     * Gets the value of the buttons property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setButtons(String value) {
        this.buttons = value;
    }

    /**
     * Gets the value of the coins property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCoins() {
        return coins;
    }

    /**
     * Sets the value of the coins property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoins(String value) {
        this.coins = value;
    }

}