/*
Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados

a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */
package Exercicio32Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int ladoA = 0;
        int ladoB = 0;
        int ladoC = 0;
        
        if ( ((ladoB - ladoC) < ladoA && ladoA < (ladoB + ladoC)) ||
             ((ladoA - ladoC) < ladoB && ladoB < (ladoA + ladoC)) ||
             ((ladoA - ladoB) < ladoC && ladoC < (ladoA + ladoB))   
            ) {
            
            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triangulo Equilatero");                
            }
        
        } else {
        
            System.out.println("Não é um triângulo");
        }
        
    }
}
