package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares = 0;
        final int TOTAL_NUMEROS = 10; // variável do tipo constante, não é permitida a alteração de valor

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();
            if (numero % 2 <= 0) {
                pares++;
            }
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + (TOTAL_NUMEROS - pares));
        entrada.close();
    }

}
