import java.util.Scanner;

import java.util.Random;

public class Main{  
  public static void main(String[]args){
int a,b;
int min,max;

Scanner ler=new Scanner(System.in);

Random aleatorio = new Random();

System.out.print("Digite o valor  min: ");

min = ler.nextInt();

System.out.print("Digite o valor max: ");

max = ler.nextInt();

while((a=aleatorio.nextInt((max-min)+1)+min)==0){};

b=aleatorio.nextInt((max-min)+1)+min;

if(b>0){

System.out.println("Equação do 1o grau: "+a+"x + "+b+" = 0");

}else if(b==0){

System.out.println("Equação do 1o grau:"+a+"x=0");

}else{

System.out.println("Equação do 1o grau: "+a+"x - "+(-1)*b+" = 0");}

System.out.println("Solução: x = "+(double)-b/a);}}