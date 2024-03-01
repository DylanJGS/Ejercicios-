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
public class TerceroBa {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Ingrese el primer cateto:");
    double cateto1= teclado.nextDouble();
    
    
    System.out.println("Ingrese el segundo cateto:");
    double cateto2=teclado.nextDouble();
    
    double hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);

System.out.println("La hipotenusa es:"+hipotenusa);
    
    }
}
