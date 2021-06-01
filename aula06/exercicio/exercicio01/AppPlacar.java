package exercicio.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Palmeiras", "Santos");
        Placar p3 = new Placar("Palmeiras", 1, "Santos",0);

        System.out.println(p1.getPlacar());
        System.out.println(p2.getPlacar());
        System.out.println(p3.getPlacar());
    }

}
