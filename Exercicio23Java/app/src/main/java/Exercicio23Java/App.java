/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
menor que 25 ou igual a 40;
 */
package Exercicio23Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        numero = leitor.nextInt();

        if (numero > 80) {
            System.out.println("O número informado é maior que 80");
        } else if (numero == 40) {
            System.out.println("O número é igual a 40");
        } else if (numero < 25) {
            System.out.println("O número é menor que 25");
        } else {
            System.out.println("O numero está entre 25 e 80 e não é 40");
        }

    }
}
