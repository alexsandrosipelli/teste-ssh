/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto2023;

/**
 *
 * @author alexsandro
 */
import java.util.Scanner;

public class Projeto2023 {
     String nomes[]=new String[10];
     int valor []= new int[10];
    public  void nome()
{ 
    Scanner ler = new Scanner(System.in);
       
        for(int i=0;i<nomes.length;i++)
        {
            System.out.println("digite o nome : ");
            nomes[i]=ler.next(); 
        }
}
  
    public  void valor()
    {
         Scanner ler = new Scanner(System.in);
        
        for(int i=0;i<valor.length;i++)
        {
            System.out.println("digite os valores  : ");
            valor[i]=ler.nextInt(); 
        }
        
         
    }
      public void ixibirnomesEvalores()
    {
              for(int i=0;i<nomes.length;i++){
             System.out.println("O nome foi " + nomes[i]);
         }
              for(int i=0;i<valor.length;i++)
         {
             System.out.println("o valor foi " + valor[i]);
         }
    }
    
    public  void ixibir ()
    { 
        Scanner ler = new Scanner(System.in);
        
            String menu = "Escolha";
            menu += " 1 digitar nomes : "+"/n";
            menu += "2 digitar valores:";
            menu += "3 ver nomes e valores :";
            menu += "4 sair :";
            String tecla;
            System.out.println(menu);
            tecla= ler.next();
           while(tecla.equals("4"))
        {
            if (tecla.equals("1"))
            {
                nome();

            }

            else if (tecla.equals("2"))
            {
               valor();
            }
            else if (tecla.equals("3"))
            {
              ixibirnomesEvalores();
            }
            
            else
            { 
                System.out.println(" escolha errada escolha entre 1,2,3 ou 4 !!  ");
            }
        
    }
    
    }

    public static void main(String[] args) 
    {  
      Projeto2023 a1 = new Projeto2023();
       a1.ixibir();
        
       
    }
}
