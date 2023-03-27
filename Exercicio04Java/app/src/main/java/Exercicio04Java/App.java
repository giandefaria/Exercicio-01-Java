/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package Exercicio04Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        String nomeVendedor;
        float salarioFixo = 0f;
        float valorTotalVendasMes = 0f;
        float salarioFinalMes = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor:");
        nomeVendedor = leitor.nextLine();
        
        System.out.println("Qual o salário fixo do vendedor?");
        salarioFixo = leitor.nextFloat();
        
        System.out.println("Digite o valor total de vendas realizadas no mês pelo vendedor");
        valorTotalVendasMes = leitor.nextFloat();
        
        
        salarioFinalMes = salarioFixo + (valorTotalVendasMes * 0.15f);
    }
}
