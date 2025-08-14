package Exercicios_de_Logica;
public class SelectionShort {
    public static void main(String[] args) {
        int[] vetor = {3,4,7,2,5,8,1,9};

        for(int i = 0; i < vetor.length; i++){
            int indicemenor = i;
            
            for(int j=i;j < vetor.length; j++){
                if(vetor[j] < vetor[indicemenor]){
                    indicemenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[indicemenor];
            vetor[indicemenor] = temp;    


            System.out.println("Vetor ordenado:");
            for(int num : vetor){
                System.out.println(num + " ");
            }



        }
    }
}
