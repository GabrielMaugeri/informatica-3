package com.informatica3.recursividad;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int numero, res_factorial;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero al que le quiere calcular su factorial: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        res_factorial = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + res_factorial);
    }
    
    public static int factorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    
}
