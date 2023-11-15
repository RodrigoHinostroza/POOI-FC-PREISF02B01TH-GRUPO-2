/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author RODRIGO
 */
public class Usuario {
    
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre +",apellido=" + apellido +", telefono=" + telefono + '}';
    }

    public Usuario(int id, int dni, String nombre, int telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
  
    }
    
    public String getApellido (){
        return apellido;
    }
    
    public void setApellido(String nombre) {
        this.nombre = nombre;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   
    private static final String CORREO = "Rodrigo";
    private static final String CLAVE = "24112005r";

    public static boolean autenticar(String usuario, String clave) {
        return CORREO.equals(usuario) && CLAVE.equals(clave);
    }
}



