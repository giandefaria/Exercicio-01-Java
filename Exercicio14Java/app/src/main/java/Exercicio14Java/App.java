/*
 Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
package Exercicio14Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int valorA;
        int valorB;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor");
        valorA = leitor.nextInt();
        
        System.out.println("Informe o segundo valor");
        valorB = leitor.nextInt();
        
        if (valorA > valorB) {
            System.out.println( valorA + " e maior que " + valorB);
        } else if (valorA == valorB) {
            System.out.println("Os valores informados são iguais");
        } else {
            System.out.println(valorB + " e maior que " + valorA);
        }
        
    }
}
