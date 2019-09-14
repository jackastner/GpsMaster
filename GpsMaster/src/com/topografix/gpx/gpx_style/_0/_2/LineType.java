//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.02 at 04:06:17 PM CET 
//


package com.topografix.gpx.gpx_style._0._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 		Graphical style for a linear feature (route, track, border of filled object, etc).
 * 	  
 * 
 * <p>Java class for lineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.topografix.com/GPX/gpx_style/0/2}colorType" minOccurs="0"/>
 *         &lt;element name="opacity" type="{http://www.topografix.com/GPX/gpx_style/0/2}opacityType" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linecap" type="{http://www.topografix.com/GPX/gpx_style/0/2}linecapType" minOccurs="0"/>
 *         &lt;element name="dasharray" type="{http://www.topografix.com/GPX/gpx_style/0/2}dasharrayType" minOccurs="0"/>
 *         &lt;element name="extensions" type="{http://www.topografix.com/GPX/gpx_style/0/2}extensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineType", propOrder = {
    "color",
    "opacity",
    "width",
    "pattern",
    "linecap",
    "dasharray",
    "extensions"
})
public class LineType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] color;
    protected BigDecimal opacity;
    protected BigDecimal width;
    protected String pattern;
    protected LinecapType linecap;
    protected DasharrayType dasharray;
    protected ExtensionsType extensions;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(byte[] value) {
        this.color = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpacity(BigDecimal value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the linecap property.
     * 
     * @return
     *     possible object is
     *     {@link LinecapType }
     *     
     */
    public LinecapType getLinecap() {
        return linecap;
    }

    /**
     * Sets the value of the linecap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinecapType }
     *     
     */
    public void setLinecap(LinecapType value) {
        this.linecap = value;
    }

    /**
     * Gets the value of the dasharray property.
     * 
     * @return
     *     possible object is
     *     {@link DasharrayType }
     *     
     */
    public DasharrayType getDasharray() {
        return dasharray;
    }

    /**
     * Sets the value of the dasharray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DasharrayType }
     *     
     */
    public void setDasharray(DasharrayType value) {
        this.dasharray = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

}
