public class Pessoa {

    private String nome;
    private int idade;




    public Pessoa(String nome , int idade){
        this.nome = nome;
        setIdade(idade);
    }


    public void setIdade(int idade){
        if (idade >=0) {
            this.idade = idade;
        }else{
            System.out.println("Idade inválida");
        }
    }


    public int getIdade(){
        return this.idade;
    }


    public void exibir(){
        System.out.println("Nome:"+ nome + "| Idade:" + idade);
    }

    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    Pessoa p = new Pessoa("Pedro", 90);
    p.exibir();
    p.setIdade(-5);
    System.out.println("idade atual:" + p.getIdade());
    



    }
}
