/*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
trocados;
 */
package Exercicio06Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int variavelA;
        int variavelB;
        int variavelAuxiliar;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor da variável A:");
        variavelA = leitor.nextInt();
        
        System.out.println("Informe o valor da variável B:");
        variavelB = leitor.nextInt();
        
        System.out.println("Variavel A vale: " + variavelA);
        System.out.println("Variavel B vale: " + variavelB);
        
        variavelAuxiliar = variavelA; //variavel auxiliar guardará valor original de A
        variavelA = variavelB;
        variavelB = variavelAuxiliar;
        
        System.out.println("A variável A com o valor trocado será de: " + variavelA);
        System.out.println("A variável B com o valor trocado será de: " +variavelB);
        
        
    }
}
