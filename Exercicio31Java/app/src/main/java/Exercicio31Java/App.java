/*
Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
 */
package Exercicio31Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        char operador;
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
        
            
            System.out.println("Deseja continuar? S - Sim, N - Nao");
            desejaRepetir = leitor.next().charAt(0);
        }
        
    }
}
