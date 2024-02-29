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
public class Sexto {
    public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
    
    System.out.println("Ingrese la base:");
    double base=teclado.nextDouble();
    
    System.out.println("Ingrese el exponente:");
    int expon=teclado.nextInt();
    
    double resultado=1;
    
    if(expon==0){
    resultado=1;
    }else{
    for(int i=1;i<=Math.abs(expon);i++){
    resultado*=base;
    
    }
    if(expon<0){
        resultado=1/resultado;
    }
    }
    System.out.println("El resultado es:  "+base+"   "+"elevado a:"+"    "+expon+"  es:"+resultado);
    }
}
