/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Inventario;
import repositorio.RepositorioGenerico;
import java.util.List;
import Excepciones.StockInsuficienteException;
/**
 *
 * @author PC
 */
public class RepuestoController {
    private static RepositorioGenerico<Inventario> repositorio =
        new RepositorioGenerico<>();

private static boolean inicializado = false;

    public RepuestoController() {
    if (!inicializado) {

        crearRepuesto(new Inventario(1, "Filtro de aceite", 20, 180, 5, null));
        crearRepuesto(new Inventario(2, "Pastillas de freno", 10, 650, 3, null));
        crearRepuesto(new Inventario(3, "Bujías", 30, 120, 8, null));
        crearRepuesto(new Inventario(4, "Aceite de motor", 15, 250, 5, null));
        crearRepuesto(new Inventario(5, "Filtro de aire", 12, 220, 4, null));

        inicializado = true;
    }
}

  
    public void crearRepuesto(Inventario repuesto) {
        repositorio.agregar(
            String.valueOf(repuesto.getCodigo()), repuesto
        );
    }

   
    public List<Inventario> listarRepuestos() {
        return repositorio.obtenerTodos();
    }

  
    public void actualizarRepuesto(String codigo, Inventario repuesto) {
        repositorio.modificar(codigo, repuesto);
    }

 
    public void eliminarRepuesto(String codigo) {
        repositorio.eliminar(codigo);
    }

  
    public Inventario buscarRepuesto(String codigo) {
        return repositorio.buscarPorClave(codigo);
    }

    
    public void registrarEntrada(String codigo, int cantidad) {

        Inventario repuesto = buscarRepuesto(codigo);

        if (repuesto != null && cantidad > 0) {
            repuesto.setCantidad(repuesto.getCantidad() + cantidad);
        }
    }

  
    public void descontarRepuesto(String codigo, int cantidad)
            throws StockInsuficienteException {

        Inventario repuesto = buscarRepuesto(codigo);

        if (repuesto == null) {
            throw new IllegalArgumentException("Repuesto no encontrado");
        }

        if (cantidad <= 0 || cantidad > repuesto.getCantidad()) {
            throw new StockInsuficienteException(
                "No hay suficiente stock disponible"
            );
        }

        repuesto.setCantidad(repuesto.getCantidad() - cantidad);
    }

   
    public boolean verificarStockMinimo(String codigo) {

        Inventario repuesto = buscarRepuesto(codigo);

        if (repuesto != null) {
            return repuesto.getCantidad() <= repuesto.getStock();
        }

        return false;
    }

  
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
