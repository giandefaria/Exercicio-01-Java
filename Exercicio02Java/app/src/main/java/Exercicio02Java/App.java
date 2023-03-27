//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos
package Exercicio02Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        float primeiroNumero = 0f;
        float segundoNumero = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        primeiroNumero = leitor.nextInt();
        
        System.out.println("Digite o segundo número");
        segundoNumero = leitor.nextInt();
        
        System.out.println("A soma entre os dois números é: " + (primeiroNumero + segundoNumero));
        System.out.println("A subração entre os dois números é: " + (primeiroNumero - segundoNumero));
        System.out.println("A multiplicação entre os dois números é: " + (primeiroNumero * segundoNumero));
        System.out.println("A divisão entre os dois números é: " + (primeiroNumero / segundoNumero));
    }
}
