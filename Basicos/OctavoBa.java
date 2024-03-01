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
public class OctavoBa {
     public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    double sueldo = 1000; 
        double porcentajeComision = 0.10;
    
        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = teclado.nextDouble();
        
        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = teclado.nextDouble();
        
        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = teclado.nextDouble();
        
        
        double comision1 = venta1 * porcentajeComision;
        double comision2 = venta2 * porcentajeComision;
        double comision3 = venta3 * porcentajeComision;
        double totalComisiones = comision1 + comision2 + comision3;
    
        double totalMes = sueldo + totalComisiones;
        

        System.out.println("Comision por la primera venta: $" + comision1);
        System.out.println("Comision por la segunda venta: $" + comision2);
        System.out.println("Comision por la tercera venta: $" + comision3);
        System.out.println("Total de comisiones en el mes: $" + totalComisiones);
        System.out.println("Total recibido en el mes: $" + totalMes);
    
}
}