/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Vehiculos;
import repositorio.RepositorioGenerico;
/**
 *
 * @author PC
 */
public class VehiculosController {
    private static RepositorioGenerico<Vehiculos> repositorio =
        new RepositorioGenerico<>();

    public VehiculosController() {
        
    }

    // CRUD - Create
    public void crearVehiculo(Vehiculos vehiculo) {
        repositorio.agregar(vehiculo.getPlaca(), vehiculo);
    }

    // CRUD - Read
    public List<Vehiculos> listarVehiculos() {
        return repositorio.obtenerTodos();
    }

    // CRUD - Update
    public void actualizarVehiculo(String placa, Vehiculos vehiculo) {
        repositorio.modificar(placa, vehiculo);
    }

    // CRUD - Delete
    public void eliminarVehiculo(String placa) {
        repositorio.eliminar(placa);
    }

    // Buscar
    public Vehiculos buscarVehiculo(String placa) {
        return repositorio.buscarPorClave(placa);
    }

    // Deshacer
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
