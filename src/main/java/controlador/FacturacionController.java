/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Facturacion;
import repositorio.RepositorioGenerico;
import Excepciones.PagoInsuficienteException;
import java.util.List;
/**
 *
 * @author PC
 */
public class FacturacionController {
    private RepositorioGenerico<Facturacion> repositorio;

    public FacturacionController() {
        repositorio = new RepositorioGenerico<>();
    }

    // CRUD - Create
    public void crearFactura(Facturacion factura) {
        repositorio.agregar(
            String.valueOf(factura.getNumeroFactura()), factura
        );
    }

    public List<Facturacion> listarFacturas() {
        return repositorio.obtenerTodos();
    }

  
    public void actualizarFactura(String numero, Facturacion factura) {
        repositorio.modificar(numero, factura);
    }

  
    public void eliminarFactura(String numero) {
        repositorio.eliminar(numero);
    }

    
    public Facturacion buscarFactura(String numero) {
        return repositorio.buscarPorClave(numero);
    }

  
    public double calcularCambio(double total, double pago)
            throws PagoInsuficienteException {

        if (pago < total) {
            throw new PagoInsuficienteException(
                "El pago es insuficiente para cancelar la factura."
            );
        }

        return pago - total;
    }

   
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
