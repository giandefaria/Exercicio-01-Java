/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;
 */
package Exercicio12Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float precoCustoFabrica;
        float precoDistribuidor;
        float precoCustoConsumidor;
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo de fábrica do carro:");
        precoCustoFabrica = leitor.nextFloat();
        
        precoDistribuidor = precoCustoFabrica + (precoCustoFabrica * 45 / 100);
        
        precoCustoConsumidor = precoDistribuidor + (precoDistribuidor * 28 / 100);
        
        System.out.println("O preço final do carro ao consumidor será de R$ " + precoCustoConsumidor);
    }
}
