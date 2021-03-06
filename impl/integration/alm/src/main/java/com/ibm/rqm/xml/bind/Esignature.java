//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="esigcontributor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}resource"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="esigaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esigtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="esigreason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esigcomment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "esigcontributor",
    "esigaction",
    "esigtime",
    "esigreason",
    "esigcomment"
})
@XmlRootElement(name = "esignature")
public class Esignature {

    @XmlElement(required = true)
    protected Esignature.Esigcontributor esigcontributor;
    @XmlElement(required = true)
    protected String esigaction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar esigtime;
    @XmlElement(required = true)
    protected String esigreason;
    @XmlElement(required = true)
    protected String esigcomment;

    /**
     * Gets the value of the esigcontributor property.
     * 
     * @return
     *     possible object is
     *     {@link Esignature.Esigcontributor }
     *     
     */
    public Esignature.Esigcontributor getEsigcontributor() {
        return esigcontributor;
    }

    /**
     * Sets the value of the esigcontributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Esignature.Esigcontributor }
     *     
     */
    public void setEsigcontributor(Esignature.Esigcontributor value) {
        this.esigcontributor = value;
    }

    /**
     * Gets the value of the esigaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsigaction() {
        return esigaction;
    }

    /**
     * Sets the value of the esigaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsigaction(String value) {
        this.esigaction = value;
    }

    /**
     * Gets the value of the esigtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEsigtime() {
        return esigtime;
    }

    /**
     * Sets the value of the esigtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEsigtime(XMLGregorianCalendar value) {
        this.esigtime = value;
    }

    /**
     * Gets the value of the esigreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsigreason() {
        return esigreason;
    }

    /**
     * Sets the value of the esigreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsigreason(String value) {
        this.esigreason = value;
    }

    /**
     * Gets the value of the esigcomment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsigcomment() {
        return esigcomment;
    }

    /**
     * Sets the value of the esigcomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsigcomment(String value) {
        this.esigcomment = value;
    }


    /**
     * The Jazz Team Server (JTS) user ID of the contributor making the request.
     * 								
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}resource"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Esigcontributor {

        @XmlValue
        protected String content;
        @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
        @XmlSchemaType(name = "anyURI")
        protected String resource;

        /**
         * The Jazz Team Server (JTS) user ID of the contributor making the request.
         * 								
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * [READ-ONLY] The Jazz Team Server (JTS) URL of the contributor making the request.
         * 									
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResource() {
            return resource;
        }

        /**
         * Sets the value of the resource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResource(String value) {
            this.resource = value;
        }

    }

}
