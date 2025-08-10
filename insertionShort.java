public class insertionShort {
    public static void main(String[] args) {
        int[] vetor = {4,2,7,1,3};


        for(int i = 0; i < vetor.length; i++){
            int chave = vetor[i];
            int j = i - 1;


            while(j >= 0 && vetor[j] > chave){
                vetor[j + 1] = vetor[j];
                j--; 
            }
            vetor[j + 1] = chave;



            System.out.println("Vetor ordenado:");
            for(int num : vetor){
                System.out.println(num + "");

            }

        }   

    }
}
