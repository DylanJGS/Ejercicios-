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
public class SextoBa {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Ingrese le primer numero:");
    double primer= teclado.nextDouble();
     System.out.println("Ingrese le Segundo numero:");
    double Segundo= teclado.nextDouble();
     System.out.println("Ingrese le tercero numero:");
    double Tercero= teclado.nextDouble();
    
    double media= (primer+Segundo+Tercero)/3;
    
    System.out.println("La media de los numeros es:"+media);
    
    }
}
