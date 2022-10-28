/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ado8dadorandom;

/**
 *
 * @author alexs
 */
public class ADO8DadoRandom {
    public static void main(String[] args) {
       
      double quantidade=0;
      double numero1=0;
      double numero2=0;
      double numero3=0;
      double numero4=0;
      double numero5=0;
      double numero6=0;
        do{
            
          quantidade++;
          
           int dado1 = (int) (Math.random() * 6 + 1 ) ;
           
       
          System.out.println(dado1  );
           if (dado1==1 ){ numero1++ ;}
           if (dado1==2 ){ numero2++ ;}
           if (dado1==3 ){numero3++ ;}
           if (dado1==4 ){ numero4++;}
           if (dado1==5 ){ numero5++ ;}
           if (dado1==6 ){ numero6++ ;}
           
                   
                }while (quantidade <1000000);
        System.out.println( "o numero 1 apareceu " +(numero1)+" vezes "  +((numero1*100)/1000000)+ "%" );
        System.out.println( "o numero 2 apareceu " +(numero2)+" vezes "  +((numero2*100)/1000000)+ "%");
        System.out.println( "o numero 3 apareceu " +(numero3)+" vezes "  +((numero3*100)/1000000)+ "%");
        System.out.println( "o numero 4 apareceu " +(numero4)+" vezes " +((numero4*100)/1000000)+ "% ");
        System.out.println( "o numero 5 apareceu " +(numero5)+" vezes " +((numero5*100)/1000000)+ "%");
        System.out.println( "o numero 6 apareceu " +(numero6)+" vezes "  +((numero6*100)/1000000)+ "%");
         }}     