/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Tercero3 {
    public static void main(String[]args){
    Scanner teclado=new Scanner (System.in);
    
    int[] []numero=new int[4][5];
    
    for(int i=0;i<4;i++){
    for(int a=0;a<5;a++){
    System.out.println("Introduce los numeros para posicionarlos["+i+"]["+a+"]:");
    numero[i][a]=teclado.nextInt();
    }
    }
    
    int[]Fila=new int[4];
    int[] Columna=new int[5];
    for(int i=0;i<4;i++){
    for(int a=0;a<5;a++){
    Fila[i]+=numero[i][a];
    Columna[a]+=numero[i][a];
    }
    }
    for(int i=0;i<4;i++){
    for(int a=0;a<5;a++){
    System.out.print(numero[i][a]+"|"+"\t");
    }
    System.out.println("|"+Fila[i]);
    }
    for(int a=0;a<5;a++){
    System.out.println("----- \t");
    }
    System.out.println();
    
    for(int a=0;a<5;a++){
    System.out.print(Columna[a]+"\t");
    }
    System.out.println("| Suma de Columna");
    }
}
