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
public class Quinto {
    public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
    
    int inferior, superior;
    
    do{
    System.out.println("Ingrese el limite inferior:");
    inferior = teclado.nextInt();
    
    System.out.println("Ingrese el limite supeior:");
    superior = teclado.nextInt();
    
    if(inferior > superior){
    System.out.println("Error:");
    }
    }while (inferior >= superior);
    
    int Suma=0;
    int Fuera=0;
    boolean Limites=false;
    
    System.out.println("Ingrese los numeros:(Si quieres terminar oprime el numero 0)");
    int numero= teclado.nextInt();
    
    while(numero!=0){
    if(numero>inferior && numero<superior){
    Suma+=numero;
    }else{
    Fuera++;
    }
    
    if (numero==inferior || numero == superior){
    Limites=true;
    }
    numero=teclado.nextInt();
    }
    
    System.out.println("La suma de los numero dentro de los intervalos:"+Suma);
    System.out.println("Cantidad de numeros Fuera:"+Fuera);
    
    if(Limites){
    System.out.println("Se introdujo al menos un numero");
    }else{
    System.out.println("No se intridujo un numero");
    }
    }
}
