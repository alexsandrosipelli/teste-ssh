/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula4al;
import java.util.Scanner;
public class Aula4Al{
    public static void main (String[]args){
       Scanner ler = new Scanner(System.in);
       double peso, altura,imc; String nome;
        System.out.println("digite seu nome : ");
        nome=ler.next();
        System.out.println("digite seu peso : ");
        peso=ler.nextDouble();
        System.out.println("digite sua altura : ");
        altura=ler.nextDouble();
        imc = peso / (altura * altura);
        
        if (imc <18.5){
            System.out.println("Abaixo do peso ");}
        else if(imc < 24.9 && imc > 18.5)  {System.out.println("peso normal"); }
        else if (imc > 25) {System.out.println(" tá com Sobrepeso "); }
        String saida;
        saida = String.format("o imc de :%s é %.2f ",nome,imc)+ "\n"+ "\n"+ "\n" + " de acordo com a tabela IMC" + "\n" +  "\n" + "menor que 18,5 Abaixo do peso \n" + "IMC entre 18,5 e 24,9 Peso normal\n" +
"IMC acima de 25 tá com Sobrepeso ";
        System.out.println(saida);
        
          
           
        }
    }
    
    
