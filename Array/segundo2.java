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
public class segundo2 {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    int[] numero=new int[10];
    
    for(int i=0;i<10;i++){
    System.out.println("Introduce los numeros"+(i+1)+":");
    numero[i]=teclado.nextInt();
    }
    int maximo= numero[0];
    int minimo= numero[0];
    for(int i=1;i<numero.length;i++){
    if(numero[i]>maximo){
    maximo=numero[i];
    }
    }
    System.out.println("\nNumeros introducidos con maximo y minimo:");
    for(int i=0;i<numero.length;i++){
    System.out.print(numero[i]);
    if(numero[i]==maximo){
    System.out.print(" maximo");
    }
    if(numero[i]== minimo){
    System.out.print(" minimo");
    }
    System.out.println();
    }
    
    }
}
