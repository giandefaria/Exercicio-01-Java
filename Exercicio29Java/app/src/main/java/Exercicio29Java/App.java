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
            case 1:
                System.out.println("Mês de janeiro");
                break;
            default:
                System.out.println("Mês não existente. Digite valor de 1 a 12");
        }
        
    }
}
