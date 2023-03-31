/*
A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */
package Exercicio33Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int nivel;
        int horas;
        float salario;
        char desejaContinuar = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
            
            System.out.println("Informe o nivel do professor: 1, 2 ou 3");
            nivel = leitor.nextInt();
            
            System.out.println("Digite a quantidade de horas trabalhadas:");
            horas = leitor.nextInt();
        
            System.out.println("Deseja continuar? S - Sim, N - Não");
            desejaContinuar = leitor.next().charAt(0);
        }
        
        
    }
}
