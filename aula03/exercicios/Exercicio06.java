package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, somapares = 0, impares = 0;

        final int TOTAL_NUMEROS = 10; // variável do tipo constante, não é permitida a alteração de valor

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                somapares = somapares + numero;
            } else{
                impares++;
            }
        }
        
        System.out.println("A média dos valores pares é: " + (somapares/(TOTAL_NUMEROS - impares)));
        System.out.printf("A porcentagem de numeros impares é: %.2f", ((double)impares / TOTAL_NUMEROS) * 100);
        System.out.println("%");
        System.out.printf("O %% de numeros impares é de: %.2f%% ", ((double)impares / TOTAL_NUMEROS) * 100);
        
        entrada.close();
        
    }
    
}
