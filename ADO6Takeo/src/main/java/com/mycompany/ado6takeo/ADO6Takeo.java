/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ado6takeo;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class ADO6Takeo{

   public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
        
        String operacaoStr;
        char operacao;
        int t=1;
        boolean tacerto = false; 
        
            do {
                
                System.out.println("A) 30");
                System.out.println("B) 22 ");
                System.out.println("C) 50 ");
                System.out.println("D) 44 ");
                System.out.println("E)  20 ");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                    
                case 'a': case 'A':
                    System.out.println("Resposta incorreta  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta")  ;
                    tacerto=!true;
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta ");
                    break;
                    
                }
            t=(t++);
            
            }while((operacao!='b')||(t>=3));
            
        }
               
                
               
    
}                