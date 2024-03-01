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
public class NovenoBa {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    double descuento=0.15;
    
    System.out.println("Ingrese el total de la compra:");
    double compra=teclado.nextDouble();
    
    double monto=compra*descuento;
    double Final=compra-descuento;
    
    System.out.println("El monto a pagar despues del descuento es de: "+Final);
    
    }
}
