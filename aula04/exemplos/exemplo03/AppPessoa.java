package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Flavio", 12345);

        p.apresentar();
        System.out.println("Meu telefone é: " + p.obterTelefone());
    }
}
