package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int iNun;

        System.out.println("Favor digitar um numero inteiro.");
        iNun=entrada.nextInt();

        if (iNun>20) {
            //System.out.println("A metade do número digitado é " + iNun/2);
            System.out.printf("A metade do número digitado é %.1f\n", (double)iNun/2);  //conversão de tipos
        }
        System.out.println("Fim do programa.");
        entrada.close();
    }

}
