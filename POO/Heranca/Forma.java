package POO.Heranca;

public class Forma {
    public void calcularArea() {
        System.out.println("Cálculo genérico de área.");
    }

    static class Quadrado extends Forma {
        int lado;

        @Override
        public void calcularArea() {
            System.out.println("Área do quadrado: " + (lado * lado));
        }
    }

    static class Circulo extends Forma {
        int raio;

        @Override
        public void calcularArea() {
            System.out.println("Área do círculo: " + (3.14 * raio * raio));
        }
    }

    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        quad.lado = 5;
        quad.calcularArea(); 

        Circulo circ = new Circulo();
        circ.raio = 3;
        circ.calcularArea(); 
    }
}
