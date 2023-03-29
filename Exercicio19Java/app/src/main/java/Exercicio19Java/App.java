/*
Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres
 */
package Exercicio19Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        int quantidadeRepeticoes = 5;
        String nome;
        char sexo;
        
        Scanner leitor = new Scanner(System.in);
        
        while (quantidadeRepeticoes > 0) {
        
            System.out.println("Informe o nome da pessoa: ");
            nome = leitor.next();
            
            System.out.println("Informe o sexo. M - Mulher, H - Homem");
            sexo = leitor.next().charAt(0);
            
            
        
            quantidadeRepeticoes--;
        }
        
    }
}
