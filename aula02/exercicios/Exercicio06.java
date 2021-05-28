package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o valor de comprimento de cada lado de um triangulo:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Valores informados não formam um triangulo");
        } else {
            if (a == b && b == c) {
                System.out.println("Valores informados formam um triangulo equilátero");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Valores informados formam um triangulo isósceles");
                } else{
                    System.out.println("Valores informados formam um triangulo escaleno");
                }
            }
        }
        entrada.close();
    }
}