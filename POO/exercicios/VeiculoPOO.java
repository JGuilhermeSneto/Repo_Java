package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class VeiculoPOO {
    private String modelo;


    public VeiculoPOO(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }


    public void mover(){
        System.out.println(getModelo()+ "Está se movendo");
    }


    static class Carro extends VeiculoPOO{

        public Carro(String modelo){
            super(modelo);
        }
    }

    static class Aviao extends VeiculoPOO {
        public Aviao(String modelo){
            super(modelo);
        }
        
        public void mover(){
            System.out.println(getModelo()+ "Se move");
        }
    }



    public static void main(String[] args) {
        List<VeiculoPOO> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Fiat"));
        veiculos.add(new Aviao("Boing"));

        for (VeiculoPOO veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                ((Carro) veiculo).mover();
            }else if(veiculo instanceof Aviao){
                ((Aviao) veiculo).mover();
            }
        }
    }
}
