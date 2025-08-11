public class Retangulo {

    private double largura;
    private double altura;


    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }


    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }




    public static void main(String[] args) {
        
    Retangulo r = new Retangulo(5, 3);

    System.out.println("Área:" + r.calcularArea()+ "\n");
    System.out.println("Perimetros:" + r.calcularPerimetro()+ "\n");    

    }
}
