/*
Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */
package Exercicio24Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numero;
        int numeroRepeticao = 5;
        
        Scanner leitor = new Scanner(System.in);
        
        for (; numeroRepeticao > 0; numeroRepeticao-- ) {
        
            System.out.println("Informe um número:");
            numero = leitor.nextInt();
            
            if (numero < 0) {
                System.out.println("O número informado é negativo");
            } else if (numero == 0) {
                System.out.println("O número informado é igual a zero");
            } else {
                System.out.println("O número é positivo");
            }
        
        }
        
    }
}
