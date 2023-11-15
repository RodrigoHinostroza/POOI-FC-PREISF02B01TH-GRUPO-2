/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.ArrayList;

class Marca {
    String nombre;

    Marca() {
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca(String nombre) {
        this.nombre = nombre;
    }
}

public class Almacen {
      private String nombre;
    private ArrayList<Marca> marcas;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.marcas = new ArrayList<>();
    }

    public void agregarMarca(Marca marca) {
        marcas.add(marca);
    }

    Almacen almacen1;
    Almacen almacen2;

    public Almacen() {
        almacen1 = new Almacen("Almacen 1");
        almacen2 = new Almacen("Almacen 2");
    }

    public void Marcas() {
        Marca marca1 = new Marca ();
            marca1.setNombre("Don Vittorio");
            
        Marca marca2 = new Marca();
            marca2.setNombre("Primor");
            
        Marca marca3 = new Marca() ;
            marca3.setNombre("Bolivar");
            
        Marca marca4 = new Marca();
            marca4.setNombre("Marsella");

        almacen1.agregarMarca(marca1);
        almacen1.agregarMarca(marca2);
        almacen2.agregarMarca(marca3);
        almacen2.agregarMarca(marca4);
    }

}