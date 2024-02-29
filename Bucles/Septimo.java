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
public class Septimo {
    public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
    
    System.out.println("Ingrese el valor del primer pago");
    double primer= teclado.nextDouble();
    
    System.out.println("Ingrese la tasa de incremento");
    double incremento= teclado.nextDouble();
    
    int meses=20;
    double total=0;
    double Actual=primer;
    
    for(int i=1;i<= meses; i++){
    total += Actual;
    Actual *=(1+incremento / 100);
    }
    
    double mensual= total /meses;
    System.out.println("El pago del mes es:"+mensual+" €");
    System.out.println("EL total del pago despues de"+"   "+meses+"   "+"mes es :"+total+" €");
    }
}
