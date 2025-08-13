package POO.Heranca;

public class Veiculo {
    String marca;
    String modelo;


    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes(){
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo:" + this.modelo);
    }



    static class Carro extends Veiculo{
        int numeroDePortas;

        public Carro(String marca, String modelo , int numeroDePortas){
            super(marca, modelo);
            this.numeroDePortas = numeroDePortas;
        }


        public void exibirInformacoes(){
            super.exibirInformacoes();
            System.out.println("Número de portas:" + this.numeroDePortas);
        }
        
    }



    static class Moto extends Veiculo{
        int cilindrada;


        public Moto(String marca, String modelo, int cilindrada){
            super(marca, modelo);
            this.cilindrada = cilindrada;
        }

        public void exibirInformacoes(){
            super.exibirInformacoes();
            System.out.println("Cílindrada:" + this.cilindrada);
        }
    }


    public static void main(String[] args) {
        Carro meuCarrinho = new Carro("Fiat", "Ka", 2);
        Moto minhaMoto = new Moto("Yamaha", "Factor", 150);



        System.out.println("----Informações do seu carro");
        meuCarrinho.exibirInformacoes();
        System.out.println("Informações da sua moto");
        minhaMoto.exibirInformacoes();
    }






































}
