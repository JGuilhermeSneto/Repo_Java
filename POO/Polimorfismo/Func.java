package POO.Polimorfismo;

public class Func {
    public int calcularBonus(){
        return 100;
    }


    static class Gerente extends Func{
        public int calcularBonus(){
            return 500;
        }
    }

    static class Vendedor extends Func {
        public int calcularBonus(){
            return 300;
        }
        
    }


    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();

        System.out.println("O bônus do gerente é:" + g1.calcularBonus());
        System.out.println("O bônus do vendedor é:" + v1.calcularBonus());
    }

}
