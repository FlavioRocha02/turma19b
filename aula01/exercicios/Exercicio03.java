package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite seu salário: ");
        salario = entrada.nextDouble();
        //salario = salario + (salario * 0.25);
        salario = salario * 1.25;

        System.out.println("Seu novo salário será de " + salario);
        entrada.close();
    }
}
