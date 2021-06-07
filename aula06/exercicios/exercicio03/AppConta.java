package exercicios.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        int numeroConta;
        double valor, limite;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        ArrayList<Conta> contas = new ArrayList<>();

        System.out.print("\033[H\033[2J"); // limpar a tela

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Saque");
            System.out.println("5-Depósito");
            System.out.println("6-Saldo");
            System.out.println("7-Sair");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite:");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    contas.add(ce);
                break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    contas.add(cp);
                break;
                case 4:
                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Qual o valor do depósito?");
                    valor = entrada.nextDouble();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroConta) {
                            if(conta.depositar(valor)){
                                System.out.println("Depósito realizado");
                            }else{
                                System.out.println("Falha na operação");
                            }
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroConta) {
                            System.out.println(conta);
                            break;
                        }
                    }

                    break;
                case 7:
                    break;
                default: // caso contrário
                    System.out.println("Opção inválida!");
            }

        } while (menu != 7);

        entrada.close();
    }
}
