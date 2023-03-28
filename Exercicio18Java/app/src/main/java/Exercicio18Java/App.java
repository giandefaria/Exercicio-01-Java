/*
Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package Exercicio18Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int idade;
        int quantidadeRepeticoes = 5;

        Scanner leitor = new Scanner(System.in);

        while (quantidadeRepeticoes > 0) {
            System.out.println("Informe a idade da pessoa:");
            idade = leitor.nextInt();

            if (idade >= 18) {
                System.out.println("É maior de idade");
            } else {
                System.out.println("É menor de idade");
            }

            quantidadeRepeticoes--;
        }
    }
}
