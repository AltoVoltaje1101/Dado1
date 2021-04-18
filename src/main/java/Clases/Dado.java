/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Random;
/**
 *
 * @author felix_5bh1a4y
 */
public class Dado {
    public int cara;
    public Dado(){
        cara=1;
    }
    public int tirarDado(){
        Random resultado=new Random();
        return resultado.nextInt((6-1)+1)+1;
    }
    
}
