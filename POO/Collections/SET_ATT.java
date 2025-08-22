package POO.Collections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class SET_ATT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> codigos = new HashSet<>();
        int opcao;

        do {
            System.out.println("--------Menu Set");
            System.out.println("1 - Adicionar código(add)");
            System.out.println("2 - Remover código (remove)");
            System.out.println("3 - Verificar código(contains)");
            System.out.println("4 - Quantidade de códigos(size)");
            System.out.println("5 - Listar todos os códigos");
            System.out.println("6 - Limpar conjunto(clear)");
            System.out.println("0 - Sair ");
            System.out.println("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código: ");
                    int cod = sc.nextInt();
                    if (codigos.add(cod)) {
                        System.out.println("Código adicionado");
                    }else{
                        System.out.println("Código já existe, não pode duplicar");
                    }

                break;

                case 2:
                    System.out.println("Digite o código para remover: ");
                    int cods = sc.nextInt();
                    if(codigos.add(cods)){
                        System.out.println("Código removido!");
                    }else{
                        System.out.println("Código não encontrado");
                    }
                break;

                case 3:
                    System.out.println("Digite o código para verificar: ");
                    int codigo = sc.nextInt();
                    if (codigos.contains(codigo)) {
                        System.out.println("Código existe");
                    }else{
                        System.out.println("Código não existe");
                    }

                break;
                
                case 4:
                    System.out.println("Total de códigos únicos: " + codigos.size());
                break;
                
                case 5:
                    System.out.println("-----Códigos cadastrados");
                    for (int c : codigos) {
                        System.out.println("c");                        
                    }

                break;
                
                case 6:
                    codigos.clear();
                    System.out.println("Conjunto limpo!");

                break;
                
                case 0:
                    System.out.println("Saindo do menu...");
                break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }
            
        } while (opcao != 0);
        sc.close();
    }
}
