package com.mycompany.projeto;

/**
 *
 * @author alexs
 */
     import java.util.Scanner;
public class desconto {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int v,D;
        System.out.println("Valor do produto : ");
        v=ler.nextInt();
         if (v>=300){
           System.out.print("vc terá o desconto");
         }
        else{
           System.out.print("vc nao terá o desconto");
         }
        
        
    }
    
}
