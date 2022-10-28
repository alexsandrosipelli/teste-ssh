/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eliseu;

/**
 *
 * @author alexs
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class EtenderSubrotina {
    public static void processar(){ 
        int num;
        int a;
        int t=0;
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random (); 
         a=aleatorio.nextInt(100);
        do {  
            
            System.out.println(" digite um numero : " + a );
           num=ler.nextInt();
        if(num == a ){System.out.println("“Parabéns, você ganhou o jogo!” ");}
        if (num - a == 1 || num + 1 == a  ){System.out.println(" esta quente ");}
        else if (num<a  ) {System.out.println(" É maior ");}
        
        else if (num>a  ) {System.out.println(" É menor ");}
        t++;
            }while((t!=5) && ( num !=a ));
        if (num !=a){System.out.println("game over!!! ");}
        
        System.out.println("\n \n O numero era exatamente  " +  a );}
    public static void main(String[] args ) {
        String menu = " Esta preparado para testar sua sorte ? ";
        menu+= "selecione a opção \n 1 excutar \n 2 sair  ";
        int tecla;
        while (true){
       tecla = Integer.parseInt (JOptionPane.showInputDialog(null, menu," jogo de adivinhar ",JOptionPane.QUESTION_MESSAGE));
       switch (tecla){
           
       
           case 1 : 
               processar();
               break;
           case 2 :
               JOptionPane.showMessageDialog(null,"Sendo finalizado");
               System.exit(0);
            
    }}}}









 
