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
public class DecimoBa {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    double porcentajeParciales = 0.55; 
        double porcentajeFinal = 0.30; 
        double porcentajeTrabajo = 0.15;
      
        System.out.print("Ingrese la calificacion del primer parcial: ");
        double Parcial1 = teclado.nextDouble();
        
        System.out.print("Ingrese la calificacion del segundo parcial: ");
        double Parcial2 = teclado.nextDouble();
        
        System.out.print("Ingrese la calificacion del tercer parcial: ");
        double Parcial3 = teclado.nextDouble();
        
        System.out.print("Ingrese la calificacion del examen final: ");
        double calificacionFinal = teclado.nextDouble();
        
        System.out.print("Ingrese la calificacion del trabajo final: ");
        double calificacionTrabajo1 = teclado.nextDouble();
        
        double promedioParciales = (Parcial1 + Parcial2 + Parcial3) / 3;
        
       
        double calificacionFinal1 = (promedioParciales * porcentajeParciales) +
                                   (calificacionFinal * porcentajeFinal) +
                                   (calificacionTrabajo1 * porcentajeTrabajo);
        
        
        System.out.println("La calificación final de la materia es: " + calificacionFinal);
    
    
    }
}
