package exercicios.exercicio05;

public class Ebook {
    //atributos
    private int totalPaginas, paginaAtual;
    private String titulo, autor;

    //construtor
    public Ebook(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        //this.totalPaginas = totalPaginas;
        setTotalPaginas(totalPaginas);
        paginaAtual = 0;
    }

    public void avancarPagina(){
        if (paginaAtual < totalPaginas){
            paginaAtual++;
        }
    }

    public void retrocederPagina(){
        if (paginaAtual > totalPaginas){
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina){
        if (pagina>=0 && pagina<=totalPaginas) {
            paginaAtual=pagina;
        }
    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public void exibirCapa(){
        System.out.printf("Livro: %s - %s (%d)\n", titulo, autor, totalPaginas);
    }

    public void setTotalPaginas(int ntotalPaginas){
        if (ntotalPaginas > 0) {
            totalPaginas = ntotalPaginas;
        }
    }

    public int getTotalPaginas(){
        return totalPaginas;
    }


}
