/*
Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);
 */
package Exercicio17Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        int numero;
        int repeticoes = 5;
        int quantidadeNumeroNoIntervalo = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while (repeticoes > 0) {
            
            System.out.println("Informe um número:");
            numero = leitor.nextInt();
            
            if (numero >= 10 && numero <= 150){
                quantidadeNumeroNoIntervalo++;
            }
        
            repeticoes--;
        }
        
    }
}
