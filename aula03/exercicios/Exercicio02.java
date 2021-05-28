package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada, multiplicador, resultado;
        
        multiplicador=0;
        resultado=0;
        System.out.println("Entre com um numero: ");
        tabuada = entrada.nextInt();
        System.out.println("A tabuada do " + tabuada + " será exibida abaixo:");
        while (multiplicador<=10) {
            resultado = tabuada * multiplicador;
            //System.out.println(tabuada + " x " + multiplicador + " = " + resultado);
            System.out.printf("%d x %02d = %02d\n", tabuada, multiplicador, resultado);
            multiplicador++;
        }
        entrada.close();
    }
}
