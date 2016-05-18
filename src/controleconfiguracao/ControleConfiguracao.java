package controleconfiguracao;

import java.util.Scanner;


public class ControleConfiguracao {

     public static void main(String[] args) {
Scanner input = new Scanner (System.in);
      
       System.out.println("Digite o primeiro numero: ");
        double n1 = input.nextDouble();
        
        System.out.println("Digite o Segundo Numero: ");
        double n2 = input.nextDouble();
        
        System.out.println("Digite o Terceiro Numero: ");
        double n3 = input.nextDouble();
        
        if (n1 > n2 & n1 > n3){
            System.out.println("O numero maior é: "+n1);
        }
        else if (n2 > n1 & n2 > n3){
            System.out.println("O maior numero é: "+n2);
        }
        else if (n3 > n1 & n3 > n2){
        System.out.println("O maior numero é: "+n3);
        }
        if (n1 == n2 & n2 == n3){
            System.out.println("Os numeros são iguais");
        }    
        if (n1 < n2 & n1 < n3){
            System.out.println("O numero menor é: "+n1);
        }
        else if (n2 < n1 & n2 < n3){
            System.out.println("O menor numero é: "+n2);
        }
        else if (n3 < n1 & n3 < n2){
        System.out.println("O menor numero é: "+n3);
        }
        } 
}