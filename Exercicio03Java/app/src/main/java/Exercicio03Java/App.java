/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto;
*/
package Exercicio03Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float distanciaPercorridaCarro = 0f;
        float combustivelGasto = 0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida pelo carro:");
        distanciaPercorridaCarro = leitor.nextFloat();
        
        System.out.println("Digite a quantidade de combustivel gasto:");
        combustivelGasto = leitor.nextFloat();
        
        System.out.println("O consumo médio do veículo é de: " + 
                (distanciaPercorridaCarro / combustivelGasto) + "km por litro");
        
    }
}
