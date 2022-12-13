/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado54opcoes;

/**
 *
 * @author alexs Crie um menu que permita o usuário escolher as seguintes opções para um
jogo:
1 – Instruções
2 – Jogar
3 – Créditos
4 – Sair
Utilize a estrutura switch dentro de um laço do-while, na implementação. O
menu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –
Sair
 */
import java.util.Scanner;
public class ADO5 {
    public static void main(String[]args){
        int n,a;
        a=(1+1);
        
        do{ // tem que ser colocado antes dos sout, para serem ser repetido o enunciado e nao a resposta.
         Scanner ler = new Scanner(System.in);
         System.out.println("1 – Instruções");
         System.out.println("2 – Jogar");
         System.out.println("3 – Créditos");
         System.out.println("4 – Sair");
         System.out.println("escolha uma das opções : ");
         n = ler.nextInt();
     
           
            // se tivesse um "do" aqui igual eu estava errando iria ficar em um loop infinito das respostas e nao do enunciado.
            switch (n)/* n = variavel a qual o switch esta testando os resultados se caso a variavel for tal(case) oq fazer (sout) */{
              case 1: // caso o  n = variavel for 1 
               System.out.println("essas sao as instruçoes ...");
               System.out.print("\n"); // para pular uma linha antes de repetir o enunciado 
                 break;// para que nao leia o proximo sout. 
               case 2: // caso o  n = variavel for 2
                   System.out.println("iniciando jogo");
                   System.out.print("\n");// para pular uma linha antes de repetir o enunciado
                 break;// para que nao leia o proximo sout. 
              case 3:  // caso o  n = variavel for 3
                  System.out.println(" aprensentando creditos  ");
                  System.out.print("\n");// para pular uma linha antes de repetir o enunciado
              break; // para que nao leia o proximo sout. 
               case 4:  // caso o  n = variavel for 4
                   System.out.println("saindo...");
                   default:
                  System.out.println("Opção inválida!");

            }  
               
        }while((n<=3)||(a==3));// while para que seja repetido o enunciado ate que a a variavel seja menor ou igual a 3...
        //  assim fazendo com que quando a pessoa digite 4 encerre dando um fim no (do).
            
      }
    }

      
          
          
        
        

           
                         
        

      


        
    
    

