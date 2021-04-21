/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicialesdenombre;

import java.util.Scanner;


public class InicialesDeNombre {

    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String name;
        
        System.out.println("Ingresa tu nombre completo");
        name = cin.nextLine();
        System.out.println("Las iniciales del nombre de "+name+" son:");
        iniciales(name);
        System.out.println("¡Hasta luego "+name+"!");
    }
    public static void iniciales(String linea){
        String[] a = linea.split(" ");
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i].charAt(0)+ " ");
        }
        System.out.println("");
    }
}
