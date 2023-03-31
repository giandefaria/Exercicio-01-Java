/*
Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
 */
package Exercicio29Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int mes;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número do mês de 1 a 12");
        mes = leitor.nextInt();
        
        switch (mes) {
            case 1 -> System.out.println("Mês de janeiro");
            case 2 -> System.out.println("Mês de fevereiro");
            case 3 -> System.out.println("Mês de março");
            case 4 -> System.out.println("Mês de abril");
            case 5 -> System.out.println("Mês de maio");
            case 6 -> System.out.println("Mês de junho");
            case 7 -> System.out.println("Mês de julho");
            case 8 -> System.out.println("Mês de agosto");
            case 9 -> System.out.println("Mês de setembro");
            case 10 -> System.out.println("Mês de outubro");
            case 11 -> System.out.println("Mês de novembro");
            case 12 -> System.out.println("Mês de dezembro");
            default -> System.out.println("Mês não existente. Digite valor de 1 a 12");
        }
        
    }
}
