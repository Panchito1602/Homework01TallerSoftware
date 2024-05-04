/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01_ejercicio04;

import java.util.Scanner;

/**
 *
 * @author chato
 */
public class TAREA01_ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double x1, y1, z1, x2, y2, z2, dist;
        
        System.out.println("ELEGIR LA DIMENSION DEL PUNTO: ");
        System.out.println("1.  2D");
        System.out.println("2.  3D");
        System.out.print("OPCION: ");
        opcion = entrada.nextInt();
        
        if (opcion == 1) {
            System.out.println("");
            System.out.println("INGRESAR LAS COORDENADAS DE LOS PUNTOS 1 Y 2");
            System.out.println("");
            System.out.println("PUNTO 1:");
            System.out.print("x1: ");
            x1 = entrada.nextInt();
            System.out.print("y1: ");
            y1 = entrada.nextInt();
            System.out.println("");
            System.out.println("PUNTO 2:");
            System.out.print("x2: ");
            x2 = entrada.nextInt();
            System.out.print("y2: ");
            y2 = entrada.nextInt();
            
            dist = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
            
            System.out.println("LA DISTANCIA ENTRE LOS DOS PUNTOS 1 Y 2 ES: "+dist);
        }
        else if (opcion == 2) {
            System.out.println("");
            System.out.println("INGRESAR LAS COORDENADAS DE LOS PUNTOS 1 Y 2");
            System.out.println("");
            System.out.println("PUNTO 1:");
            System.out.print("x1: ");
            x1 = entrada.nextInt();
            System.out.print("y1: ");
            y1 = entrada.nextInt();
            System.out.print("z1: ");
            z1 = entrada.nextInt();
            System.out.println("");
            System.out.println("PUNTO 2:");
            System.out.print("x2: ");
            x2 = entrada.nextInt();
            System.out.print("y2: ");
            y2 = entrada.nextInt();
            System.out.print("z2: ");
            z2 = entrada.nextInt();
            
            dist = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)+Math.pow(z2-z1, 2));
            
            System.out.println("LA DISTANCIA ENTRE LOS DOS PUNTOS 1 Y 2 ES: "+dist);
        }
        else {
            System.out.println("LA OPCION INGRESADA NO ES VALIDA. ");
        }
        
    }
    
}
