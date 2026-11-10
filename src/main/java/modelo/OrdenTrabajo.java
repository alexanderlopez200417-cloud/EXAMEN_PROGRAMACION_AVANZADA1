/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author PC
 */
public class OrdenTrabajo {
    private int numero;
    private Date fecha;
    private Clientes cliente;
    private Vehiculos vehiculo;
    private String diagnostico;
    private String mecanico;
    private ArrayList<Servicios> servicios;
    private ArrayList<Inventario> repuestos;
    private double costoTotal;
    private String estado;

    public OrdenTrabajo(int numero, Date fecha, Clientes cliente, Vehiculos vehiculo, String diagnostico, String mecanico, ArrayList<Servicios> servicios, ArrayList<Inventario> repuestos, double costoTotal, String estado) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diagnostico = diagnostico;
        this.mecanico = mecanico;
        this.servicios = servicios;
        this.repuestos = repuestos;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    public ArrayList<Inventario> getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(ArrayList<Inventario> repuestos) {
        this.repuestos = repuestos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
