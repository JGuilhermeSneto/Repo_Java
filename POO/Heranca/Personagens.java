package POO.Heranca;

public class Personagens {

    String nome;
    double vida;
    double poderAtaque;



    public Personagens(String nome, double vida, double poderAtaque) {
        this.nome = nome;
        this.vida = vida;
        this.poderAtaque = poderAtaque;
    }


    public double atacar(){
        return this.poderAtaque;
    }


    static class Guerreiro extends Personagens{

        double escudo;

        public Guerreiro(String nome, double vida, double poderAtaque, double escudo) {
            super(nome,vida,poderAtaque);
            this.escudo = escudo;
        }




        public double atacar(){
            return super.poderAtaque + this.escudo;
        }
    }


    static class Mago extends Personagens{
        double mana;

        public Mago(String nome, double vida, double poderAtaque, double mana) {
            super(nome, vida, poderAtaque);
            this.mana = mana;
        }


        public void Mago(String nome, double vida, double poderAtaque, double mana){

        }


        public double atacar(){
            return super.poderAtaque + this.mana;
        }

    }

    public static void main(String[] args) {
        Guerreiro mGuerreiro = new Guerreiro("Zeka" , 100.0, 20.0, 1000.9);
        Mago mMago = new Mago("Zekacius", 100.0 , 20.9, 20000.8);



        System.out.println("Dano do Guerreiro foi:" + mGuerreiro.atacar());
        System.out.println("Dano do meu mago foi:"+ mMago.atacar());
    }
}
