/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tresnumeroseliseu;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class TresNumerosEliseu {

    public static void main(String[] args) {
        int valor1, valor2, valor3;
        
        Scanner ler = new Scanner (System.in);
        System.out.println(" Digite um valor inteiro : "); valor1=ler.nextInt();
        
        System.out.println(" Digite  o segundo valor inteiro : ");valor2=ler.nextInt();

        System.out.println(" Digite o terceiro valor inteiro : ");valor3=ler.nextInt();
        if ((valor1 ==0) || (valor2 ==0) || (valor3==0) ){System.out.println(" nenhum numero pode ser igual a 0 ");}
        else{
        
        if ((valor1 < 0) || (valor2 < 0) || (valor3 < 0) ){System.out.println(" nenhum numero pode ser negativo ");}
        else{
        
        if ((valor1 == valor2 ) || (valor2== valor3)||(valor1==valor3) ){System.out.println(" nenhum numero pode ser igual ");}
        else{
         
        if ((valor1 > valor2 ) && ( valor1 > valor3 ) ){System.out.println(" esse é o maior numero " + valor1);}
        else{
        
        if ((valor2 > valor1 ) && ( valor2 > valor3 ) ){System.out.println(" esse é o maior numero " + valor2);}
        
        else { System.out.println(" esse é o maior valor " +valor3);}}}}}
       
        
       
        
        
        
    }
}
