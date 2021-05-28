package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio(16,4,1);
        r.setHora(25);
        r.setMinuto(61);
        r.setSegundo(61);
        System.out.println("Hora atual: " + r.horaAtual());
    }
}
