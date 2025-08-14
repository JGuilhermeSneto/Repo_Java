package POO.Heranca;

public class Pdf_Word {
    String nome;

    public void abrir() {
        System.out.println("Abrindo documento");
    }

    static class Pdf extends Pdf_Word {
        public Pdf(String nome) {
            this.nome = nome;
        }

        @Override
        public void abrir() {
            System.out.println("Abrindo PDF: " + nome);
        }
    }

    static class Word extends Pdf_Word {
        public Word(String nome) {
            this.nome = nome;
        }

        @Override
        public void abrir() {
            System.out.println("Abrindo Word: " + nome);
        }
    }

    public static void main(String[] args) {
        Pdf pdf = new Pdf("Relatorio.pdf");
        pdf.abrir(); 

        Word word = new Word("Doc.doc");
        word.abrir(); 
    }
}
