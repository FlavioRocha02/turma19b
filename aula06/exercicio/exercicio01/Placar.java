package exercicio.exercicio01;

public class Placar {
    private String time1, time2;
    private int gol1, gol2;

    //Construtores
    public Placar(){
        //time1="Local";
        //time2="Visitante";
        //            ou
        this("Local", 0, "Visitante", 0);
}

    public Placar(String time1, String time2){
        //this.time1 = time1;
        //this.time2 = time2;
        //      ou
        this.(time1, 0, time2, 0);
    }

    public Placar(String time1, int gol1, String time2, int gol2){
        this.time1=time1;
        this.gol1=gol1;
        this.time2=time2;
        this.gol2=gol2;

    }


    public String getPlacar(){
        return time1 + " " + gol1 + " x " + gol2 + " " + time2;
    }

}
