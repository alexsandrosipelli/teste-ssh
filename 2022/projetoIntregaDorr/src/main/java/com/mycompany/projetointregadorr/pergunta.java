/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointregadorr;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class pergunta {

   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String operacaoStr;
        char operacao;
        boolean tacerto = false; 
         do {
                System.out.println("Em um computador o número 2012, em base decimal, será representado, em base binária, por ?:");
                
                System.out.println("A) 110111");
                System.out.println("B) 110111");
                System.out.println("C) 110111");
                System.out.println("D) 110111");
                System.out.println("E) 110111");
                
                System.out.println("Informe sua resposta: ");
                
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                
                
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta errada :( ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta errada :( ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta errada :(");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta errada :("); break;
                }
            }while(!tacerto);
            
        }
    
}