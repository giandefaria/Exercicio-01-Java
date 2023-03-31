/*
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package Exercicio30Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaRepetir == 's' || desejaRepetir == 'S') {
        
        
        
            System.out.println("Deseja continuar? S - Sim, N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }
        
    }
}
