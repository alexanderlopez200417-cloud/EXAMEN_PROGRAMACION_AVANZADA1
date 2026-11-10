/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.OrdenTrabajo;
import repositorio.RepositorioGenerico;
import java.util.List;
/**
 *
 * @author PC
 */
public class OrdenTrabajoController {
    private static RepositorioGenerico<OrdenTrabajo> repositorio =
        new RepositorioGenerico<>();

    public OrdenTrabajoController() {
    }

    
    public void crearOrden(OrdenTrabajo orden) {
        repositorio.agregar(
            String.valueOf(orden.getNumero()), orden
        );
    }

   
    public List<OrdenTrabajo> listarOrdenes() {
        return repositorio.obtenerTodos();
    }

    
    public void actualizarOrden(String numero, OrdenTrabajo orden) {
        repositorio.modificar(numero, orden);
    }

    
    public void eliminarOrden(String numero) {
        repositorio.eliminar(numero);
    }

    
    public OrdenTrabajo buscarOrden(String numero) {
        return repositorio.buscarPorClave(numero);
    }

 
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
