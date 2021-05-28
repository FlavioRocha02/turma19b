package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont=1;
        while (cont <=10) {
            System.out.println(cont);
            cont++; //para somar 1  ||  é a mesma coisa que cont = cont + 1
            //cont--; //para subtrair 1
        }
        System.out.println("fim: "+cont);
    }
}