package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde;
        double valor, total;

        qtde = entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        total = valor * qtde;

        qtde = entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        total = total + (valor * qtde);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        entrada.close();
    }
    
}
