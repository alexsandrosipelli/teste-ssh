/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class caracteres {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String s;
        
        System.out.print(" digite a palavra para saber quantos caracteres ela possui  : ");
        s= ler.next();
        System.out.println (s);
        System.out.print("A quantidade de caracteres é :  "+(s.length()));
        
        
        
    }
}
