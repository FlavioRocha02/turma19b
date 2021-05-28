package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        boolean retorno;

        System.out.print("Digite um número: ");
        numero = entrada.nextDouble();
        retorno = ePar(numero);
        System.out.println("O número digitado é par? " + retorno);
        entrada.close();
    }

    static boolean ePar(Double valor) {
        // return valor % 2 ==0;
        if (valor % 2 == 0) {
            return true;
        }
        return false;
    }
}
