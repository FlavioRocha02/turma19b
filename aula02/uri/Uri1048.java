package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, reajuste;
        
        //System.out.println("Entre com o salário:");
        salario = entrada.nextDouble();

        if (salario <= 400) {
            reajuste = 0.15;
        } else{
            if(salario >=800){
                reajuste = 0.12;
            } else{
                if (salario<=1200) {
                    reajuste = 0.1;
                } else{
                    if(salario<=2000){
                        reajuste = 0.07;
                    }else{
                        reajuste = 0.04;
                    }
                }
            }
        }
        System.out.printf("Novo salario: %.2f\n", salario * ( 1 + reajuste));
        System.out.printf("Reajuste ganho: %.2f\n", salario * reajuste);
        System.out.printf("Em percentual: %.0f %%\n", reajuste * 100);
        entrada.close();
    }
}
