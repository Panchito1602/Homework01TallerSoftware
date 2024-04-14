/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.tarea01_ejercicio03;

/**
 *
 * @author chato
 */
public class TAREA01_ejercicio03 {

    public static void main(String[] args) {
        int n;
        int sumaNaturales = 0, sumaCuadrados = 0, sumaCubos = 0;
                
        n = 4; //Establecer valor de n
        
        if (n >= 0){
            sumaNaturales = (n*(n+1)/2);
            sumaCuadrados = (n*(n+1)*(2*n+1)/6);
            sumaCubos = (int) ((Math.pow(n, 2)*Math.pow((n+1), 2))/4);
        }
        
        System.out.println("RESPUESTAS: ");
        System.out.println("La suma de los primeros numeros naturales es: " + sumaNaturales);
        System.out.println("La suma de los primeros numeros cuadrados es: " + sumaCuadrados);
        System.out.println("La suma de los primeros numeros cubicos es: " + sumaCubos);
    }
}
