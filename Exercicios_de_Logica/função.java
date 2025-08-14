package Exercicios_de_Logica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class função {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = teclado.nextLine();

        int totalLetras = contarLetras(nome);
        int Maiusculas = contarMaiusculas(nome);
        String misturar = embaralhar(nome);
        
        

        System.out.println("Total de letras:" + totalLetras);
        System.out.println("Contar Maiusculas:" + Maiusculas);
        System.out.println("Nome embaralhado:" + misturar);

        teclado.close();
    }

    public static int contarLetras(String nome){
        return nome.length();
    }


    public static int contarMaiusculas(String nome){
        int contador = 0;
        for(int i = 0 ; i < nome.length(); i++){
            char letra = nome.charAt(i);
            if(Character.isUpperCase(letra)){
                contador++;
            }
        }
        return contador;
    }


    public static String embaralhar(String nome){
        List<Character> letras = new ArrayList<>();
        for(char letra : nome.toCharArray()){
            letras.add(letra);
        }
        Collections.shuffle(letras);
        StringBuilder nomeMisturado = new StringBuilder();
        for(char letra : letras){
            nomeMisturado.append(letra);
        }
        return nomeMisturado.toString();
    }

}