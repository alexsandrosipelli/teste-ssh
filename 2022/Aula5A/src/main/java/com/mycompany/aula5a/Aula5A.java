/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula5a;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class Aula5A {

    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        double numlados,medlado;
        String tipo;
        
        System.out.println("digite uma quantidade de lados : ");
        numlados=ler.nextDouble();
        System.out.println("digite a medida dos lados :  ");
        medlado=ler.nextDouble();
        if (numlados==3){System.out.println("\nTRIANGULO\n");
         Double area=((medlado+medlado+medlado)/2);
        System.out.println(area + " é area do triangulo ");}
        
        if (numlados==4) {System.out.println("\n QUADRADO \n ");
        Double area=(medlado*medlado);
        System.out.println(area +" é area do quadrado");}      
                 
        if (numlados==5){ tipo = "PENTAGONO";
            System.out.println(tipo);
        
        Double area=((5*medlado*numlados)/(2*0.726542525));
        String saida;
        saida= String.format ("%.2f ", area ) ;
        System.out.println(saida + "é a area do Pentagono " ); }
        
         if (numlados<3){ tipo = " Nao é um polígono";
             System.out.println(tipo);}
         if(numlados>5) {
         tipo = " poligono não indentificado ";
         System.out.println(tipo);}
}}
         
        
     
    
        
               
    
    

