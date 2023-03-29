/*
Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes;
 */
package Exercicio25Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;

        char desejaRepetir = 's';

        Scanner leitor = new Scanner(System.in);

        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Insira o primeiro número:");
            numeroUm = leitor.nextInt();

            System.out.println("Insira o segundo número:");
            numeroDois = leitor.nextInt();

            if (numeroUm == numeroDois) {
                System.out.println("Os números são iguais");
            } else if (numeroUm > numeroDois) {
                System.out.println("O primeiro número é maior que o segundo número");
            } else {
                System.out.println("O primeiro número é menor que o segundo número");
            }

            System.out.println("Deseja repetir? S - Sim, N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }
    }
}
