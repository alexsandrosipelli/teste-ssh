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
public class Anobiss {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano para saber se é bissexto");
        ano = ent.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
    }
}
    

