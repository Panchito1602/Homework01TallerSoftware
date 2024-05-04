/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01_ejercicio01;

import java.util.Scanner;

/**
 *
 * @author chato
 */
public class TAREA01_ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor_X;
        double num,den,rpta;
        
        System.out.println("FORMULA: ");
        System.out.println("(2*x^-3+5*x^2-8*x)/sqrt(9*x^3-2*x^2+x)");
        System.out.println("Ingrese el valor de x: ");
        
        valor_X = entrada.nextDouble();
        
        num = (2*Math.pow(valor_X, -3)+5*Math.pow(valor_X, 2)-8*valor_X);
        den = (Math.sqrt(9*Math.pow(valor_X, 3)-2*Math.pow(valor_X,2)+valor_X));
        
        rpta = num/den;
        
        System.out.println("La respuesta de la operacion es: "+rpta);
    }
    
}
