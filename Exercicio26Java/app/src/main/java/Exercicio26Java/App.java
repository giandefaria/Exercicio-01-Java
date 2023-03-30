/*
Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
 */
package Exercicio26Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Informe um número entre 1 a 5");
            numero = leitor.nextInt();
            
            if (numero == 1) {
                System.out.println("Número um");
            } else if(numero == 2) {
                System.out.println("Número dois");
            } else if(numero == 3) {
                System.out.println("Número três");
            } else if(numero == 4) {
                System.out.println("Número quatro");
            } else if (numero == 5) {
                System.out.println("Número cinco");
            } else {
                System.out.println("Número inválido");
            }
        }
    }
}
