
package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ControleConfiguracao4 {
    public static void main (String[] args) {
        String nome;
        int idade;
        float altura;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome do Usuário: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite sua Idade: ");
        idade = entrada.nextInt();
        
        System.out.println("Digite a altura: ");
        altura = entrada.nextFloat();
        entrada.close();
        
        System.out.println("Seu nome: "+nome);
        System.out.println("Sua idade: "+idade);
        System.out.println("Sua altura: "+altura);
    }
}
