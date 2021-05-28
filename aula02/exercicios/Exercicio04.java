package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Informe seu salário:");
        salario = entrada.nextDouble();

        System.out.println("Informe o valor da parcela do empréstimo:");
        prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.3) {
            System.out.println("Empréstimo concedido");
        } else{
            System.out.println("Empréstimo negado!, Valor da parcela é superior a 30% de sua renda");
        }

        entrada.close();
    }
    
}
