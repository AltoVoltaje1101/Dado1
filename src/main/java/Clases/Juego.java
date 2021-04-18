/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Scanner;
/**
 *
 * @author felix_5bh1a4y
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        Dado dado = new Dado();
        int [] veces = new int[6];
        int veces1=0;
        for (int i=0;i<6;i++) veces[i]=0;
        System.out.println("Quieres tirar el dado?");
        String lectura=respuesta.nextLine();
        while(lectura.equalsIgnoreCase("si")){
        int a=dado.tirarDado();
        veces1++;
        System.out.println(a+"\n");
            switch(a){
                case 1: veces[0]++;
                break;
                case 2:veces[1]++;
                break;
                case 3: veces[2]++;
                break;
                case 4:veces[4]++;
                break;
                case 5: veces[4]++;
                break;
                case 6:veces[5]++;
                break;
            }
        System.out.println("Quieres tirar el dado?");
        lectura=respuesta.nextLine();
        }
        System.out.println("Veces que se tiro el dado:"+veces1);
        for(int i=0;i<6;i++)
            System.out.println("Veces que la cayo la cara '"+(i+1)+"': "+veces[i]);
    }
    
}

