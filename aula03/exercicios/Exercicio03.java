package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont;

        System.out.println("Entre com o limite:");
        limite = entrada.nextInt();

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont + " ");
            cont = cont * 2;
            //cont *= 2;
            
            if (cont<=limite) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }
        entrada.close();
    }
}
