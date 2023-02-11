
package es.uma.galvez.isia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.uma.galvez.isia package. 
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

    private final static QName _NubeEtiquetas_QNAME = new QName("http://isia.galvez.uma.es/", "nubeEtiquetas");
    private final static QName _GetLetraDNIResponse_QNAME = new QName("http://isia.galvez.uma.es/", "getLetraDNIResponse");
    private final static QName _HolaResponse_QNAME = new QName("http://isia.galvez.uma.es/", "holaResponse");
    private final static QName _GetLetraDNI_QNAME = new QName("http://isia.galvez.uma.es/", "getLetraDNI");
    private final static QName _Hola_QNAME = new QName("http://isia.galvez.uma.es/", "hola");
    private final static QName _NubeEtiquetasResponse_QNAME = new QName("http://isia.galvez.uma.es/", "nubeEtiquetasResponse");
    private final static QName _NubeEtiquetasResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.uma.galvez.isia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HolaResponse }
     * 
     */
    public HolaResponse createHolaResponse() {
        return new HolaResponse();
    }

    /**
     * Create an instance of {@link GetLetraDNIResponse }
     * 
     */
    public GetLetraDNIResponse createGetLetraDNIResponse() {
        return new GetLetraDNIResponse();
    }

    /**
     * Create an instance of {@link NubeEtiquetas }
     * 
     */
    public NubeEtiquetas createNubeEtiquetas() {
        return new NubeEtiquetas();
    }

    /**
     * Create an instance of {@link Hola }
     * 
     */
    public Hola createHola() {
        return new Hola();
    }

    /**
     * Create an instance of {@link NubeEtiquetasResponse }
     * 
     */
    public NubeEtiquetasResponse createNubeEtiquetasResponse() {
        return new NubeEtiquetasResponse();
    }

    /**
     * Create an instance of {@link GetLetraDNI }
     * 
     */
    public GetLetraDNI createGetLetraDNI() {
        return new GetLetraDNI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NubeEtiquetas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "nubeEtiquetas")
    public JAXBElement<NubeEtiquetas> createNubeEtiquetas(NubeEtiquetas value) {
        return new JAXBElement<NubeEtiquetas>(_NubeEtiquetas_QNAME, NubeEtiquetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetraDNIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "getLetraDNIResponse")
    public JAXBElement<GetLetraDNIResponse> createGetLetraDNIResponse(GetLetraDNIResponse value) {
        return new JAXBElement<GetLetraDNIResponse>(_GetLetraDNIResponse_QNAME, GetLetraDNIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "holaResponse")
    public JAXBElement<HolaResponse> createHolaResponse(HolaResponse value) {
        return new JAXBElement<HolaResponse>(_HolaResponse_QNAME, HolaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetraDNI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "getLetraDNI")
    public JAXBElement<GetLetraDNI> createGetLetraDNI(GetLetraDNI value) {
        return new JAXBElement<GetLetraDNI>(_GetLetraDNI_QNAME, GetLetraDNI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "hola")
    public JAXBElement<Hola> createHola(Hola value) {
        return new JAXBElement<Hola>(_Hola_QNAME, Hola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NubeEtiquetasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isia.galvez.uma.es/", name = "nubeEtiquetasResponse")
    public JAXBElement<NubeEtiquetasResponse> createNubeEtiquetasResponse(NubeEtiquetasResponse value) {
        return new JAXBElement<NubeEtiquetasResponse>(_NubeEtiquetasResponse_QNAME, NubeEtiquetasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = NubeEtiquetasResponse.class)
    public JAXBElement<byte[]> createNubeEtiquetasResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_NubeEtiquetasResponseReturn_QNAME, byte[].class, NubeEtiquetasResponse.class, ((byte[]) value));
    }

}
