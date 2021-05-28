package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook eb = new Ebook("Narnia", "C.S.L",300);

        eb.exibirCapa();
        System.out.println("Pagina atual: " + eb.exibirPagina());
        eb.retrocederPagina();
        eb.avancarPagina();
        eb.retrocederPagina();
        eb.retrocederPagina();
        System.out.println("Pagina atual: " + eb.exibirPagina());
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        eb.avancarPagina();
        System.out.println("Pagina atual: " + eb.exibirPagina());
    }
}
