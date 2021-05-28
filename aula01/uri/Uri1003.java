package uri;

import java.util.Scanner;

/**
 * Somasimples
 */
public class Uri1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NumA, NumB;

        //System.out.println("Digite dois números inteiros:");

        NumA = entrada.nextInt();
        NumB = entrada.nextInt();

        System.out.println("SOMA = " + (NumA + NumB));

        entrada.close();
    }
}