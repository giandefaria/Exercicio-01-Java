/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética);
 */
package Exercicio05Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        String nomeAluno;
        float notaUm;
        float notaDois;
        float notaTres;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno:");
        nomeAluno = leitor.nextLine();
        
        System.out.println("Informe a nota do aluno na primeira prova:");
        notaUm = leitor.nextFloat();
        
        System.out.println("Informe a nota do aluno na segunda prova:");
        notaDois = leitor.nextFloat();
        
        System.out.println("Informe a nota da terceira prova");
        notaTres = leitor.nextFloat();
        
        System.out.println("O aluno " + nomeAluno + " atingiu a média de " + 
                ((notaUm + notaDois + notaTres) / 3));
            
        
    }
}
