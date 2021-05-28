package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe seu salário:");
        salario=entrada.nextDouble();

        if (salario<=600) {
            System.out.println("Desconto INSS: Isento");            
        } else{
            if (salario<=1200) {
                System.out.println("Desconto INSS: 20%");                
            } else{
                if(salario<=2000){
                    System.out.println("Desconto INSS: 25%");                
                } else{
                    System.out.println("Desconto INSS: 30%");                
                }
            }
        }

        entrada.close();
    }
    
}
