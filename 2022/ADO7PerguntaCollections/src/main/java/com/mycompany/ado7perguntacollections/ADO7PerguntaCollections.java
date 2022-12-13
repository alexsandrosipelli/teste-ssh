/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ado7perguntacollections;

/**
 *
 * @author alexs
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class ADO7PerguntaCollections {
    
    

    public static void main(String[] args) {
        
        String respostadousuario;
        boolean correto=false;
        int tentativas=3;
        Scanner ler = new Scanner(System.in);    
        
        
 //Collection<String> alternativas = new ArrayList<>();
 //        alternativas.add ("2x\n");
//         alternativas.add (" x²\n");
  //       alternativas.add (" 4x\n");
    //     alternativas.add (" x2/2\n");
      //   alternativas.add (" 2x2\n");
//for(int i = 0; i<alternativas.size();i++)
//System.out.println("["+i+"]"+((List<String>)alternativas).get(i));
        
        do
        {             
        tentativas--;    
        System.out.println("como fica o resultado de : x*x ?:");
        System.out.println("A) 2x");
        System.out.println( "B) x²"); //respota corretaaa//
        System.out.println( "C) 4x");
        System.out.println( "D) x2/2");
        System.out.println( "E) 2x2");
        System.out.println(  "Informe sua resposta: ");
        respostadousuario= ler.next();
        switch (respostadousuario){
            case "a":case "A":
                break;
            case "b":case "B": System.out.println("Resposta correta!");
            correto= true;           
            break;
            case "c":case "C":
            case "d":case "D":
            case "e":case "E":
        System.out.println("Resposta incorreta!");
        break;
        default: System.out.println ("Resposta invalida!!!");
        }
        }while (correto==false && tentativas !=0 );
         if(correto){System.out.println(" voce acertou com " + tentativas +" restantes  parabens " );
        }else{ System.out.println ( "Voce errou com " + tentativas+" Tentativas infelismente");
        }}}     
      
