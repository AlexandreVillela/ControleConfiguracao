
package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Aluno {
      static public void main (String [] args){
        Scanner input= new Scanner (System.in);
        
        System.out.println("Digite o nome do Aluno: ");
        String aluno = input.nextLine ();
                      
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble ();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble ();
        
        double nota = (nota1+nota2)/2;
        
        if (nota >= 6 & nota <=9.9){
        System.out.println("O aluno foi aprovado: ");
        }
        else if (nota <6){
        System.out.println("O aluno foi reprovado: ");
        }
        else if (nota ==10){
        System.out.println("O aluno foi aprovado por Média");
        
        }
    }
}
