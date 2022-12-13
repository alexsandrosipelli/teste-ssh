
import java.util.Scanner;
public class Tentatibas{
public static void main(String[] args) 
{
   
    Scanner ler = new Scanner(System.in);
    
    
    
    String opcao;
    char op;
    boolean tacerto = false; 
    int T = 3; 
    
    do 
    {
        System.out.println("Em um computador o número 2012, em base decimal, será representado, em base binária, por:");
        

        System.out.println("A) 110111");
        System.out.println( "B) 110111");
        System.out.println( "C) 110111");
        System.out.println( "D) 110111");
        System.out.println( "E) 110111");
        System.out.println(  "Informe sua resposta: ");
        
        T--;
       
        
        opcao = ler.next();
       
        op = opcao .charAt(0);
        switch( op ) 
        {
        case 'A' : case 'a':
            System.out.println("Resposta errada :(  restam " + T + " tentativas "  );
            break;
       case 'b':case 'B':
            System.out.println("Respota correta!!! :D restando " +  T + " tentativas ");
            tacerto =true; 
            
            break;
       case 'c':case 'C':
            System.out.println("Resposta errada :( restam " + T + " tentativas ");
            break;
       case 'd':case 'D':
            System.out.println("Resposta errada :(restam " + T + " tentativas ");
            break;
        case 'e':case 'E':
            System.out.println("Resposta errada :(restam " + T + " tentativas ");
                break;
        }
    }while ( T!=0 && tacerto==false );
    if ( T >3 )
    {
        System.out.println("Resposta incorreta nas 3 tentativas " );
    }
}
}