/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author RODRIGO
 */
public class Productos {
   
    private String nombre;
    private String codigo;
    private int cantidad;
    private Date fechaVencimiento;

    // Constructor
    public Productos(String nombre, String codigo, int cantidad, Date fechaVencimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    // Métodos de modificación
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}

