package POO.Polimorfismo;

public class Veiculos {
    public void mover(){
        System.out.println("Veículo se movendo");
    }


    static class Moto extends Veiculos{
        public void mover(){
            System.out.println("Moto acelerando");
        }
    }



    static class Carro extends Veiculos{
        public void mover(){
            System.out.println("O carro está acelerando");
        }
    }

    public static void main(String[] args) {
        Carro v1;
        Moto v2;


        v1 = new Carro();
        v2 = new Moto();


        v1.mover();
        v2.mover();
    }
}
