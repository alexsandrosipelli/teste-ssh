/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author alexs
 */import java.util.Scanner;
public class campominadonet {

public class Tabuleiro {

private int numeroLinha;
private int numeroColuna;
private int matriz[][] = new int[8][8];
private Scanner entrada;

public Tabuleiro(){
}

public Tabuleiro(int numeroLinha, int numeroColuna){
this.numeroLinha = numeroLinha;
this.numeroColuna = numeroColuna;
}

public int getNumeroLinha() {
return numeroLinha;
}

public void setNumeroLinha(int numeroLinha) {
this.numeroLinha = numeroLinha;
}

public int getNumeroColuna() {
return numeroColuna;
}

public void setNumeroColuna(int numeroColuna) {
this.numeroColuna = numeroColuna;
}

public void inicio(){
System.out.println("*****INICIO DO CAMPO MINADO*****");
System.out.println();
for(int linha=0; linha<8; linha++){
for(int coluna=0; coluna<8; coluna++){
System.out.print(" - ");
}
System.out.println();
}
}


//construindo o tabuleiro com números
public void construindoJogo(){
int count = 0;
int aux = 0;
for(int linha = 0; linha<8; linha++){
for(int coluna=0; coluna<8; coluna++){
aux = -1 + (int)(Math.random()*6);
if(count==10 && aux==-1);
else{
if(count!=10 && aux==-1){
matriz[linha][coluna] = aux;
count++;
}
else{
if(count!=-1 && aux!=-1)
matriz[linha][coluna] = aux;
}
}
}
}
System.out.println();
}

public void mostraJogo(){
for(int linha=0; linha<8; linha++){
for(int coluna=0; coluna<8; coluna++){
System.out.print(matriz[linha][coluna]+" ");
}
System.out.println();
}
}

public void usuarioJogando(){
//count começa com 1, pois antes de entrar no while(...) é solicitado que o usuário digite um numeroLinha e um numeroColuna
int count = 1;
entrada = new Scanner(System.in);
System.out.print("Digite a linha (De 0 a 7):");
numeroLinha = entrada.nextInt();
System.out.print("Digite a coluna (De 0 a 7):");
numeroColuna = entrada.nextInt();

while(matriz[numeroLinha][numeroColuna]!=-1){
for(int linha = 0; linha<8; linha++){
for(int coluna = 0; coluna<8; coluna++){
if(linha==getNumeroLinha() && coluna==getNumeroColuna())
System.out.print(matriz[numeroLinha][numeroColuna]+" ");
else
System.out.print(" - ");
}
System.out.println();
}
System.out.print("Digite a linha (0 a 7):");
numeroLinha = entrada.nextInt();
System.out.print("Digite a coluna (0 a 7):");
numeroColuna = entrada.nextInt();
//Sempre que o usuário digitar numeroLinha e numeroColuna, count será incrementado
count++;
}

if(count==54)
System.out.println("Voce encontrou nenhuma bomba. Parabens!!!Ganhou o jogo.");

else
System.out.println("Voce perdeu o jogo!!!!");
}
}




public class Principal {

public static void main(String[] args){

Tabuleiro tab;
//tab = new Tabuleiro();
//tab.inicio();
//tab.construindoJogo();
//tab.usuarioJogando();
}
}
    
}
