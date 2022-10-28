/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eliseu;

/**
 *
 * @author alexs
 * 
 */
import javax.swing.JOptionPane;

public class Aula9EliseuADO
{
    public static void main (String[]args )
    {
     int Qvalor=0;
     int cont=0;
     int tecla;
     double valor=0;
     double saldo=0;
     double media=0;            
     String menu  =" valores que vc recebeu ";
     menu += "selecione : \n 1 excutar \n 2 resultados \n 3 sair ";
     String nome;                                                   
         nome=(JOptionPane.showInputDialog(null,"digite seu nome",JOptionPane.QUESTION_MESSAGE));            
         Qvalor=Integer.parseInt(JOptionPane.showInputDialog(null,"digite a quantidade de valores que vai amazenar  : ",JOptionPane.QUESTION_MESSAGE));          
         double numeros[]=new double[Qvalor];          
        while(cont<Qvalor)
        {           
         numeros [cont] =Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor que vai amazenar  : ",JOptionPane.QUESTION_MESSAGE));                           
                 
         saldo = saldo + numeros [ cont ]; 
         media = (saldo) /(cont);cont++;
         
         
        }             cont=0;
                
                while(cont<Qvalor){System.out.println(numeros[cont]);cont++;}
                 JOptionPane.showMessageDialog(null,"Ola " + nome + " \n saldo é: "+ saldo+ " \n media é: "+media+ "\n Esses saos seus depositos "+"\n E esse foram os eles :"  );                                                    
    }            
           
                       
}                        
                       
                       




              
        
            
                         
                                       
                                                              
        
    
