/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.tarea01;

/**
 *
 * @author chato
 */
public class TAREA01 {

    public static void main(String[] args) {
        float radio1, radio2;
        float altura1, altura2;
        float areaLateral1, areaLateral2, areaBase1, areaBase2;
        float areaTotal1, areaTotal2;
        
        radio1 = 4.0f;
        altura2 = 5.0f;
        
        radio2 = radio1/2;
        altura1 = altura2/2;
        
        areaLateral1 = (float) (Math.PI * radio1 * 2 * altura1);
        areaLateral2 = (float) (Math.PI * radio2 * 2 * altura2);
        areaBase1 = (float) (Math.PI * Math.pow(radio1, 2));
        areaBase2 = (float) (Math.PI * Math.pow(radio2, 2));
                    
        areaTotal1 = (float) (areaLateral1 + (2 * areaBase1)); 
        areaTotal2 = (float) (areaLateral2 + (2 * areaBase2)); 
        
        System.out.println("El area total del primer cilindro es: " + areaTotal1 + "m2");
        System.out.println("El area total del segundo cilindro es: " + areaTotal2 + "m2");
    }
}
