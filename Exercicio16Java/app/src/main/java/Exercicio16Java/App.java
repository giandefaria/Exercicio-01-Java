/*
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
 */
package Exercicio16Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        String nomeAluno;
        float notaUm = 0f;
        float notaDois = 0f;
        float notaTres = 0f;
        float media = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno");
        nomeAluno = leitor.nextLine();
        
        System.out.println("Informe a primeira nota");
        notaUm = leitor.nextFloat();
        
        System.out.println("Informe a segunda nota");
        notaDois = leitor.nextFloat();
        
        System.out.println("Informe a terceira nota");
        notaTres = leitor.nextFloat();
    }
}
