package com.informatica3.recursividad;

import java.util.Scanner;

public class InversionCadena {
    public static void main(String[] args) {
        String cadena, cadenaInvertida;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena a invertir: ");
        cadena = scanner.nextLine();
        cadenaInvertida = inversionCadena(cadena);
        System.out.println("La cadena '" + cadena + "' invertida es: '" + cadenaInvertida + "'");
    }
    
    public static String inversionCadena(String cadena) {
        if (cadena.length() == 1) {
            return cadena.substring(0);
        } else {
            return (inversionCadena(cadena.substring(1))).concat(cadena.substring(0, 1));
        }
    }
}
