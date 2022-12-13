/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author alexs
 */import java.util.Scanner;
public class campo_minado {
    public  static void main(String[]args)
            
{   
    
    Scanner ler= new Scanner(System.in);
    int cam ;
    int bom;
  
    System.out.println("digite o tamanhado do caminho:");
    cam=ler.nextInt();
    System.out.println("digite a quantidade de bombas ");
    bom=ler.nextInt();
     int num [][]= new int [cam][bom];
     
     System.out.println(num[cam][bom]);
   
   
  /*for (int i = 0; i < num[cam].length; i++){
for (int j = 0; j < num[bom].length; j++){num[i][j] = 0;}}*/
  
  
   /*  for(int i=0;i<num.length;++i){
     for(int j=0;j<num[i].length;j++ ){
    System.out.print(i+"|"+j+"="+num[i][j]+"\t");}        
          System.out.println("\n");}*/
          
  
  
     
 /* int vetor[][]= new int [3][3];
  vetor[0][0]=10;
  vetor[0][1]=20;
  vetor[0][2]=30;
  
 vetor[1][0]=40;
  vetor[1][1]=50;
  vetor[1][2]=60;
  
  vetor[2][0]=70;
  vetor[2][1]=80;
  vetor[2][2]=90;
  
  for(int i=0;i<vetor.length;++i){
      for(int j=0;j<vetor[i].length;j++ ){
    System.out.print(i+"|"+j+"="+vetor[i][j]+"\t");}        
          System.out.println("\n");}*/
   
    
  
    
}
} 