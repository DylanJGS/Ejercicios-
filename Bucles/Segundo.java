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
public class Segundo {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    int mayor=0;
    int menor=0;
    int igual=0;
    
    System.out.println("Introduce el numero");
    int numero=teclado.nextInt();
    System.out.println("Ingrese el numero");
    for(int i=0;i<numero;i++){
    System.out.println("Numero"+(i+1)+"");
    int numero1=teclado.nextInt();
    if(numero1>0){
    mayor++;
    }else if(numero1<0){
    menor++;
    }else{
    igual++;
    }
    }
    System.out.println("El nuemro mayor es:"+mayor);
    System.out.println("EL numero menor es:"+menor);
    System.out.println("EL numero igual es:"+igual);
    }
}
