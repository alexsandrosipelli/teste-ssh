/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eliseu;
/**
 *
 * @author alexs
 */import java.util.Scanner;
import javax.swing.JOptionPane;
public class aula9ado
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
       int tecla;//final das variaveis
       while(true)
           
       {    
           System.out.println("1 ou 2 ");
           tecla=ler.nextInt();
           switch (tecla)
           {
               case 1:
                   while (a<4)
               { 
                   System.out.println("digite o valor :");
                 valor=ler.nextDouble();        
                 valores[a]=valor;
        
                 System.out.println("digite os dias : ");
                 dia = ler.nextInt();
                  dias[a]=dia;
    
                 multa=(txmulta*valor);                        
                 System.out.println("valor da multa " +multa);
                 multas[a]=multa;
            
                 juros=(txjuros*1/30*dia*valor);        
                 System.out.println(String.format("juros de dia %.2f ", juros));
                 juross[a]=juros;
            
                 vlpagar=(juros+multa+valor);            
                 System.out.println(String.format("O valor a pagar é %.2f" ,vlpagar));
                   System.out.println("\npula\n\n");
                 vlapagar[a]=vlpagar;
                 a++; // for(double item : vlapagar){System.out.println("valor a pagar "+ item);}//para apresentar os valores 
                // for(double item : juross){System.out.println(" juros"+item);}
                // for(double item : multas){System.out.println(" multa"+item);}
               //  for(double item : dias){System.out.println(" dias"+item);}
                // for(double item : valores){System.out.println("valores"+item);}                     
                                         
                
                } 
                 break;
                

                 case 2 : System.exit(0);
                 break;
                 default : System.out.println("errado"); 
               
            }
        }
    }
                     
    
    public static void main(String[]agrs)
    {
        System.out.println("CALCULO DE VALOR A PAGAR : ");
        processar();
        
    }
}
    

  
