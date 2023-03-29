/*
Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a média de preço de custo e do preço de venda;
 */
package Exercicio22Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        float precoCusto = 0f;
        float precoVenda = 0f;
        float precoCustoTotal = 0f;
        float precoVendaTotal = 0f;
    
        Scanner leitor = new Scanner(System.in);
        
        int i = 1;
        
        for (; i <= 5; i++) {
            System.out.println("Informe o preço de custo:");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Informe o preço de venda:");
            precoVenda = leitor.nextFloat();
            
            precoCustoTotal = precoCusto + precoCusto;
            precoVendaTotal = precoVenda + precoVenda;
            
            System.out.println("O preço do produto é de R$ " + precoCusto + ", e foi vendido por R$" + precoVenda);
            
        }
        
        System.out.println("A media do preço de custo foi de R$ " + (precoCustoTotal / i));
        System.out.println("A media do preço de venda foi de R$ " + (precoVendaTotal / i));
        
    }
}
