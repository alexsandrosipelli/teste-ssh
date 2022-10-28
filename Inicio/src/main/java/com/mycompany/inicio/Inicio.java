/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inicio;

/**
 *
 * @author alexs
 */import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double a,b;
    String c;
     Scanner ler = new Scanner(System.in);
    do {
     System.out.println("Olá, bem vindo ao Mochileiro ");
     System.out.println("╔═════════════════════════════ ∘◦ ☆ ◦∘ ════════════════════════════════════════════╗" +"\n");
    
     System.out.println("Vocês estão em uma taverna, quando uma briga generalizada começa. Os guardas chegam e levam todos presos. Agora vocês precisam provar que são inocentes, ou passarão meses na cadeia " + "\n" );
    System.out.println(" ╚═════════════════════════════ ∘◦ ミ⛧ ◦∘ ═════════════════════════════════════════╝");
     System.out.println(" Você deseja iniciar ? " + "\n");
     System.out.println("1- sim ");
     System.out.println("2- nao ");
     a= ler.nextDouble();
     if (a ==1 ){ System.out.println(" Iniciando sua jornanda da sabedoria " + "\n " );}
       
     else { System.out.println(" estamos aguardando sua sede por sabedoria " + "\n" ) 
       ;}
    }while (a !=1 );
      
    System.out.println(" Como é o seu nome ? " + "\n");
    c= ler.next();
    System.out.println(" muito bem Grande Mochileiro " + c );
    
    
    
    
    
  }
}