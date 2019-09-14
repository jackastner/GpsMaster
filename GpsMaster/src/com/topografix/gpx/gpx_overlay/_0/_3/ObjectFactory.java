//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.02 at 04:06:17 PM CET 
//


package com.topografix.gpx.gpx_overlay._0._3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.topografix.gpx.gpx_overlay._0._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Polyline_QNAME = new QName("http://www.topografix.com/GPX/gpx_overlay/0/3", "polyline");
    private final static QName _MaxScale_QNAME = new QName("http://www.topografix.com/GPX/gpx_overlay/0/3", "max_scale");
    private final static QName _Points_QNAME = new QName("http://www.topografix.com/GPX/gpx_overlay/0/3", "points");
    private final static QName _Label_QNAME = new QName("http://www.topografix.com/GPX/gpx_overlay/0/3", "label");
    private final static QName _Pt_QNAME = new QName("http://www.topografix.com/GPX/gpx_overlay/0/3", "pt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.topografix.gpx.gpx_overlay._0._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PolylineType }
     * 
     */
    public PolylineType createPolylineType() {
        return new PolylineType();
    }

    /**
     * Create an instance of {@link PtType }
     * 
     */
    public PtType createPtType() {
        return new PtType();
    }

    /**
     * Create an instance of {@link LabelType }
     * 
     */
    public LabelType createLabelType() {
        return new LabelType();
    }

    /**
     * Create an instance of {@link PointsType }
     * 
     */
    public PointsType createPointsType() {
        return new PointsType();
    }

    /**
     * Create an instance of {@link XyOffsetType }
     * 
     */
    public XyOffsetType createXyOffsetType() {
        return new XyOffsetType();
    }

    /**
     * Create an instance of {@link ExtensionsType }
     * 
     */
    public ExtensionsType createExtensionsType() {
        return new ExtensionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolylineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topografix.com/GPX/gpx_overlay/0/3", name = "polyline")
    public JAXBElement<PolylineType> createPolyline(PolylineType value) {
        return new JAXBElement<PolylineType>(_Polyline_QNAME, PolylineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topografix.com/GPX/gpx_overlay/0/3", name = "max_scale")
    public JAXBElement<BigDecimal> createMaxScale(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaxScale_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topografix.com/GPX/gpx_overlay/0/3", name = "points")
    public JAXBElement<PointsType> createPoints(PointsType value) {
        return new JAXBElement<PointsType>(_Points_QNAME, PointsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topografix.com/GPX/gpx_overlay/0/3", name = "label")
    public JAXBElement<LabelType> createLabel(LabelType value) {
        return new JAXBElement<LabelType>(_Label_QNAME, LabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topografix.com/GPX/gpx_overlay/0/3", name = "pt")
    public JAXBElement<PtType> createPt(PtType value) {
        return new JAXBElement<PtType>(_Pt_QNAME, PtType.class, null, value);
    }

}
