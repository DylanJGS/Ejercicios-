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
public class SegundoBa {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    System.out.println("Ingrese la base:");
    double base= teclado.nextDouble();
    
    System.out.println("Ingrese la altura:");
    double altura=teclado.nextDouble();
    
    double perimetro=2*(base+altura);
    
    double area=base*altura;
    
    System.out.println("EL perimetro es:"+perimetro);
    System.out.println("EL area es:"+area);
    
    
    }
}
