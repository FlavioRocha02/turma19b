package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, notamd;

        System.out.println("Favor informar sua primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Favor informar sua segunda nota:");
        nota2 = entrada.nextDouble();

        notamd = nota1 * 0.4 + nota2 * 0.6;

        if (notamd>=6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        System.out.printf("Sua média foi de %.1f", notamd);
        entrada.close();
    }
}
