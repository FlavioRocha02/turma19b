package exercicios.exercicio04;

public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // métodos
    // construtor
    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int nhora){
        if (nhora >= 0 && nhora < 24) {
            hora = nhora;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int nminuto) {
        if (nminuto > 0 && nminuto <= 60) {
            minuto = nminuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int nsegundo) {
        if (nsegundo > 0 && nsegundo <= 60) {
            segundo = nsegundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }


    public String horaAtual() {
        return hora + ":" + minuto + ":" + segundo;
    }
    

}


