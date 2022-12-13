package com.mycompany.pergunta;
/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class Pergunta {

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        
        String operacaoStr;
        char operacao;
        boolean tacerto = false; 
        
            do {
                System.out.println("O número 2012, em base decimal, em base binária fica ?:");
                System.out.println("A) 110111");
                System.out.println("B) 11111011100 ");
                System.out.println("C) Não é possivel!");
                System.out.println("D) 110111");
                System.out.println("E) 1F12");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta :( ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta:( ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta:(");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta :(");
                    break;
                }
            }while(tacerto);
            
        }
               
                
               
    
}
                
                
        