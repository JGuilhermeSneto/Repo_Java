package POO.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
    ArrayList<String> tarefas = new ArrayList<>();
    int opcao;
    Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------Menu Lista----------");
            System.out.println("1 - Adicionar tarefa(add)");
            System.out.println("2 - Mostrar tarefa por posição(get)");
            System.out.println("3 - Remover tarefa(remove)");
            System.out.println("4 - Verificar se existe tarefas(contains)");
            System.out.println("5 - Quantidade de tarefas(size)");
            System.out.println("6 - Listar todas as tarefas");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código:");
                    String novaTarefa = sc.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                break;

                case 2:
                    System.out.println("Digite a posição da tarefa:");
                    int posicao = sc.nextInt();
                    if (posicao >= 1 && posicao <= tarefas.size()) {
                        System.out.println("Tarefa na posição " + posicao + ": " + tarefas.size()); 
                    }else{
                        System.out.println("Posição inválida!");
                    }
                break;

                case 3:
                    System.out.println("Digite a posição da tarefa a remover: ");
                    int posRemover = sc.nextInt();
                    sc.nextLine();
                    if (posRemover >= 1 && posRemover <= tarefas.size()) {
                        tarefas.remove(posRemover - 1);
                        System.out.println("Tarefa removida");
                    }else{
                        System.out.println("Posição inválida!");
                    }
                break;
                
                
                case 4:
                    System.out.println("Digite a tarefa para verificar: ");
                    String nomeTarefa = sc.nextLine();
                    if (tarefas.contains(nomeTarefa)) {
                        System.out.println("A tarefa existe na lista!");
                    }else{
                        System.out.println("A tarefa não foi encontrada");
                    }
                break;
                
                case 5:
                    System.out.println("Total de tarefas: " + tarefas.size());
                break;

                case 6:
                    System.out.println("-----Todas as tarefas ------");
                    for(int i = 0; i < tarefas.size(); i++){
                        System.out.println((i + 1) + " - " + tarefas.get(i));
                    }
                break;    


                case 0:
                    System.out.println("Saindo do menu");
                break;    

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

}

