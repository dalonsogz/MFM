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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Year_QNAME = new QName("", "year");
    private static final QName _Description_QNAME = new QName("", "description");
    private static final QName _Publisher_QNAME = new QName("", "publisher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
        // For new instances
    }

    /**
     * Create an instance of {@link Software }
     */
    public Software createSoftware() {
        return new Software();
    }

    /**
     * Create an instance of {@link Info }
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link Sharedfeat }
     */
    public Sharedfeat createSharedfeat() {
        return new Sharedfeat();
    }

    /**
     * Create an instance of {@link Part }
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link Feature }
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link Dataarea }
     */
    public Dataarea createDataarea() {
        return new Dataarea();
    }

    /**
     * Create an instance of {@link Rom }
     */
    public Rom createRom() {
        return new Rom();
    }

    /**
     * Create an instance of {@link Diskarea }
     */
    public Diskarea createDiskarea() {
        return new Diskarea();
    }

    /**
     * Create an instance of {@link Disk }
     */
    public Disk createDisk() {
        return new Disk();
    }

    /**
     * Create an instance of {@link Dipswitch }
     */
    public Dipswitch createDipswitch() {
        return new Dipswitch();
    }

    /**
     * Create an instance of {@link Dipvalue }
     */
    public Dipvalue createDipvalue() {
        return new Dipvalue();
    }

    /**
     * Create an instance of {@link Softwarelist }
     */
    public Softwarelist createSoftwarelist() {
        return new Softwarelist();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "publisher")
    public JAXBElement<String> createPublisher(String value) {
        return new JAXBElement<>(_Publisher_QNAME, String.class, null, value);
    }

}
