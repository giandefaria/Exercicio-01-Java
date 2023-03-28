/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package Exercicio10Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float valorProduto;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        valorProduto = leitor.nextFloat();
        
        System.out.println("Preço do produto: R$ " + valorProduto);
        System.out.println("Valor das prestações em 5 vezes sem juros: R$ " + (valorProduto / 5));
       
        
    }
}
