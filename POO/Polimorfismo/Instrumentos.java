package POO.Polimorfismo;

public class Instrumentos {
    public void tocar(){
        System.out.println("Tocando instrumento");
    }

    static class Violao extends Instrumentos{
        public void tocar(){
            System.out.println("Tocando violão");
        }
    }


    static class Piano extends Instrumentos{
        public void tocar(){
            System.out.println("Tocando piano");
        }
    }




    public static void main(String[] args) {
        Violao instrumento1;
        Piano instrumento2;

        instrumento1 = new Violao();
        instrumento2 = new Piano();

        instrumento1.tocar();
        instrumento2.tocar();

    }

}
