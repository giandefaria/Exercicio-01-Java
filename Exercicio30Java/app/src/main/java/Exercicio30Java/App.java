/*
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package Exercicio30Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        int c = 0;
        int aux;
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaRepetir == 's' || desejaRepetir == 'S') {
            
            System.out.println("Informe o valor de 'a'");
            a = leitor.nextInt();
            
            System.out.println("Informe o valor de 'b'");
            b = leitor.nextInt();
            
            System.out.println("Informe o valor de 'c'");
            c = leitor.nextInt();        
            
            if(a > c) {
                aux = c;
                c = a;
                a = aux;         
            }
            if (b > c) {
                aux = c;
                c = b;
                b = aux;            
            }
            if (a > b) {
                aux = b;
                b = a;
                a = aux;
            }
            
            System.out.println("Numeros em o ordem crescente: " + a + " " + b + " " + c + " ");
            
            System.out.println("Deseja continuar? S - Sim, N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }
        
    }
}
