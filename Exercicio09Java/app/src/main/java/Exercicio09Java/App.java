/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m
 */
package Exercicio09Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        float valorDepositado;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor depositado: ");
        valorDepositado = leitor.nextFloat();
        
        System.out.println("O valor depositado, após um mes, com rendimento de 0,07% a.m., será de R$ " + (valorDepositado * 0.07 / 100));
        
    }
}
