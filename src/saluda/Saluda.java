/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,edad ;
        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
        
        System.out.println("Introduzca edad:");
         edad= sc.nextLine();
          System.out.println("Hola "+nombre +" tienes "+edad+" año");
        //like y subcribete GUAPO!!
    }
    
}
