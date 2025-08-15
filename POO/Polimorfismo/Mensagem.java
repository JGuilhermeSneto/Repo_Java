 package POO.Polimorfismo;

class Mensagem {
    public void enviar(String destinatario){
        System.out.println("Enviando mensagem para o" + destinatario);
    }
    
    

    public void enviar(String destinatario, String conteudo){
        System.out.println("Enviando mensagem para" + destinatario + ":" + conteudo);
    }

    public static void main(String[] args) {
        Mensagem m;


        String nomeDesti1;
        String nomeDesti2;
        String textoMensagem;





        m = new Mensagem();
        nomeDesti1 = "Zeka";
        nomeDesti2 = "Zekas";
        textoMensagem = "Por favor, Fale com a gráfica";



        m.enviar(nomeDesti1);
        m.enviar(nomeDesti2, textoMensagem);


    }























}