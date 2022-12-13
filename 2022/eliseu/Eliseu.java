/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eliseu;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class Eliseu
{
    public static void  processar()
    {
       double valor; double valores[]=new double[4];
       
       int dia;  int dias[]=new int[4];
        
       double txmulta=0.02;
       double multa; double multas[]=new double[4];         
              
       double juros; double juross[]=new double[4];
       double txjuros=0.1; 
       
       double vlpagar; double vlapagar[]=new double[4];
              
       Scanner ler= new Scanner(System.in);
       int a=0;
               while (a<4)
               {  
                 System.out.println("digite o valor :");
                 valor=ler.nextDouble();        
                 valores[a]=valor;
                 
                 System.out.println("digite os dias : ");
                 dia = ler.nextInt();                 
                 dias[a]=dia;  
                 
                 multa=(txmulta*valor);                                       
                 multas[a]=multa;
                 
                 juros=(txjuros*1/30*dia*valor);                         
                 juross[a]=juros;  
                 
                 vlpagar=(juros+multa+valor);          
                 vlapagar[a]=vlpagar;
                 a++;            
                }                                      
                 System.out.println("dias " + dias [0] +String.format(" Valor %.2f ",+valores [0]) +String.format("valor da multa %.2f ",+multas [0])+String.format("juros de dia %.2f ",+juross[0])+ String.format("O valor a pagar é %.2f",+vlapagar[0])); 
                 System.out.println("dias " + dias [1] +String.format(" Valor %.2f ",+valores [1]) +String.format("valor da multa %.2f ",+multas [1])+String.format("juros de dia %.2f ",+juross[1])+ String.format("O valor a pagar é %.2f",+vlapagar[1])); 
                 System.out.println("dias " + dias [2] +String.format(" Valor %.2f ",+valores [2]) +String.format("valor da multa %.2f ",+multas [2])+String.format("juros de dia %.2f ",+juross[2])+ String.format("O valor a pagar é %.2f",+vlapagar[2])); 
                 System.out.println("dias " + dias [3] +String.format(" Valor %.2f ",+valores [3]) +String.format("valor da multa %.2f ",+multas [3])+String.format("juros de dia %.2f ",+juross[3])+ String.format("O valor a pagar é %.2f",+vlapagar[3])); 
                                                                                                 
    } 
    public static void main(String[]agrs)
    {
        System.out.println("CALCULO DE VALOR A PAGAR : ");
        processar();
        
    }
}
//for(double item : vlapagar){System.out.println("valor a pagar \n "+ item);}//para apresentar os valores 
  //                    for(double item : juross  ){System.out.println(" juros\n"+item);         }
    //                  for(double item : multas  ){System.out.println(" multa\n"+item);         }
      //                for(double item : dias    ){System.out.println(" dias\n"+item );         }
        //              for(double item : valores ){System.out.println("valores\n"+item);        }  