/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Cuarto4 {
    public static void main(String[]args){
    Random random=new Random();
    
     int[] []numero=new int[4][5];
    
    for(int i=0;i<4;i++){
    for(int a=0;a<5;a++){
    numero[i][a]=random.nextInt(900)+100;
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
    