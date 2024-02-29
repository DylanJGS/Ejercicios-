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
public class Octavo {
    public static void main(String[]args){
    
        int hora=0, minuto=0, segundo=0;
        
        while(true){
        try{
        Thread.sleep(1000);
        }catch (InterruptedException e){
        e.printStackTrace();
        }
        segundo++;
        if(segundo==60){
        segundo=0;
        minuto++;
        if (minuto==60){
        minuto=0;
        hora++;
        if(hora==24){
        hora=0;
        }
        }
        }
        System.out.printf("%02d:%02d:%02d%n",hora,minuto,segundo);
        }
        
    }      
    }


    
    
    

