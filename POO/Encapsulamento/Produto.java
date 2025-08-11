public class Produto {

    private String nome;
    private double preco;



    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }


    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido. \n");
        }
    }

    public double getPreco(){
        return preco;
    }


    public void exibir(){
        System.out.println("Produto" + nome + "| Preço:" + preco);
    }


    public static void main(String[] args) {
        Produto p = new Produto("Celular" , 1888.90);
        p.setPreco(-500);        
        p.exibir();
    }
}
