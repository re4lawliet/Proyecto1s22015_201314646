
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
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

<<<<<<< HEAD
    private final static QName _BorrarResponse_QNAME = new QName("http://Servicio/", "BorrarResponse");
    private final static QName _LogearChofer_QNAME = new QName("http://Servicio/", "LogearChofer");
    private final static QName _ExisteAdmin_QNAME = new QName("http://Servicio/", "ExisteAdmin");
    private final static QName _ImprimirAvlAdminResponse_QNAME = new QName("http://Servicio/", "ImprimirAvlAdminResponse");
    private final static QName _LogearEstacionesGenerales_QNAME = new QName("http://Servicio/", "LogearEstacionesGenerales");
    private final static QName _GetAdmin_QNAME = new QName("http://Servicio/", "getAdmin");
    private final static QName _GraficarArbolAdministradorResponse_QNAME = new QName("http://Servicio/", "GraficarArbolAdministradorResponse");
    private final static QName _ImprimirAvlAdmin_QNAME = new QName("http://Servicio/", "ImprimirAvlAdmin");
    private final static QName _VolumenResponse_QNAME = new QName("http://Servicio/", "VolumenResponse");
    private final static QName _GetAdminNombreResponse_QNAME = new QName("http://Servicio/", "getAdminNombreResponse");
    private final static QName _AgregarResponse_QNAME = new QName("http://Servicio/", "AgregarResponse");
    private final static QName _LogearEstacionesGeneralesResponse_QNAME = new QName("http://Servicio/", "LogearEstacionesGeneralesResponse");
    private final static QName _ImprimirAdminsResponse_QNAME = new QName("http://Servicio/", "ImprimirAdminsResponse");
    private final static QName _ImprimirAdmins_QNAME = new QName("http://Servicio/", "ImprimirAdmins");
    private final static QName _ExisteAdminResponse_QNAME = new QName("http://Servicio/", "ExisteAdminResponse");
    private final static QName _Borrar_QNAME = new QName("http://Servicio/", "Borrar");
    private final static QName _Agregar_QNAME = new QName("http://Servicio/", "Agregar");
    private final static QName _LogearChoferResponse_QNAME = new QName("http://Servicio/", "LogearChoferResponse");
    private final static QName _InsertarAdmin_QNAME = new QName("http://Servicio/", "InsertarAdmin");
    private final static QName _ImprimirAdminRetornoResponse_QNAME = new QName("http://Servicio/", "ImprimirAdminRetornoResponse");
    private final static QName _GetAdminResponse_QNAME = new QName("http://Servicio/", "getAdminResponse");
    private final static QName _LogearAdmin_QNAME = new QName("http://Servicio/", "LogearAdmin");
    private final static QName _AgregarAvlAdmin_QNAME = new QName("http://Servicio/", "AgregarAvlAdmin");
    private final static QName _ImprimirAdminRetorno_QNAME = new QName("http://Servicio/", "ImprimirAdminRetorno");
    private final static QName _LogearAdminResponse_QNAME = new QName("http://Servicio/", "LogearAdminResponse");
    private final static QName _Volumen_QNAME = new QName("http://Servicio/", "Volumen");
    private final static QName _LogearEstaciones_QNAME = new QName("http://Servicio/", "LogearEstaciones");
    private final static QName _InsertarAdminResponse_QNAME = new QName("http://Servicio/", "InsertarAdminResponse");
    private final static QName _GetAdminNombre_QNAME = new QName("http://Servicio/", "getAdminNombre");
    private final static QName _LogearEstacionesResponse_QNAME = new QName("http://Servicio/", "LogearEstacionesResponse");
    private final static QName _GraficarArbolAdministrador_QNAME = new QName("http://Servicio/", "GraficarArbolAdministrador");
    private final static QName _AgregarAvlAdminResponse_QNAME = new QName("http://Servicio/", "AgregarAvlAdminResponse");
=======
    private final static QName _Agregar_QNAME = new QName("http://Servicio/", "Agregar");
    private final static QName _AgregarResponse_QNAME = new QName("http://Servicio/", "AgregarResponse");
    private final static QName _Volumen_QNAME = new QName("http://Servicio/", "Volumen");
    private final static QName _VolumenResponse_QNAME = new QName("http://Servicio/", "VolumenResponse");
>>>>>>> origin/master

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link InsertarAdminResponse }
     * 
     */
    public InsertarAdminResponse createInsertarAdminResponse() {
        return new InsertarAdminResponse();
    }

    /**
     * Create an instance of {@link GetAdminNombre }
     * 
     */
    public GetAdminNombre createGetAdminNombre() {
        return new GetAdminNombre();
    }

    /**
     * Create an instance of {@link LogearEstacionesResponse }
     * 
     */
    public LogearEstacionesResponse createLogearEstacionesResponse() {
        return new LogearEstacionesResponse();
    }

    /**
     * Create an instance of {@link GraficarArbolAdministrador }
     * 
     */
    public GraficarArbolAdministrador createGraficarArbolAdministrador() {
        return new GraficarArbolAdministrador();
    }

    /**
     * Create an instance of {@link AgregarAvlAdminResponse }
     * 
     */
    public AgregarAvlAdminResponse createAgregarAvlAdminResponse() {
        return new AgregarAvlAdminResponse();
    }

    /**
=======
>>>>>>> origin/master
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link LogearChoferResponse }
     * 
     */
    public LogearChoferResponse createLogearChoferResponse() {
        return new LogearChoferResponse();
    }

    /**
     * Create an instance of {@link InsertarAdmin }
     * 
     */
    public InsertarAdmin createInsertarAdmin() {
        return new InsertarAdmin();
    }

    /**
     * Create an instance of {@link ImprimirAdminRetornoResponse }
     * 
     */
    public ImprimirAdminRetornoResponse createImprimirAdminRetornoResponse() {
        return new ImprimirAdminRetornoResponse();
    }

    /**
     * Create an instance of {@link GetAdminResponse }
     * 
     */
    public GetAdminResponse createGetAdminResponse() {
        return new GetAdminResponse();
    }

    /**
     * Create an instance of {@link LogearAdmin }
     * 
     */
    public LogearAdmin createLogearAdmin() {
        return new LogearAdmin();
    }

    /**
     * Create an instance of {@link AgregarAvlAdmin }
     * 
     */
    public AgregarAvlAdmin createAgregarAvlAdmin() {
        return new AgregarAvlAdmin();
    }

    /**
     * Create an instance of {@link ImprimirAdminRetorno }
     * 
     */
    public ImprimirAdminRetorno createImprimirAdminRetorno() {
        return new ImprimirAdminRetorno();
    }

    /**
     * Create an instance of {@link LogearAdminResponse }
     * 
     */
    public LogearAdminResponse createLogearAdminResponse() {
        return new LogearAdminResponse();
    }

    /**
     * Create an instance of {@link Volumen }
     * 
     */
    public Volumen createVolumen() {
        return new Volumen();
    }

    /**
     * Create an instance of {@link LogearEstaciones }
     * 
     */
    public LogearEstaciones createLogearEstaciones() {
        return new LogearEstaciones();
    }

    /**
     * Create an instance of {@link GetAdminNombreResponse }
     * 
     */
    public GetAdminNombreResponse createGetAdminNombreResponse() {
        return new GetAdminNombreResponse();
    }

    /**
=======
>>>>>>> origin/master
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link LogearEstacionesGeneralesResponse }
     * 
     */
    public LogearEstacionesGeneralesResponse createLogearEstacionesGeneralesResponse() {
        return new LogearEstacionesGeneralesResponse();
    }

    /**
     * Create an instance of {@link ImprimirAdminsResponse }
     * 
     */
    public ImprimirAdminsResponse createImprimirAdminsResponse() {
        return new ImprimirAdminsResponse();
    }

    /**
     * Create an instance of {@link ImprimirAdmins }
     * 
     */
    public ImprimirAdmins createImprimirAdmins() {
        return new ImprimirAdmins();
    }

    /**
     * Create an instance of {@link ExisteAdminResponse }
     * 
     */
    public ExisteAdminResponse createExisteAdminResponse() {
        return new ExisteAdminResponse();
    }

    /**
     * Create an instance of {@link Borrar }
     * 
     */
    public Borrar createBorrar() {
        return new Borrar();
    }

    /**
     * Create an instance of {@link BorrarResponse }
     * 
     */
    public BorrarResponse createBorrarResponse() {
        return new BorrarResponse();
    }

    /**
     * Create an instance of {@link LogearChofer }
     * 
     */
    public LogearChofer createLogearChofer() {
        return new LogearChofer();
    }

    /**
     * Create an instance of {@link ExisteAdmin }
     * 
     */
    public ExisteAdmin createExisteAdmin() {
        return new ExisteAdmin();
    }

    /**
     * Create an instance of {@link ImprimirAvlAdminResponse }
     * 
     */
    public ImprimirAvlAdminResponse createImprimirAvlAdminResponse() {
        return new ImprimirAvlAdminResponse();
    }

    /**
     * Create an instance of {@link LogearEstacionesGenerales }
     * 
     */
    public LogearEstacionesGenerales createLogearEstacionesGenerales() {
        return new LogearEstacionesGenerales();
    }

    /**
     * Create an instance of {@link GetAdmin }
     * 
     */
    public GetAdmin createGetAdmin() {
        return new GetAdmin();
    }

    /**
     * Create an instance of {@link GraficarArbolAdministradorResponse }
     * 
     */
    public GraficarArbolAdministradorResponse createGraficarArbolAdministradorResponse() {
        return new GraficarArbolAdministradorResponse();
    }

    /**
     * Create an instance of {@link ImprimirAvlAdmin }
     * 
     */
    public ImprimirAvlAdmin createImprimirAvlAdmin() {
        return new ImprimirAvlAdmin();
=======
     * Create an instance of {@link Volumen }
     * 
     */
    public Volumen createVolumen() {
        return new Volumen();
>>>>>>> origin/master
    }

    /**
     * Create an instance of {@link VolumenResponse }
     * 
     */
    public VolumenResponse createVolumenResponse() {
        return new VolumenResponse();
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link NodoAdministrador }
     * 
     */
    public NodoAdministrador createNodoAdministrador() {
        return new NodoAdministrador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "BorrarResponse")
    public JAXBElement<BorrarResponse> createBorrarResponse(BorrarResponse value) {
        return new JAXBElement<BorrarResponse>(_BorrarResponse_QNAME, BorrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearChofer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearChofer")
    public JAXBElement<LogearChofer> createLogearChofer(LogearChofer value) {
        return new JAXBElement<LogearChofer>(_LogearChofer_QNAME, LogearChofer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ExisteAdmin")
    public JAXBElement<ExisteAdmin> createExisteAdmin(ExisteAdmin value) {
        return new JAXBElement<ExisteAdmin>(_ExisteAdmin_QNAME, ExisteAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAvlAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAvlAdminResponse")
    public JAXBElement<ImprimirAvlAdminResponse> createImprimirAvlAdminResponse(ImprimirAvlAdminResponse value) {
        return new JAXBElement<ImprimirAvlAdminResponse>(_ImprimirAvlAdminResponse_QNAME, ImprimirAvlAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearEstacionesGenerales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearEstacionesGenerales")
    public JAXBElement<LogearEstacionesGenerales> createLogearEstacionesGenerales(LogearEstacionesGenerales value) {
        return new JAXBElement<LogearEstacionesGenerales>(_LogearEstacionesGenerales_QNAME, LogearEstacionesGenerales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "getAdmin")
    public JAXBElement<GetAdmin> createGetAdmin(GetAdmin value) {
        return new JAXBElement<GetAdmin>(_GetAdmin_QNAME, GetAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraficarArbolAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "GraficarArbolAdministradorResponse")
    public JAXBElement<GraficarArbolAdministradorResponse> createGraficarArbolAdministradorResponse(GraficarArbolAdministradorResponse value) {
        return new JAXBElement<GraficarArbolAdministradorResponse>(_GraficarArbolAdministradorResponse_QNAME, GraficarArbolAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAvlAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAvlAdmin")
    public JAXBElement<ImprimirAvlAdmin> createImprimirAvlAdmin(ImprimirAvlAdmin value) {
        return new JAXBElement<ImprimirAvlAdmin>(_ImprimirAvlAdmin_QNAME, ImprimirAvlAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "VolumenResponse")
    public JAXBElement<VolumenResponse> createVolumenResponse(VolumenResponse value) {
        return new JAXBElement<VolumenResponse>(_VolumenResponse_QNAME, VolumenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "getAdminNombreResponse")
    public JAXBElement<GetAdminNombreResponse> createGetAdminNombreResponse(GetAdminNombreResponse value) {
        return new JAXBElement<GetAdminNombreResponse>(_GetAdminNombreResponse_QNAME, GetAdminNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearEstacionesGeneralesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearEstacionesGeneralesResponse")
    public JAXBElement<LogearEstacionesGeneralesResponse> createLogearEstacionesGeneralesResponse(LogearEstacionesGeneralesResponse value) {
        return new JAXBElement<LogearEstacionesGeneralesResponse>(_LogearEstacionesGeneralesResponse_QNAME, LogearEstacionesGeneralesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAdminsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAdminsResponse")
    public JAXBElement<ImprimirAdminsResponse> createImprimirAdminsResponse(ImprimirAdminsResponse value) {
        return new JAXBElement<ImprimirAdminsResponse>(_ImprimirAdminsResponse_QNAME, ImprimirAdminsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAdmins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAdmins")
    public JAXBElement<ImprimirAdmins> createImprimirAdmins(ImprimirAdmins value) {
        return new JAXBElement<ImprimirAdmins>(_ImprimirAdmins_QNAME, ImprimirAdmins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ExisteAdminResponse")
    public JAXBElement<ExisteAdminResponse> createExisteAdminResponse(ExisteAdminResponse value) {
        return new JAXBElement<ExisteAdminResponse>(_ExisteAdminResponse_QNAME, ExisteAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Borrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Borrar")
    public JAXBElement<Borrar> createBorrar(Borrar value) {
        return new JAXBElement<Borrar>(_Borrar_QNAME, Borrar.class, null, value);
    }

    /**
=======
>>>>>>> origin/master
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearChoferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearChoferResponse")
    public JAXBElement<LogearChoferResponse> createLogearChoferResponse(LogearChoferResponse value) {
        return new JAXBElement<LogearChoferResponse>(_LogearChoferResponse_QNAME, LogearChoferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "InsertarAdmin")
    public JAXBElement<InsertarAdmin> createInsertarAdmin(InsertarAdmin value) {
        return new JAXBElement<InsertarAdmin>(_InsertarAdmin_QNAME, InsertarAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAdminRetornoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAdminRetornoResponse")
    public JAXBElement<ImprimirAdminRetornoResponse> createImprimirAdminRetornoResponse(ImprimirAdminRetornoResponse value) {
        return new JAXBElement<ImprimirAdminRetornoResponse>(_ImprimirAdminRetornoResponse_QNAME, ImprimirAdminRetornoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "getAdminResponse")
    public JAXBElement<GetAdminResponse> createGetAdminResponse(GetAdminResponse value) {
        return new JAXBElement<GetAdminResponse>(_GetAdminResponse_QNAME, GetAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearAdmin")
    public JAXBElement<LogearAdmin> createLogearAdmin(LogearAdmin value) {
        return new JAXBElement<LogearAdmin>(_LogearAdmin_QNAME, LogearAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAvlAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarAvlAdmin")
    public JAXBElement<AgregarAvlAdmin> createAgregarAvlAdmin(AgregarAvlAdmin value) {
        return new JAXBElement<AgregarAvlAdmin>(_AgregarAvlAdmin_QNAME, AgregarAvlAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirAdminRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ImprimirAdminRetorno")
    public JAXBElement<ImprimirAdminRetorno> createImprimirAdminRetorno(ImprimirAdminRetorno value) {
        return new JAXBElement<ImprimirAdminRetorno>(_ImprimirAdminRetorno_QNAME, ImprimirAdminRetorno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearAdminResponse")
    public JAXBElement<LogearAdminResponse> createLogearAdminResponse(LogearAdminResponse value) {
        return new JAXBElement<LogearAdminResponse>(_LogearAdminResponse_QNAME, LogearAdminResponse.class, null, value);
=======
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
>>>>>>> origin/master
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Volumen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Volumen")
    public JAXBElement<Volumen> createVolumen(Volumen value) {
        return new JAXBElement<Volumen>(_Volumen_QNAME, Volumen.class, null, value);
    }

    /**
<<<<<<< HEAD
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearEstaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearEstaciones")
    public JAXBElement<LogearEstaciones> createLogearEstaciones(LogearEstaciones value) {
        return new JAXBElement<LogearEstaciones>(_LogearEstaciones_QNAME, LogearEstaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "InsertarAdminResponse")
    public JAXBElement<InsertarAdminResponse> createInsertarAdminResponse(InsertarAdminResponse value) {
        return new JAXBElement<InsertarAdminResponse>(_InsertarAdminResponse_QNAME, InsertarAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "getAdminNombre")
    public JAXBElement<GetAdminNombre> createGetAdminNombre(GetAdminNombre value) {
        return new JAXBElement<GetAdminNombre>(_GetAdminNombre_QNAME, GetAdminNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearEstacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "LogearEstacionesResponse")
    public JAXBElement<LogearEstacionesResponse> createLogearEstacionesResponse(LogearEstacionesResponse value) {
        return new JAXBElement<LogearEstacionesResponse>(_LogearEstacionesResponse_QNAME, LogearEstacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraficarArbolAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "GraficarArbolAdministrador")
    public JAXBElement<GraficarArbolAdministrador> createGraficarArbolAdministrador(GraficarArbolAdministrador value) {
        return new JAXBElement<GraficarArbolAdministrador>(_GraficarArbolAdministrador_QNAME, GraficarArbolAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAvlAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarAvlAdminResponse")
    public JAXBElement<AgregarAvlAdminResponse> createAgregarAvlAdminResponse(AgregarAvlAdminResponse value) {
        return new JAXBElement<AgregarAvlAdminResponse>(_AgregarAvlAdminResponse_QNAME, AgregarAvlAdminResponse.class, null, value);
=======
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "VolumenResponse")
    public JAXBElement<VolumenResponse> createVolumenResponse(VolumenResponse value) {
        return new JAXBElement<VolumenResponse>(_VolumenResponse_QNAME, VolumenResponse.class, null, value);
>>>>>>> origin/master
    }

}
