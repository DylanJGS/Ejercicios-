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
public class SeptimoBa {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    System.out.println("Ingrese la cantidad de minutos:");
    int minuto= teclado.nextInt();
    
    int hora=minuto/60;
    int Restante=minuto%60;
    
    System.out.println(minuto+" minutos equivalentes a "+hora+" horas y "+Restante+" minutos");
    
}
}