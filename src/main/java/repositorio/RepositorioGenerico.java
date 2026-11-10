/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
/**
 *
 * @author PC
 */
public class RepositorioGenerico<T> {
    
     private ArrayList<T> listaElementos = new ArrayList<>();
    private HashMap<String, T> mapaElementos = new HashMap<>();
    private Stack<Operacion<T>> historial = new Stack<>();

    public void agregar(String clave, T elemento) {

        if (mapaElementos.containsKey(clave)) {
            throw new IllegalArgumentException("El codigo ya existe");
        }

        listaElementos.add(elemento);
        mapaElementos.put(clave, elemento);
        historial.push(new Operacion<>("AGREGAR", clave, null, elemento));
    }

    public List<T> obtenerTodos() {
        return Collections.unmodifiableList(listaElementos);
    }

  
    public T buscarPorClave(String clave) {
        return mapaElementos.get(clave);
    }

    public void modificar(String clave, T nuevoElemento) {

        T anterior = mapaElementos.get(clave);

        if (anterior == null) {
            throw new IllegalArgumentException("Registro no encontrado");
        }

        int posicion = listaElementos.indexOf(anterior);

        listaElementos.set(posicion, nuevoElemento);
        mapaElementos.put(clave, nuevoElemento);

        historial.push(new Operacion<>("MODIFICAR", clave, anterior, nuevoElemento));
    }

    // ELIMINAR
    public void eliminar(String clave) {

        T anterior = mapaElementos.get(clave);

        if (anterior == null) {
            throw new IllegalArgumentException("Registro no encontrado");
        }

        listaElementos.remove(anterior);
        mapaElementos.remove(clave);

        historial.push(new Operacion<>("ELIMINAR", clave, anterior, null));
    }

    public T deshacerUltimo() {

        if (!historial.isEmpty()) {
        T ultimo = (T) historial.pop();

        listaElementos.remove(ultimo);
        mapaElementos.values().remove(ultimo);

        return ultimo;
    }
    return null;
    }

    private static class Operacion<T> {

        String tipo;
        String clave;
        T anterior;
        T nuevo;

        public Operacion(String tipo, String clave, T anterior, T nuevo) {
            this.tipo = tipo;
            this.clave = clave;
            this.anterior = anterior;
            this.nuevo = nuevo;
        }
    }
}
