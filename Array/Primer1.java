/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Primer1 {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    int[]numero = new int[10];
    
    for (int i=0;i<10;i++){
    System.out.println("Introduce los numeros:"+(i+1)+":");
    numero[i]=teclado.nextInt();
    }
    System.out.println("Numeros en orden inverso:");
    for(int i= numero.length-1;i>=0;i--){
    System.out.println(numero[i]);
    }
    }
    }

