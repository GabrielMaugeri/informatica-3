package com.informatica3.recursividad;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, resFibonacci;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese hasta que numero quiere calcular fibonacci: ");
        n = scanner.nextInt();
        scanner.nextLine();
        resFibonacci = fibonacci(n);
        System.out.println("El valor que ocupa la posicion " + n + " en la secuencia de fibonacci es: " + resFibonacci);
    }
    
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
