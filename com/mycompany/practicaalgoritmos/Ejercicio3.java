/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaalgoritmos;

/**
 *
 * @author RODRIGO
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Generar dos números aleatorios entre 0 y 100
        Random random = new Random();
        int numero1 = random.nextInt(101);
        int numero2 = random.nextInt(101);

        // Calcular la suma de los números
        int suma = numero1 + numero2;

        // Mostrar la operación al usuario sin el resultado
        System.out.println("Por favor, resuelve la siguiente operación:");
        System.out.println(numero1 + " + " + numero2 + " = ?");

        // Ingrese la respuesta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de la suma: ");
        int respuestaUsuario = scanner.nextInt();

        
        if (respuestaUsuario == suma) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Respuesta incorrecta.");
        }
    }
}


