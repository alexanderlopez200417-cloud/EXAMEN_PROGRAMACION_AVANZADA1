/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Clientes;
import repositorio.RepositorioGenerico;
import java.util.List;
/**
 *
 * @author PC
 */
public class ClienteController {
    private static RepositorioGenerico<Clientes> repositorio =
        new RepositorioGenerico<>();

    public ClienteController() {
    }

    // CRUD - Create
    public void crearCliente(Clientes cliente) {
        repositorio.agregar(
            String.valueOf(cliente.getId()), cliente
        );
    }

    // CRUD - Read
    public List<Clientes> listarClientes() {
        return repositorio.obtenerTodos();
    }

    // CRUD - Update
    public void actualizarCliente(String clave, Clientes cliente) {
        repositorio.modificar(clave, cliente);
    }

    // CRUD - Delete
    public void eliminarCliente(String clave) {
        repositorio.eliminar(clave);
    }

    // Buscar
    public Clientes buscarCliente(String clave) {
        return repositorio.buscarPorClave(clave);
    }

    // Deshacer
    public void deshacerOperacion() {
        repositorio.deshacerUltimo();
    }
}
