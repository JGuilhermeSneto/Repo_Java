public class Calculadora {

    public double somar(double a, double b){
        return a + b;
    }

    public double dividir(double a, double b){
        if( b != 0){
            return a / b;
        }else{
            System.out.println("Erro: divisão por zero!\n" );
            return 0;
        }
        
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma:" + calc.somar(10 , 5) + "\n");
        System.out.println("Divisão:"+calc.dividir(10, 0)+ "\n");
    }
}
