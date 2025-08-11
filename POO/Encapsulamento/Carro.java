public class Carro {
    private String modelo;
    private int velocidade;



    public  Carro(String modelo){
        this.modelo = modelo;
        this.velocidade  = 0;
        return;
    }

    
    public void acelerar(int km){
        if(km > 0){
            velocidade += km;
        }
    }

    public void frear(int km){
        velocidade -= velocidade;
        if(velocidade < 0){
            velocidade = 0;
        }
    }


    public void exibir(){
        System.out.println("Modelo:" + modelo + "| Velocidade:" + velocidade + "\n");
    }




    public static void main(String[] args) {

        Carro car = new Carro("Gol");
        car.acelerar(90);
        car.frear(50);
        car.exibir();
        
    }
}
