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
public class Tercero {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    while(true){
    System.out.println("Introduce una letra:(si deseas salir oprime Espacio)");
    char caracter= teclado.next().charAt(0);
    
    if(caracter == ' '){
    System.out.println("Saliendo del programa:");
    break;
    }
    if(vocal(caracter)){
    System.out.println("Vocal:");
    
    }else{
    System.out.println("No Vocal:");
    }
    }
    teclado.close();
    }
    public static boolean vocal(char c){
    c =Character.toUpperCase(c);
    return c== 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
