/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com ousuário;
 */
package Exercicio08Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        float valorEmDolar = 0f;
        float cotacaoDoDolar = 0f;
        float conversaoEmReal = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a cotação do dólar: ");
        cotacaoDoDolar = leitor.nextFloat();
        
        System.out.println("Informe o valor em dólar: ");
        valorEmDolar = leitor.nextFloat();
        
        conversaoEmReal = valorEmDolar * cotacaoDoDolar;
        System.out.println("O valor da conversão para real é de: R$" + conversaoEmReal);
        
    }
}
