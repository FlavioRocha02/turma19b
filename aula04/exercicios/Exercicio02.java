package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O menor número é: " + Menor_Num(81, 12, 2));

        entrada.close();
    }
    
    static int Menor_Num(int n1, int n2, int n3){
        int valor;
        if (n1 < n2 && n1 <n3) {
            valor = n1;
        } else{
           if (n2 < n1 && n2 <n3) {
               valor = n2;
           } else{
               valor = n3;
           }
        }
        return valor;
    }
}
