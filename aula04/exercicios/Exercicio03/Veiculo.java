package exercicios.Exercicio03;

public class Veiculo {
    // atributos
    private String marca, modelo;
    private double consumo;

    // métodos
    // construtor
    public Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }
    
    public void exibirdados(){
        //System.out.printf("Marca: %s Modelo: %s\n", marca, modelo);
        System.out.println("A marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
    }

    public double getConsumo(){  //obterConsumo(){
        return consumo;
    }

    public void setConsumo(double novoConsumo){  //{alterarConsumo(double novoConsumo){
        if(novoConsumo > 0){
            consumo = novoConsumo;    
        }
    }


}

