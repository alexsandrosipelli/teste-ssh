/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class caracteres {
   public static void main ( String [ ] args ) {
        Scanner ler = new Scanner ( System.in ) ;
        String s;
        System.out.println ( " digite a palavra para saber quantos caracteres ela possui");
        s = ler.next ( ) ;
        System.out.println ( s ) ;
        System.out.print ( " A quantidade de caracteres é : " + ( s.length ( ) ) ) ;
    
}
}
