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
public class Quintoba {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Ingrese la temperatura en Fahrenheit:");
    double faren=teclado.nextDouble();
    
    double Celsius=(faren-32)*5/9;
    System.out.println("La temperatura en Celsius es:"+Celsius);
    }
}
