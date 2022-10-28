/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jogo;

/**
 *
 * @author alexs
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Jogo{
 
  public static void main(String[] args) {
    double escolhadeinicio ;
      String nome; 
     Scanner ler = new Scanner(System.in);

    do {
     System.out.println("Olá, bem vindo ao Mochileiro \n");
   
    
     System.out.println("Vocês estão em uma taverna, quando uma briga generalizada começa. Os guardas chegam e levam todos presos. Agora vocês precisam provar que são inocentes, ou passarão meses na cadeia " + "\n" );
  
     System.out.println(" Você deseja iniciar ? " + "\n");
     System.out.println("1- sim ");
     System.out.println("2- nao ");
     escolhadeinicio= ler.nextDouble();
     if (escolhadeinicio ==1 ){ System.out.println(" Iniciando sua jornanda da sabedoria " + "\n " );}
       
     else { System.out.println(" estamos aguardando sua sede por sabedoria " + "\n" ) 
       ;}
    }while (escolhadeinicio !=1 );
      
    System.out.println(" Como é o seu nome ? " + "\n");
    nome= ler.next();
    System.out.println(" muito bem Grande Mochileiro " + nome );
    
     int escolha;
     
    do{
         
     System.out.println("escolha sua classe \n 1-Guerreiro \n 2-Mago \n 3-Bruxa \n 4-Fada ");
      escolha = ler.nextInt();
      
      switch (escolha){
          case 1 :
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a) " +" Guerreiro " + nome +"\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Guerreiro " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
              System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n"+ 
 nome + "\n" 
+"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
              System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr;
        char operacao;
        boolean tacerto = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto);
              
              
      break;
       case 2:
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a)"+ " Mago " + nome + "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Mago " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática." );
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n" +
"Hiago!!!\n" +
"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
             System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr2;
        char operacao2;
        boolean tacerto2 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto2);
      break;    
      case 3:
      System.out.println (" A aventura dos numeros nos espera, mochileiro(a) bruxa " + nome + "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Bruxa " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.");
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n" +
"Hiago!!!\n" +
"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
              System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr3;
        char operacao3;
        boolean tacerto3 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  \" ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto3);
          break;
      case 4 :
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a) Fada " + nome+ "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Fada " + nome
                         + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.");
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n" +
"Hiago!!!\n" +
"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
             System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
        
        boolean tacerto4 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println(" Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta... É, você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto4);
          break;
        }
      } while(escolha >4);

    
   }
}
  




    

     
     
  
     
             
    
    
    
    
     
    
    
  

