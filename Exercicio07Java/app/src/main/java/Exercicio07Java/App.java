/*
 Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 */
package Exercicio07Java;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        int temperaturaCelsius;
        int temperaturaFahrenheit
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus Celsius");
        temperaturaCelsius = leitor.nextInt();
        
        temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        System.out.println("A temperatura convertida em Fahrenheit é de: "
                + temperaturaFahrenheit);
    }
}
