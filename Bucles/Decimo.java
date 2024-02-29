/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Decimo {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    System.out.println("Ingrese el numero de filas");
    int filas= teclado.nextInt();
    
    for(int i=1;i<=filas;i++){
    for (int o=1;o<=filas-i;o++){
    System.out.print("");
    
    }
    for(int o=1;o<=i;o++ ){
        System.out.print(o);
    }
    for(int o=i-1;o>=1;o--){
    System.out.print(o);
    }
    System.out.println();
    }
    
    }
}
