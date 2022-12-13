
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexs
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class teste {

    public static void main(String[] args) {
        
        String questao,respostadousuario;
        boolean correto=false;
        int tentativas=3;
        String A=" 2x";
        String B=" x²";
        String C=" 4x";
        String D=" x2/2";
        String E=" 2x2";
        
        String[] pergunta = new String[5];
        pergunta[0] = " 2x\n" ;
        pergunta[1] = " x²\n";
        pergunta[2] = " 4x\n";
        pergunta[3] = " x2/2\n" ;
        pergunta[4] = " 2x2\n";
        Scanner ler = new Scanner(System.in);
        System.out.println("A)"+pergunta[0]);
        System.out.println("B)"+pergunta[1]);
        System.out.println("C)"+pergunta[2]);
        System.out.println("D)"+pergunta[3]);
        System.out.println("E)"+pergunta[4]);
        
     Collection<String> pergunta = new ArrayList<>();

       Collections.shuffle(pergunta);
       
         //do{
           //  tentativas--;
            
        // System.out.println(alternativas);
       //  respostadousuario= ler.next();
              
       
         
         //}while(tentativas!=0  );
         //if ( respostadousuario.equals(((List<String>)alternativas).get(1))){
                // System.out.println(" errou");}
}}