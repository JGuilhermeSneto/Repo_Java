package POO.Polimorfismo;

public class Formas_diferentes {
    double lado;
    double base;
    double altura;

    public double Area(double lado){
        return lado * lado;
    }
    public double Area(double base , double altura){
        return base * altura / 2;
    }



    public static void main(String[] args) {
        Formas_diferentes f;
        double quadrado;
        double triangulo;


        f = new Formas_diferentes();
        quadrado = f.Area(4.0);
        triangulo = f.Area(4.0 , 6.0);

        System.out.println("Área do quadrado" + quadrado);
        System.out.println("Área do tringulo" + triangulo);

    }
}
