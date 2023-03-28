/*
 Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicio13Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número");
        numero = leitor.nextInt();
        
        if (numero > 10) {
            System.out.println("Número informado é maior que 10");
        } else {
            System.out.println("Número informado é menor ou igual a 10");
        }

    }
}
