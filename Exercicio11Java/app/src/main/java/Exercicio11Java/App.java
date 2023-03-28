/*
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário
 */
package Exercicio11Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        float precoDeCusto;
        float percentualLucro;
        float valorParaVenda;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo do produto: ");
        precoDeCusto = leitor.nextFloat();
        
        System.out.println("Informe o percentual de lucro que deseja obter");
        percentualLucro = leitor.nextFloat();
        
        valorParaVenda = precoDeCusto + (precoDeCusto * percentualLucro / 100);
        
        System.out.println("O valor para venda do produto será de: R$ " + valorParaVenda);
    }
}
