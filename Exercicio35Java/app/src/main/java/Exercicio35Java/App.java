/*
Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29
 */
package Exercicio35Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float quantidadeKW;
        float valorContaLuz;    
        char tipoImovel;
        char desejaContinuar = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            
            System.out.println("Informe a quantidade de KW/h consumido:");
            quantidadeKW = leitor.nextFloat();
            
            System.out.println("Informe o tipo de imóvel. R - Residencia, C - Comercio, I - Industria");
            tipoImovel = leitor.next().charAt(0);
            
            if (tipoImovel == 'r' || tipoImovel == 'R') {
                valorContaLuz = quantidadeKW * 0.60f;
            }
            
            
            
                    
            System.out.println("Deseja continuar? S - Sim, N - Nao");
            desejaContinuar = leitor.next().charAt(0);
        }
        
    }
}
