package com.informatica3.recursividad;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int numero, resFactorial;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero al que le quiere calcular su factorial: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        resFactorial = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resFactorial);
    }
    
    public static int factorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    
}
