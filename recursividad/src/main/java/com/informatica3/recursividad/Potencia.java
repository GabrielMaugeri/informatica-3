package com.informatica3.recursividad;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        int numero, exponente, resPotencia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero base: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el exponente: ");
        exponente = scanner.nextInt();
        scanner.nextLine();
        resPotencia = potencia(numero, exponente);
        System.out.println(numero + " elevado " + exponente + "es: " + resPotencia);
    }
    
    public static int potencia(int numero, int exponente) {
        if (exponente == 1) {
            return numero;
        } else {
            return numero * potencia(numero, exponente - 1);
        }
    }
}
