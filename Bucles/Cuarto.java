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
public class Cuarto {
    public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
    
    System.out.println("Ingrese el primer numero");
    int numero=teclado.nextInt();
    System.out.println("Ingrese el Segundo numero");
    int numero1= teclado.nextInt();
    
    System.out.println("Numero pares entre"+numero+"y"+numero1+":");
    
    for(int i = numero;i<= numero1; i++){
    if(i % 2 ==0){
    System.out.println(i);
    }
    }
    teclado.close();
    }
}
