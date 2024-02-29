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
public class Primer {
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        int Adivinar =(int)(Math.random()*100)+1;
        int intentos =10;
        int realizados=0;
        int Usuario;
        
        System.out.println("Bienvenido");
        System.out.println("Adivinar del 1 al 10");
        
        while (intentos>0){
        System.out.println("Introduce un numero:");
        Usuario=teclado.nextInt();
        realizados++;
        
        if(Usuario==Adivinar){
        System.out.println("Felicidades haz encontrado el numero:"+realizados+"intentos");
        return;
        }else if (Usuario<Adivinar){
        System.out.println("El numero a Adivinar es mayor:"+Usuario);
        
        }else{
        System.out.println("El numero a Adivinar es menor:"+Usuario);
        }
        intentos--;
        System.out.println("Intentos restantes:"+intentos);
        
        }
        
        System.out.println("Lo sentimos haz gastado todos los intentos");
        System.out.println("El numero era:"+Adivinar);

}
    
}
