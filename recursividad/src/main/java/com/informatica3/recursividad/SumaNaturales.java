package com.informatica3.recursividad;

import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        int n, resSuma;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros quiere sumar: ");
        n = scanner.nextInt();
        scanner.nextLine();
        resSuma = sumaNaturales(n);
        System.out.println("La suma de los primeros " + n + " naturales es: " + resSuma);
    }
    
    public static int sumaNaturales(int n) {
        if (n == 1){
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }
}
