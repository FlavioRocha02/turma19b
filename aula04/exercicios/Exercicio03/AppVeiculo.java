package exercicios.Exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("VW", "Nivus", 10.2);

        v.exibirdados();

        v.setConsumo(-2);

        System.out.println("O consumo é de " + v.getConsumo() + " Km/L");

    }
}
