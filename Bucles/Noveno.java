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
public class Noveno {
    public static void main(String[]args){
       Scanner teclado= new Scanner (System.in);
       
       System.out.println("Ingrese la cantidad de numeros primos:");
       int cantidad= teclado.nextInt();
       
       int numero=2;
       int encuentra=0;
       
       System.out.println("Los primeros"+" "+cantidad+" "+"numeros primos son:");
       
       while(encuentra< cantidad){
       boolean primo=true;
       if(numero<=1){
       primo=false;
       }else{
       for(int i=2;i<=(Math.sqrt(numero));i++){
       if(numero % i == 0){
       primo=false;
       break;
       }
       }
       }
       if(primo){
           System.out.println(numero+"");
           encuentra++;
       }
       numero++;
       }
       
    }
}
