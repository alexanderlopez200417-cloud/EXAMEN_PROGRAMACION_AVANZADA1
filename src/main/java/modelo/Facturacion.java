/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Facturacion {
    private int numeroFactura;
    private OrdenTrabajo orden;
    private double subtotalServicios;
    private double subtotalRepuestos;
    private double impuesto;
    private double total;
    private double pago;
    private double cambio; 

    public Facturacion(int numeroFactura, OrdenTrabajo orden, double subtotalServicios, double subtotalRepuestos, double impuesto, double total, double pago, double cambio) {
        this.numeroFactura = numeroFactura;
        this.orden = orden;
        this.subtotalServicios = subtotalServicios;
        this.subtotalRepuestos = subtotalRepuestos;
        this.impuesto = impuesto;
        this.total = total;
        this.pago = pago;
        this.cambio = cambio;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public OrdenTrabajo getOrden() {
        return orden;
    }

    public void setOrden(OrdenTrabajo orden) {
        this.orden = orden;
    }

    public double getSubtotalServicios() {
        return subtotalServicios;
    }

    public void setSubtotalServicios(double subtotalServicios) {
        this.subtotalServicios = subtotalServicios;
    }

    public double getSubtotalRepuestos() {
        return subtotalRepuestos;
    }

    public void setSubtotalRepuestos(double subtotalRepuestos) {
        this.subtotalRepuestos = subtotalRepuestos;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
    
    
}
