package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, ir;
        
        System.out.println("Entre com o salário:");
        salario = entrada.nextDouble();

        if (salario<=2000) {
            //System.out.println("Isento");
            ir = 0;
        } else {
            if (salario<=3000) {
                salario = salario - 2000;
                ir = salario * 0.08;
            } else {
                if (salario<=4500) {
                    ir = (1000 * 0.08) + ((salario - 3000) * 0.18);
                } else {
                    ir = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
                }
            }
        }
        
        if (ir==0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", ir);
        }
        entrada.close();
        
    }
    
}
