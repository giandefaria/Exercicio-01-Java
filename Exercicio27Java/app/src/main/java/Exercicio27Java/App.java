/*
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes
 */
package Exercicio27Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        float valorVeiculo;
        float valorDesconto = 0f;
        float valorFinalPagoCliente = 0f;
        char combustivel;
        char desejaContinuar = 's';
        
        float totalDesconto = 0f;
        float totalPagoClientes = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe o valor do carro:");
            valorVeiculo = leitor.nextInt();
            
            System.out.println("Informe o combustível do veículo. A - Alcool, G - gasolina, d - diesel");
            combustivel = leitor.next().charAt(0);
            
            if(combustivel == 'a' || combustivel == 'A') {
                valorDesconto = valorVeiculo + (valorVeiculo * 0.25f);
                valorFinalPagoCliente = valorVeiculo - valorDesconto;
                System.out.println("Valor final a ser pago pelo cliente é de R$ " + valorFinalPagoCliente);
            
            }
            
            totalDesconto =+ valorDesconto; 
            totalPagoClientes =+ valorFinalPagoCliente;
        
            System.out.println("Deseja continuar? S - Sim, N - Não");
            desejaContinuar = leitor.next().charAt(0);
        }
        
    }
}
