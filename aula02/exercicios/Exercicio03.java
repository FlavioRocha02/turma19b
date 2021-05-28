package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dNum1, dNum2;

        System.out.println("Digite dois numeros de ponto flutuante");
        dNum1=entrada.nextDouble();
        dNum2=entrada.nextDouble();

        if (dNum1>=dNum2) {
            System.out.printf("%.2f , %.2f\n",dNum1,dNum2);
        } else {
            System.out.printf("%.2f , %.2f\n",dNum2,dNum1);
        }

        entrada.close();
    }
    
}
