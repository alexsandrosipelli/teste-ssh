/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diasdasemana;

/**
 *
 * @author alexs
 */
import java.util.Scanner;
public class Diasdasemana {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int n;
        System.out.println("digite um valor de 1 a 7 para saber qual dia da semana");
        n=ler.nextInt();
       
        switch(n){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
                case 3:
                System.out.println("terça");
                break;
                case 4:
                System.out.println("quarta");
                break;
                case 5:
                System.out.println("quinta");
                break;
                case 6:
                System.out.println("sexta");
                break;
                case 7:
                System.out.println("sabado");
                break;
                default:
                    System.out.println("Valor inválido!");
        }
        
        
    }
}
