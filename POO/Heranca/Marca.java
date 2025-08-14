package POO.Heranca;

public class Marca {
    String marca;

    public String Ligar(String marca){
        System.out.println("ligando o celular da marca"+ marca);
        return this.marca;
    }


    static class Celular extends Marca{
        public String Ligar(String marca){
            this.marca = marca;
            return this.marca;

        }
    }


    static class Notebook extends Marca{
        public Notebook(String marca) {
            this.marca = marca;
            return;
        }

        public void ligar(String marca){
            System.out.println("ligando notebook da marca" + marca);

        }
    }


    public static void main(String[] args) {
        Notebook note = new Notebook("Dell");
        note.marca = "dell";
        note.ligar("DELL");
    }









}
