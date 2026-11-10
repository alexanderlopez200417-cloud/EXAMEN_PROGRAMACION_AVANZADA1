/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Servicios;
import repositorio.RepositorioGenerico;
import java.util.List;
/**
 *
 * @author PC
 */
public class ServiciosController {
    private static RepositorioGenerico<Servicios> repositorio =
        new RepositorioGenerico<>();
     private static boolean inicializado = false;

     public ServiciosController() {
        if (!inicializado) {

            crearServicio(new Servicios(1, "Cambio de aceite", 850, 45));
            crearServicio(new Servicios(2, "Revisión de frenos", 500, 60));
            crearServicio(new Servicios(3, "Diagnóstico electrónico", 700, 50));
            crearServicio(new Servicios(4, "Alineamiento", 600, 40));
            crearServicio(new Servicios(5, "Mantenimiento general", 1200, 120));

            inicializado = true;
        }
    }
   
    
    public void crearServicio(Servicios servicio) {

    if (servicio.getPrecioBase() <= 0) {
        throw new IllegalArgumentException(
                "El precio debe ser positivo");
    }

    repositorio.agregar(
        String.valueOf(servicio.getCodigo()), servicio
    );
}

  
    public List<Servicios> listarServicios() {
        return repositorio.obtenerTodos();
    }

    
    public void actualizarServicio(String codigo, Servicios servicio) {
        repositorio.modificar(codigo, servicio);
    }

  
    public void eliminarServicio(String codigo) {
        repositorio.eliminar(codigo);
    }

   
    public Servicios buscarServicio(String codigo) {
        return repositorio.buscarPorClave(codigo);
    }

  
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
