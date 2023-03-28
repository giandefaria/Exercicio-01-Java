/*
Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package Exercicio15Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            
            System.out.println("O número informado está no intervalo entre 100 e 200");   
        } else {
            System.out.println("O número informado não está no intervalo entre 100 e 200");
        }
    }
}
