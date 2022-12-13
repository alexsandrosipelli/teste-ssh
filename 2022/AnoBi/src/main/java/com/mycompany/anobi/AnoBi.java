/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.anobi;

/**
 *
 * @author alexs
 * c) Fazer quadro resumo, diagrama de blocos e o código fonte: O usuário deverá
digitar um ano qualquer e o programa deverá exibir uma mensagem
informando se o Ano digitado é bissexto ou se não é bissexto; (crie uma
variável do tipo string para armazenar a mensagem “Bissexto” ou “Não
Bissexto”, use a função mod, estruturação de seleção com Menu ).

 */
import javax.swing.JOptionPane;
public class AnoBi {
    
   public static void main(String[] args){
       String menu = "\n menu" + " \n 1 Excutar \n 2 Sair " ;       
   
       String saida;
    
       int tecla;
   
       int ano;
       
       while(true){ 
         tecla = Integer.parseInt(JOptionPane.showInputDialog(null,menu, " Ano bissexto ",JOptionPane.QUESTION_MESSAGE));
  
       switch (tecla) { 
           case 1 : ano = Integer.parseInt(JOptionPane.showInputDialog(null," Digite um ano para saber se é bissexto "));        
         
        if((ano % 4 == 0) && (ano % 100 != 0)){
         saida= "O ano " + ano + " é bissexto";
         JOptionPane.showMessageDialog(null, saida);
         
        }else{           
            saida= "O ano " + ano + " nao é bissexto ";
            JOptionPane.showMessageDialog(null, saida);}
       break;
        
        
        case 2: JOptionPane.showMessageDialog(null, "Programa será finalizado!");
                     System.exit(0);   
   }}
}}