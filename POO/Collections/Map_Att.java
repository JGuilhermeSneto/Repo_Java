package POO.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Att {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> alunos = new HashMap<>();
        int opcao = 0;

        do {
            System.out.println("-----Menu map-----");
            System.out.println("1 - Adicionar/Atualizar aluno(put)");
            System.out.println("2 - Buscar nota do aluno (get)");
            System.out.println("3 - Remover aluno (remove)");
            System.out.println("4 - Verificar se o aluno existe(contains)");
            System.out.println("5 - Total de alunos(size)");
            System.out.println("6 - Listar todos os alunos (keyset + values)");
            System.out.println("7 - Limpar todos os registros(clear)");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a nota do Aluno: ");
                    double nota = sc.nextDouble();
                    alunos.put(nome, nota);
                    System.out.println("Cadastro/Atualização concluída!");

                    break;

                case 2:
                    System.out.println("Digite o nome do aluno para buscar: ");
                    String nomeBusca= sc.nextLine();
                    if (alunos.containsKey(nomeBusca)) {
                        System.out.println("A nota do aluno " + nomeBusca + ": " +alunos.get(nomeBusca));
                    }else{
                        System.out.println("Aluno não encontrado!");
                    }

                    break;

                case 3:
                    System.out.println("Digite o nome do aluno para remover: ");
                    String nomeDeletado = sc.nextLine();
                    if (alunos.remove(nomeDeletado) != null) {
                        System.out.println("Aluno inválido");
                    }else{
                        System.out.println("Aluno não encontrado");
                    }

                    break;

                case 4:
                    System.out.println("Digite o nome do aluno:");
                    String nomeVerificar = sc.nextLine();
                    if (alunos.containsKey(nomeVerificar)) {
                        System.out.println("O aluno está cadastrado");
                    }else{
                        System.out.println("Aluno não existe");
                    }

                    break;

                case 5:
                    System.out.println("Total de alunos: " + alunos.size());

                    break;
                    
                case 6:
                    System.out.println("-------Lista de Alunos e Notas-----");
                    for (Map.Entry<String, Double> entry : alunos.entrySet()) {
                        System.out.println(entry.getKey()+ " - notas" +entry.getValue());
                    }   
                    
                    break;

                case 7:
                    alunos.clear();
                    System.out.println("Todos os registros foram deletados!");
                    
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        
        sc.close();
    }
 
    
    
}
