/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author dbpan
 */
public class Documentos {

    DecimalFormat formato = new DecimalFormat("#0.00");

    private int IDfactura;
    private String Tipodocumento;
    private int Codigocliente;
    private String Nombre;
    private String RUC;
    private double DescGen;
    private String Direccion;
    private String Telefono1;
    private String Telefono2;
    private String Referencia;
    private String Credito;
    private String Confirmservicio;
    private String Codigoproducto;
    private String Codigoservicio;
    private String Nombreproducto;
    private String Nombreservicio;
    private String Descripcion;
    private double Cantidad;
    private String Magnitud;
    private double PrecioProducto;
    private double DescLinea;
    private double Impuestos;
    private double ImporteImpuesto;
    private double Base;
    private double Subtotal1;
    private double SumaCantidad;
    private double MontoPrecio;
    private double SumaDescLinea;
    private double SumaDescGen;
    private double Subtotal2;
    private double SumaImpuesto;
    private double Total;
    private double DIF;
    private String FormaPago1;
    private double MontoPago1;
    private String FormaPago2;
    private double MontoPago2;
    private String FormaPago3;
    private double MontoPago3;
    private String FormaPago4;
    private double MontoPago4;
    private Date fecha_registro;

    public Documentos() {
    }

    public Documentos(int IDfactura, String Tipodocumento, int Codigocliente, String Nombre, String RUC, double DescGen, String Direccion, String Telefono1, String Telefono2, String Referencia, String Credito, String Confirmservicio, String Codigoproducto, String Codigoservicio, String Nombreproducto, String Nombreservicio, String Descripcion, double Cantidad, String Magnitud, double PrecioProducto, double DescLinea, double Impuestos, double ImporteImpuesto, double Base, double Subtotal1, double SumaCantidad, double MontoPrecio, double SumaDescLinea, double SumaDescGen, double Subtotal2, double SumaImpuesto, double Total, double DIF, String FormaPago1, double MontoPago1, String FormaPago2, double MontoPago2, String FormaPago3, double MontoPago3, String FormaPago4, double MontoPago4, Date fecha_registro) {
        this.IDfactura = IDfactura;
        this.Tipodocumento = Tipodocumento;
        this.Codigocliente = Codigocliente;
        this.Nombre = Nombre;
        this.RUC = RUC;
        this.DescGen = DescGen;
        this.Direccion = Direccion;
        this.Telefono1 = Telefono1;
        this.Telefono2 = Telefono2;
        this.Referencia = Referencia;
        this.Credito = Credito;
        this.Confirmservicio = Confirmservicio;
        this.Codigoproducto = Codigoproducto;
        this.Codigoservicio = Codigoservicio;
        this.Nombreproducto = Nombreproducto;
        this.Nombreservicio = Nombreservicio;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Magnitud = Magnitud;
        this.PrecioProducto = PrecioProducto;
        this.DescLinea = DescLinea;
        this.Impuestos = Impuestos;
        this.ImporteImpuesto = ImporteImpuesto;
        this.Base = Base;
        this.Subtotal1 = Subtotal1;
        this.SumaCantidad = SumaCantidad;
        this.MontoPrecio = MontoPrecio;
        this.SumaDescLinea = SumaDescLinea;
        this.SumaDescGen = SumaDescGen;
        this.Subtotal2 = Subtotal2;
        this.SumaImpuesto = SumaImpuesto;
        this.Total = Total;
        this.DIF = DIF;
        this.FormaPago1 = FormaPago1;
        this.MontoPago1 = MontoPago1;
        this.FormaPago2 = FormaPago2;
        this.MontoPago2 = MontoPago2;
        this.FormaPago3 = FormaPago3;
        this.MontoPago3 = MontoPago3;
        this.FormaPago4 = FormaPago4;
        this.MontoPago4 = MontoPago4;
        this.fecha_registro = fecha_registro;
    }

    public String getTipodocumento() {
        return Tipodocumento;
    }

    public void setTipodocumento(String Tipodocumento) {
        this.Tipodocumento = Tipodocumento;
    }

    public int getIDfactura() {
        return this.IDfactura;
    }

    public void setIDfactura(int IDfactura) {
        this.IDfactura = IDfactura;
    }

    public int getCodigocliente() {
        return this.Codigocliente;
    }

    public void setCodigocliente(int Codigocliente) {
        this.Codigocliente = Codigocliente;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRUC() {
        return this.RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public double getDescGen() {
        return this.DescGen;
    }

    public void setDescGen(double DescGen) {
        this.DescGen = DescGen;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono1() {
        return this.Telefono1;
    }

    public void setTelefono1(String Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public String getTelefono2() {
        return this.Telefono2;
    }

    public void setTelefono2(String Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public String getReferencia() {
        return this.Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getCredito() {
        return this.Credito;
    }

    public void setCredito(String Credito) {
        this.Credito = Credito;
    }

    public String getConfirmservicio() {
        return this.Confirmservicio;
    }

    public void setConfirmservicio(String Cofirmservicio) {
        this.Confirmservicio = Cofirmservicio;
    }

    public String getCodigoproducto() {
        return this.Codigoproducto;
    }

    public void setCodigoproducto(String Codigoproducto) {
        this.Codigoproducto = Codigoproducto;
    }

    public String getCodigoservicio() {
        return this.Codigoservicio;
    }

    public void setCodigoservicio(String Codigoservicio) {
        this.Codigoservicio = Codigoservicio;
    }

    public String getNombreproducto() {
        return this.Nombreproducto;
    }

    public void setNombreproducto(String Nombreproducto) {
        this.Nombreproducto = Nombreproducto;
    }

    public String getNombreservicio() {
        return this.Nombreservicio;
    }

    public void setNombreservicio(String Nombreservicio) {
        this.Nombreservicio = Nombreservicio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getMagnitud() {
        return this.Magnitud;
    }

    public void setMagnitud(String Magnitud) {
        this.Magnitud = Magnitud;
    }

    public double getPrecioProducto() {
        return this.PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public double getDescLinea() {
        return this.DescLinea;
    }

    public void setDescLinea(double DescLinea) {
        this.DescLinea = DescLinea;
    }

    public double getImpuestos() {
        return this.Impuestos;
    }

    public void setImpuestos(double Impuestos) {
        this.Impuestos = Impuestos;
    }

    public double getImporteImpuesto() {
        return this.ImporteImpuesto;
    }

    public void setImporteImpuesto(double ImporteImpuesto) {
        this.ImporteImpuesto = ImporteImpuesto;
    }

    public double getBase() {
        return this.Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getSubtotal1() {
        return this.Subtotal1;
    }

    public void setSubtotal1(double Subtotal1) {
        this.Subtotal1 = Subtotal1;
    }

    public double getSumaCantidad() {
        return SumaCantidad;
    }

    public void setSumaCantidad(double SumaCantidad) {
        this.SumaCantidad = SumaCantidad;
    }

    public double getMontoPrecio() {
        return this.MontoPrecio;
    }

    public void setMontoPrecio(double MontoPrecio) {
        this.MontoPrecio = MontoPrecio;
    }

    public double getSumaDescLinea() {
        return this.SumaDescLinea;
    }

    public void setSumaDescLinea(double SumaDescLinea) {
        this.SumaDescLinea = SumaDescLinea;
    }

    public double getSumaDescGen() {
        return this.SumaDescGen;
    }

    public void setSumaDescGen(double SumaDescGen) {
        this.SumaDescGen = SumaDescGen;
    }

    public double getSubtotal2() {
        this.Subtotal2 = this.MontoPrecio - (this.SumaDescLinea + this.SumaDescGen);
        return this.Subtotal2;
    }

    public void setSubtotal2(double Subtotal2) {
        this.Subtotal2 = Subtotal2;
    }

    public double getSumaImpuesto() {
        return this.SumaImpuesto;
    }

    public void setSumaImpuesto(double SumaImpuesto) {
        this.SumaImpuesto = SumaImpuesto;
    }

    public double getTotal() {
        this.Total = this.Subtotal2 + this.SumaImpuesto;
        return this.Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getDIF() {
        this.DIF = this.Total - (this.MontoPago1 + this.MontoPago2 + this.MontoPago3 + this.MontoPago4);
        formato.format(this.DIF);
        return this.DIF;
    }

    public void setDIF(double DIF) {
        this.DIF = DIF;
    }

    public String getFormaPago1() {
        return this.FormaPago1;
    }

    public void setFormaPago1(String FormaPago1) {
        this.FormaPago1 = FormaPago1;
    }

    public double getMontoPago1() {
        return this.MontoPago1;
    }

    public void setMontoPago1(double MontoPago1) {
        this.MontoPago1 = MontoPago1;
    }

    public String getFormaPago2() {
        return this.FormaPago2;
    }

    public void setFormaPago2(String FormaPago2) {
        this.FormaPago2 = FormaPago2;
    }

    public double getMontoPago2() {
        return this.MontoPago2;
    }

    public void setMontoPago2(double MontoPago2) {
        this.MontoPago2 = MontoPago2;
    }

    public String getFormaPago3() {
        return this.FormaPago3;
    }

    public void setFormaPago3(String FormaPago3) {
        this.FormaPago3 = FormaPago3;
    }

    public double getMontoPago3() {
        return this.MontoPago3;
    }

    public void setMontoPago3(double MontoPago3) {
        this.MontoPago3 = MontoPago3;
    }

    public String getFormaPago4() {
        return this.FormaPago4;
    }

    public void setFormaPago4(String FormaPago4) {
        this.FormaPago4 = FormaPago4;
    }

    public double getMontoPago4() {
        return this.MontoPago4;
    }

    public void setMontoPago4(double MontoPago4) {
        this.MontoPago4 = MontoPago4;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    //metodo insert de datos de factura
    public int insertDocumentos(Connection conexion, Documentos documentos) {
        String query = "INSERT INTO tbl_documentos (id,tipo_documento,codigo_cliente,nombre,ruc,descuento_general,direccion,telefono1,telefono2,referencia,credito,montoprecio,suma_cantidad,suma_descuentolinea,suma_descuentogeneral,subtotal2,impuesto_total,total,diferencia,forma_pago1,monto_pago1,forma_pago2,monto_pago2,forma_pago3,monto_pago3,forma_pago4,monto_pago4,fecha_registro) VALUES (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?, ?,?,?)";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, documentos.getIDfactura());
            statement.setString(2, documentos.getTipodocumento());
            statement.setInt(3, documentos.getCodigocliente());
            statement.setString(4, documentos.getNombre());
            statement.setString(5, documentos.getRUC());
            statement.setDouble(6, documentos.getDescGen());
            statement.setString(7, documentos.getDireccion());
            statement.setString(8, documentos.getTelefono1());
            statement.setString(9, documentos.getTelefono2());
            statement.setString(10, documentos.getReferencia());
            statement.setString(11, documentos.getCredito());
            statement.setDouble(12, documentos.getMontoPrecio());
            statement.setDouble(13, documentos.getSumaCantidad());
            statement.setDouble(14, documentos.getSumaDescLinea());
            statement.setDouble(15, documentos.getSumaDescGen());
            statement.setDouble(16, documentos.getSubtotal2());
            statement.setDouble(17, documentos.getSumaImpuesto());
            statement.setDouble(18, documentos.getTotal());
            statement.setDouble(19, documentos.getDIF());
            statement.setString(20, documentos.getFormaPago1());
            statement.setDouble(21, documentos.getMontoPago1());
            statement.setString(22, documentos.getFormaPago2());
            statement.setDouble(23, documentos.getMontoPago2());
            statement.setString(24, documentos.getFormaPago3());
            statement.setDouble(25, documentos.getMontoPago3());
            statement.setString(26, documentos.getFormaPago4());
            statement.setDouble(27, documentos.getMontoPago4());
            // Formatear la fecha a "yyyy-MM-dd HH:mm:ss"
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fechaFormateada = sdf.format(documentos.getFecha_registro());

            // Utilizar la fecha formateada en el PreparedStatement
            statement.setString(28, fechaFormateada);
            int filasAfectadas = statement.executeUpdate();

            // Retorna la cantidad de filas afectadas por la inserción.
            return filasAfectadas;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
    
    // Método para realizar una consulta a la tabla tbl_documentos
    public List<Documentos> selectDocumentos(Connection conexion) {
        List<Documentos> documentosList = new ArrayList<>();
        String query = "SELECT * FROM tbl_documentos";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Documentos documentos = new Documentos();
                documentos.setIDfactura(resultSet.getInt("id"));
                documentos.setTipodocumento(resultSet.getString("tipo_documento"));
                documentos.setCodigocliente(resultSet.getInt("codigo_cliente"));
                documentos.setNombre(resultSet.getString("nombre"));
                documentos.setRUC(resultSet.getString("ruc"));
                documentos.setDescGen(resultSet.getDouble("descuento_general"));
                documentos.setDireccion(resultSet.getString("direccion"));
                documentos.setTelefono1(resultSet.getString("telefono1"));
                documentos.setTelefono2(resultSet.getString("telefono2"));
                documentos.setReferencia(resultSet.getString("referencia"));
                documentos.setCredito(resultSet.getString("credito"));
                documentos.setMontoPrecio(resultSet.getDouble("montoprecio"));
                documentos.setSumaCantidad(resultSet.getDouble("suma_cantidad"));
                documentos.setSumaDescLinea(resultSet.getDouble("suma_descuentolinea"));
                documentos.setSumaDescGen(resultSet.getDouble("suma_descuentogeneral"));
                documentos.setSubtotal2(resultSet.getDouble("subtotal2"));
                documentos.setSumaImpuesto(resultSet.getDouble("impuesto_total"));
                documentos.setTotal(resultSet.getDouble("total"));
                documentos.setDIF(resultSet.getDouble("diferencia"));
                documentos.setFormaPago1(resultSet.getString("forma_pago1"));
                documentos.setMontoPago1(resultSet.getDouble("monto_pago1"));
                documentos.setFormaPago2(resultSet.getString("forma_pago2"));
                documentos.setMontoPago2(resultSet.getDouble("monto_pago2"));
                documentos.setFormaPago3(resultSet.getString("forma_pago3"));
                documentos.setMontoPago3(resultSet.getDouble("monto_pago3"));
                documentos.setFormaPago4(resultSet.getString("forma_pago4"));
                documentos.setMontoPago4(resultSet.getDouble("monto_pago4"));
                documentos.setFecha_registro(resultSet.getTimestamp("fecha_registro"));

                documentosList.add(documentos);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        return documentosList;
    }
    // Método para seleccionar un documento por ID

    public Documentos selectDocumentos(Connection conexion, int id) {
        Documentos documento = null;

        // Consulta SQL
        String query = "SELECT * FROM tbl_documentos WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            // Establecer el parámetro ID en la consulta
            statement.setInt(1, id);

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Verificar si hay resultados
            if (resultSet.next()) {
                // Crear un objeto Documentos y asignar valores desde el ResultSet
                documento = new Documentos();
                IDfactura = resultSet.getInt("id");
                Tipodocumento = resultSet.getString("tipo_documento");
                Codigocliente = resultSet.getInt("codigo_cliente");
                Nombre = resultSet.getString("nombre");
                RUC = resultSet.getString("ruc");
                DescGen = resultSet.getDouble("descuento_general");
                Direccion = resultSet.getString("direccion");
                Telefono1 = resultSet.getString("telefono1");
                Telefono2 = resultSet.getString("telefono2");
                Referencia = resultSet.getString("referencia");
                Credito = resultSet.getString("credito");
                MontoPrecio = resultSet.getDouble("montoprecio");
                SumaCantidad = resultSet.getDouble("suma_cantidad");
                SumaDescLinea = resultSet.getDouble("suma_descuentolinea");
                SumaDescGen = resultSet.getDouble("suma_descuentogeneral");
                Subtotal2 = resultSet.getDouble("subtotal2");
                SumaImpuesto = resultSet.getDouble("impuesto_total");
                Total = resultSet.getDouble("total");
                DIF = resultSet.getDouble("diferencia");
                FormaPago1 = resultSet.getString("forma_pago1");
                MontoPago1 = resultSet.getDouble("monto_pago1");
                FormaPago2 = resultSet.getString("forma_pago2");
                MontoPago2 = resultSet.getDouble("monto_pago2");
                FormaPago3 = resultSet.getString("forma_pago3");
                MontoPago3 = resultSet.getDouble("monto_pago3");
                FormaPago4 = resultSet.getString("forma_pago4");
                MontoPago4 = resultSet.getDouble("monto_pago4");
                fecha_registro = resultSet.getDate("fecha_registro");
                DescLinea = resultSet.getDouble("suma_descuentolinea");
                Tipodocumento = resultSet.getString("tipo_documento"); 
                // ... (asegúrate de agregar todos los campos)

                // No es necesario cerrar el ResultSet aquí, ya que se cerrará automáticamente con el try-with-resources
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        return documento;
    }

    public int insertElementos(Connection conexion, Documentos documentos) {
        String query = "INSERT INTO tbl_elementos (codigo_elemento, id_documento, nombre_elemento, Elemento_servicio, descripcion, magnitud, cantidad, precio, descuento_linea, descuento_general, base, itbms, importe_impuesto, subtotal) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, documentos.getCodigoproducto());
            statement.setInt(2, documentos.getIDfactura());
            statement.setString(3, documentos.getNombreproducto());
            statement.setString(4, documentos.getConfirmservicio());
            statement.setString(5, documentos.getDescripcion());
            statement.setString(6, documentos.getMagnitud());
            statement.setDouble(7, documentos.getCantidad());
            statement.setDouble(8, documentos.getPrecioProducto());
            statement.setDouble(9, documentos.getDescLinea());
            statement.setDouble(10, documentos.getDescGen());
            statement.setDouble(11, documentos.getBase());
            statement.setDouble(12, documentos.getImpuestos());
            statement.setDouble(13, documentos.getImporteImpuesto());
            statement.setDouble(14, documentos.getSubtotal1());

            int filasAfectadas = statement.executeUpdate();

            // Retorna la cantidad de filas afectadas por la inserción.
            return filasAfectadas;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
    
    public List<Documentos> selectDocumentosPorID(Connection conexion, int idFactura) {
    String query = "SELECT * FROM tbl_elementos WHERE id_documento = ?";

    List<Documentos> documentosList = new ArrayList<>();

    try (PreparedStatement statement = conexion.prepareStatement(query)) {
        statement.setInt(1, idFactura);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Documentos documento = new Documentos();
            documento.setCodigoproducto(resultSet.getString("codigo_elemento"));
            documento.setIDfactura(resultSet.getInt("id_documento"));
            documento.setNombreproducto(resultSet.getString("nombre_elemento"));
            documento.setConfirmservicio(resultSet.getString("Elemento_servicio"));
            documento.setDescripcion(resultSet.getString("descripcion"));
            documento.setMagnitud(resultSet.getString("magnitud"));
            documento.setCantidad(resultSet.getDouble("cantidad"));
            documento.setPrecioProducto(resultSet.getDouble("precio"));
            documento.setDescLinea(resultSet.getDouble("descuento_linea"));
            documento.setDescGen(resultSet.getDouble("descuento_general"));
            documento.setBase(resultSet.getDouble("base"));
            documento.setImpuestos(resultSet.getDouble("itbms"));
            documento.setImporteImpuesto(resultSet.getDouble("importe_impuesto"));
            documento.setSubtotal1(resultSet.getDouble("subtotal"));

            documentosList.add(documento);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error: " + e.getMessage());
    }

    return documentosList;
    }
    
    


    //Calculos de la tabla productos
    //metodo calculo descuentogeneral
    public double CalcularDescuentoGen(double PrecioProducto, double DescGen) {
        if (DescGen > 0) {
            this.DescGen = DescGen / 100;
        }
        this.DescGen = this.DescGen * PrecioProducto;
        return this.DescGen;
    }

    //metodo calculo descuentogeneral
    public double CalcularDescuentoLinea(double PrecioProducto, double DescLinea) {
        if (DescLinea > 0) {
            this.DescLinea = this.DescLinea / 100;
        }
        this.DescLinea = this.DescLinea * PrecioProducto;
        return this.DescLinea;
    }


    //metodo calculo base
    //Base= la suma de los precios sin impuesto de un mismo Articulo/servicio y con descuento si este tiene 
    public double CalcularBase(double PrecioProducto, double Cantidad, double DescLinea, double DescGen) {
        double preciosindesc = PrecioProducto * Cantidad;
        Base = preciosindesc - (this.DescLinea + this.DescGen);
        return Base;
    }
    
    //calcular monto
    public double CalcularMonto(double MontoPrecio, double DescLinea, double DescGen) {
        this.MontoPrecio = MontoPrecio+ DescLinea+ DescGen;
        return this.MontoPrecio;
    }

    //metodo calculo ibtms
    //itbms = impuesto aplicado a un Articulo/servicio en especifico
    public double CalcularItbms(double Impuestos) {
        Impuestos = Impuestos / 100;
        return Impuestos;
    }

    //metodo calculo ImporteImpuesto
    //ImporteImpuesto= ibtmsxPrecio de Articulo/servicio
    public double CalcularImporteImpuesto(double PrecioProducto, double Impuestos, double Cantidad) {
        Impuestos = Impuestos / 100;
        ImporteImpuesto = PrecioProducto * Impuestos;
        ImporteImpuesto = ImporteImpuesto * Cantidad;
        return ImporteImpuesto;
    }

    //metodo calculo subtotal
    //Subtotal1= SubTotal: La suma total de precio de Articulo/servicio con descuento aplicado + ibtms de cada Articulo/servicio 
    public double CalcularSubtotal(double Base, double ImporteImpuesto) {
        Subtotal1 = Base + ImporteImpuesto;
        return Subtotal1;
    }

    /// Métodos para restar valores específicos
    public double restarSumaCantidad(double SumaCantidad, double cantidadRemovida) {
        this.SumaCantidad = SumaCantidad - cantidadRemovida;
        return this.SumaCantidad;
    }

    public void restarMontoPrecio(double MontoPrecio, double precioRemovido) {
        this.MontoPrecio = MontoPrecio - precioRemovido;
    }

    public void restarSumaDescLinea(double SumaDescLinea,double descLineaRemovido) {
        this.SumaDescLinea = SumaDescLinea - descLineaRemovido;
    }

    public void restarSumaDescGen(double SumaDescGen, double descGeneralRemovido) {
        this.SumaDescGen = SumaDescGen - descGeneralRemovido;
    }

    public void restarSumaImpuesto(double impuestoRemovido, double SumaImpuesto) {
        this.SumaImpuesto = SumaImpuesto - impuestoRemovido;
        if (this.SumaImpuesto<0){
            this.SumaImpuesto=this.SumaImpuesto*-1;
        }
    }

    public void restarSubtotal(double subtotalRemovido, double SumaBase) {
        this.Subtotal2 = subtotalRemovido - SumaBase;
    }

    public void restarTotal(double totalRemovido, double SumaTotal) {
        this.Total = totalRemovido - SumaTotal;
    }

}
