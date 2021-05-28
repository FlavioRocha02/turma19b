package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, cont;
        
        soma=0;
        numero=1;
        cont = 1;
        while (numero != 0) {
            System.out.printf("Digite o %dº número: ", cont);
            numero = entrada.nextInt();
            soma = soma + numero;
            cont++;
            }
        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
}
