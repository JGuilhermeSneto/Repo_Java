package POO.Polimorfismo;

public class Pagamento {
    public void Processar(){
        System.out.println("Processando pagamenro genérico");
    }


    static class pagCartao extends Pagamento{
        public void Processar(){
            System.out.println("Processando pagamento com cartão");
        }
    }



    static class pagBoleto extends  Pagamento{
        public void Processar(){
            System.out.println("Processando pagamento com boleto");
        }
    }



    public static void main(String[] args) {
        pagCartao pagcartao = new pagCartao();
        pagBoleto pagboleto = new pagBoleto();

        pagcartao.Processar();
        pagboleto.Processar();
    }



}
