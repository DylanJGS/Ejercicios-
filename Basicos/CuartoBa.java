/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basicos;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class CuartoBa {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
     System.out.println("Ingrese el primer numero:");
    double numero= teclado.nextDouble();
    
    System.out.println("Ingrese el segundo numero:");
    double numero1=teclado.nextDouble();
    
    double suma=numero+numero1;
    double resta=numero-numero1;
    double division= numero/ numero1;
    double multi=numero*numero1;
    
    System.out.println("La suma es:"+suma);
    System.out.println("La resta es:"+resta);
    System.out.println("La Division es:"+division);
    System.out.println("La multiplicacion es:"+multi);
  
    }    
    
}
