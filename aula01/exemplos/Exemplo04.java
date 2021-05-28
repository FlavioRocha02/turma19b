package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, dobro;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt(); //Lendo um numero inteiro do teclado e guardando na variável 'numero'
        dobro = numero * 2;

        System.out.println("Você digitou " + numero);
        System.out.println("O dobro é " + dobro);

        entrada.close();
    }
}
