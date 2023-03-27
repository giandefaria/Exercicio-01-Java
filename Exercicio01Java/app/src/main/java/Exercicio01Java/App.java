package Exercicio01Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int primeiroNumero = 0;
        int segundoNumero = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        primeiroNumero = leitor.nextInt();
        
        System.out.println("Digite o segundo número");
        segundoNumero = leitor.nextInt();
        
        System.out.println("O resultado da soma dos dois número é: " +
                (primeiroNumero + segundoNumero));
    }
}
