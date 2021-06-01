package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Flavio",1000);
        Funcionario f2 = new Funcionario("Rocha");
        Gerente g = new Gerente("Arnaldo", 1000, 10);

        f.aumentarSalario(0.1);
        f2.aumentarSalario(0.1);
        g.aumentarSalario(0.1);

        System.out.println(f.imprimir());
        System.out.println(g.imprimir());
        System.out.println(f2.imprimir());


    }
}
