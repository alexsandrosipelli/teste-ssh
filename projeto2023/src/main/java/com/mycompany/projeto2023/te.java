/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2023;

/**
 *
 * @author alexs
 */
import java.util.Scanner;

public class te
{ 
         int x=2,y=2;
     String nomes[]=new String[x];
    double valor []= new double[y];
     public  void definir()
{ 
    Scanner ler = new Scanner(System.in);
    System.out.println("defina a quantidade de nomes : ");
    x = ler.nextInt();
     
    System.out.println("defina a quantidade de valores : ");
    y = ler.nextInt();  
        ixibir();
        
}

    
    
    public  void nome()
{ 
    Scanner ler = new Scanner(System.in);
        for(int i=0;i<nomes.length;i++)
        {
            System.out.println("digite o nome : ");
            nomes[i]=ler.next(); 
           
        } 
    
        
        ixibir();
        
}
  
    public  void valor()
    {
         Scanner ler = new Scanner(System.in);
        
        for(int i=0;i<valor.length;i++)
        {
            System.out.println("digite os valores  : ");
            valor[i]=ler.nextInt(); 
           
        } 
        ixibir();
        
         
    }
      public  void ixibirnomesEvalores()
    {
      for ( int i=0;i<nomes.length;i++){
             System.out.println("O nome foi " + nomes[i]+ " e o valor é " + valor[i]);
         }

             ixibir();
    }
    
    public  void ixibir ()
    { 
        Scanner ler = new Scanner(System.in);
        
            String menu = " ESCOLHA!!! \n";
            menu += " 1 definir o tamanho: \n";
            menu += " 2 digitar nomes\n";
            menu += " 3 digitar valores:\n";
            menu += " 4 ver nomes e valores :\n";
            menu += " 5 sair :\n";
            String tecla;
            System.out.println(menu);
            tecla= ler.next();
           while(!(tecla.equals("5")))
        {
            if (tecla.equals("1"))
            {
                definir();
                

            }

            else if (tecla.equals("2"))
            { 
                nome();
               
            }
            else if (tecla.equals("3"))
            {
                valor();
              
            }
            else if (tecla.equals("4"))
            {
                ixibirnomesEvalores();
            }
            
            else
            { 
                System.out.println(" escolha errada escolha entre 1,2,3 ou 4 !!  ");
                ixibir();
            }
        
    }
    
    }

    public  static void main(String[] args) 
    {  te a1 = new te();
       a1.ixibir();
        System.out.println("ISSOooo");
        
    } 
}
