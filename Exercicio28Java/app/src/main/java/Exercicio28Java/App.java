/*
Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;
 */
package Exercicio28Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        String nome;
        float salarioFuncionario;
        float salarioMinimo = 1300f;
        float valorReajuste = 0f;
        float valorNovoSalario;
        
        char desejaContinuar = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            
            System.out.println("Informe o nome do funcionário:");
            nome = leitor.next();
            
            System.out.println("Informe o salário do funcionário:");
            salarioFuncionario = leitor.nextFloat();
            
            if(salarioFuncionario <= (salarioMinimo * 3)) {
                valorReajuste = salarioFuncionario * 0.50f; //reajuste 50%
            } else if (salarioFuncionario > (salarioMinimo * 3) && salarioFuncionario <= (salarioMinimo * 10)) {
                valorReajuste = salarioFuncionario * 0.20f; //reajuste 20%
            } else if (salarioFuncionario > (salarioMinimo * 10) && salarioFuncionario <= (salarioMinimo * 20)) {
                valorReajuste = salarioFuncionario * 0.15f;
            } else {
                valorReajuste = salarioFuncionario * 0.10f;
            }
            
            valorNovoSalario = salarioFuncionario + valorReajuste;
            
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Salario atual: R$ " + salarioFuncionario);
            System.out.println("Valor do reajuste: R$ " + valorReajuste);
            System.out.println("Novo salário: R$ " + valorNovoSalario);
        
            System.out.println("Deseja continuar? S - Sim, N - Nao");
            desejaContinuar = leitor.next().charAt(0);
        }
        
    }
}
