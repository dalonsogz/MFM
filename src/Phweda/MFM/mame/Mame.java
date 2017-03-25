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

import java.io.Serializable;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://MFM.Phweda/MAME}machine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="build" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="debug" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mameconfig" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "machine"
})
@XmlRootElement(name = "mame")
public class Mame implements Serializable {

    private static final long serialVersionUID = -2353256163229379894L;

    @XmlElements({
            @XmlElement(name="machine", type=Machine.class),
            @XmlElement(name="game", type=Machine.class)
    })
    protected Set<Machine> machine;
    @XmlAttribute(name = "build")
    protected String build;
    @XmlAttribute(name = "debug")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String debug;
    @XmlAttribute(name = "mameconfig", required = true)
    protected String mameconfig;
    @XmlTransient
    protected Map<String, Machine> machineMap;

    /**
     * Gets the value of the machine property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machine property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachine().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Machine }
     */
    public Set<Machine> getMachine() {
        if (machine == null) {
            machine = new TreeSet<Machine>();
        }
        return this.machine;
    }

    public Map<String, Machine> getMachineMap() {
        if (machineMap == null) {
            machineMap = generateMachineMap();
        }
        return this.machineMap;
    }

    /**
     * Gets the value of the build property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the debug property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDebug() {
        if (debug == null) {
            return "no";
        } else {
            return debug;
        }
    }

    /**
     * Sets the value of the debug property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDebug(String value) {
        this.debug = value;
    }

    /**
     * Gets the value of the mameconfig property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMameconfig() {
        return mameconfig;
    }

    /**
     * Sets the value of the mameconfig property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMameconfig(String value) {
        this.mameconfig = value;
    }

    private Map<String, Machine> generateMachineMap() {
        Map map = new HashMap<String, Machine>();
        this.getMachine().forEach((machine) -> {
            map.put(machine.getName(), machine);
        });
        return map;
    }

}
