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

import javax.xml.bind.annotation.*;
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
 *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="raster"/>
 *             &lt;enumeration value="vector"/>
 *             &lt;enumeration value="lcd"/>
 *             &lt;enumeration value="unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rotate" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="90"/>
 *             &lt;enumeration value="180"/>
 *             &lt;enumeration value="270"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="flipx" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pixclock" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="htotal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hbend" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hbstart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vtotal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vbend" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vbstart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "display")
public class Display implements Serializable {

    private static final long serialVersionUID = -1947876231341041143L;

    @XmlAttribute(name = "tag")
    protected String tag;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "rotate", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rotate;
    @XmlAttribute(name = "flipx")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flipx;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "refresh", required = true)
    protected String refresh;
    @XmlAttribute(name = "pixclock")
    protected String pixclock;
    @XmlAttribute(name = "htotal")
    protected String htotal;
    @XmlAttribute(name = "hbend")
    protected String hbend;
    @XmlAttribute(name = "hbstart")
    protected String hbstart;
    @XmlAttribute(name = "vtotal")
    protected String vtotal;
    @XmlAttribute(name = "vbend")
    protected String vbend;
    @XmlAttribute(name = "vbstart")
    protected String vbstart;

    @XmlAttribute(name = "orientation")
    protected String orientation; // MAME older versions. vertical|horizontal (equivalent of rotate (0|90|180|270))
    @XmlAttribute(name = "screen")
    protected String screen; // MAME older versions. screen == type : raster|vector

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
     * Gets the value of the type property.
     * <p>
     * Altered for MFM to handle previous DTDs with screen attribute
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        if (type != null && !type.isEmpty()) {
            return type;
        } else {
            return getScreen();
        }
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Sets the value of the screen property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScreen(String value) {
        this.screen = value;
    }

    /**
     * Gets the value of the screen property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Gets the value of the rotate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRotate() {
        return rotate;
    }

    /**
     * Sets the value of the rotate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRotate(String value) {
        this.rotate = value;
    }

    /**
     * Gets the value of the orientation property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the flipx property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlipx() {
        if (flipx == null) {
            return "no";
        } else {
            return flipx;
        }
    }

    /**
     * Sets the value of the flipx property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlipx(String value) {
        this.flipx = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the refresh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRefresh(String value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the pixclock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPixclock() {
        return pixclock;
    }

    /**
     * Sets the value of the pixclock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPixclock(String value) {
        this.pixclock = value;
    }

    /**
     * Gets the value of the htotal property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHtotal() {
        return htotal;
    }

    /**
     * Sets the value of the htotal property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHtotal(String value) {
        this.htotal = value;
    }

    /**
     * Gets the value of the hbend property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHbend() {
        return hbend;
    }

    /**
     * Sets the value of the hbend property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHbend(String value) {
        this.hbend = value;
    }

    /**
     * Gets the value of the hbstart property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHbstart() {
        return hbstart;
    }

    /**
     * Sets the value of the hbstart property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHbstart(String value) {
        this.hbstart = value;
    }

    /**
     * Gets the value of the vtotal property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVtotal() {
        return vtotal;
    }

    /**
     * Sets the value of the vtotal property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVtotal(String value) {
        this.vtotal = value;
    }

    /**
     * Gets the value of the vbend property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVbend() {
        return vbend;
    }

    /**
     * Sets the value of the vbend property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVbend(String value) {
        this.vbend = value;
    }

    /**
     * Gets the value of the vbstart property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVbstart() {
        return vbstart;
    }

    /**
     * Sets the value of the vbstart property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVbstart(String value) {
        this.vbstart = value;
    }

}
