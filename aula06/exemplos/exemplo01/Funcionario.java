package exemplos.exemplo01;

public class Funcionario {
    //protected String nome;
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome){
        this.nome = nome;
        this.salario = 0;
    }

    //Overload - polimorfismo
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String imprimir(){
        return nome + " : " + salario;
    }

    public void aumentarSalario(double perc){
        salario = salario + salario * perc;
    }

}
