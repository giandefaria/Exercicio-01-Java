/*
 A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
package Exercicio20Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float valorCarro;
        int anoCarro;
        float valorDesconto;
        int carrosAntesDoisMil = 0;
        int totalCarros = 0;
        char desejaContinuar = 'S';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            
            System.out.println("Informe o valor do carro:");
            valorCarro = leitor.nextFloat();
            
            System.out.println("Informe o ano do carro");
            anoCarro = leitor.nextInt();
            
            if (anoCarro <= 2000) {            
                valorDesconto = valorCarro * 0.12f; //desconto 12%
                carrosAntesDoisMil++;
            } else {
                valorDesconto = valorCarro * 0.07f; //desconto 7%
            }
            
            System.out.println("Valor do carro: R$ " + valorCarro);
            System.out.println("Ano do carro: " + anoCarro);
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Valor do carro com desconto: R$ "
                    + (valorCarro - valorDesconto));
            
            totalCarros++;
            
            System.out.println("Deseja continuar? S - sim, N - nao");
            desejaContinuar = leitor.next().charAt(0);
        }
        
    }
}
