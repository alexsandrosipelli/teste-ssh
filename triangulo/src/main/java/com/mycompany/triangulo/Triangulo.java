/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triangulo;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class Triangulo {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite um valor : ");
        a=l.nextDouble();
        System.out.println("Digite o segundo valor : ");
        b=l.nextDouble();
        System.out.println("Digite o terceiro  valor : ");
        c=l.nextDouble();
         if (((a+b)>c) && ((a+c)>b) && ((b+c)>a)) // para saber se forma um triagulo primeiro
         {System.out.println("forma um triangulo  ");   //se formar  
         if ((a==b)&&(b==c)&&(a==c)){
             System.out.println("triangulo equilatero");}//triangulo equilatero, por ter todos iguais.
         
         if(((a==b)&&(b!=c))||((b==c)&&(c!=a))||((c==a)&&(a!=b))) {
             System.out.println("é um isoseles");}// triangulo isoseles por ter dois iguais
         if((a!=b)&&(b!=c)&&(a!=c)){
             System.out.println("triagulo escalelo");} }//triagulo escaleno, por ter todos diferentes 
           else {System.out.println("nao forma um triangulo");}//se nao formar
         
         }
         

                             
                     
                }     

           
                                                   
                                            
                       
