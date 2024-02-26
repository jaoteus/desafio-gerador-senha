package org.example;

import java.util.Random;

public class Main {
    public static int quantidadeCaracteres;
    public static final String caracteres =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a quantidade de caracteres: ");
        quantidadeCaracteres = scanner.nextInt();

        String senha = getSenha(quantidadeCaracteres);
        System.out.println("Senha gerada: " + senha);
    }

    public static String getSenha(int quantidadeCaracteres) {
        java.lang.StringBuilder senhaGerada = new StringBuilder();
        java.util.Random aleatorio = new java.util.Random();
        while (senhaGerada.length() < quantidadeCaracteres) {
//            int caracterIndex = aleatorio.nextInt(caracteres.length());
//            char caracter = caracteres.charAt(caracterIndex);
//            senhaGerada.append(caracter);
            char caracter = caracteres.charAt(aleatorio.nextInt(caracteres.length()));
            senhaGerada.append(caracter);
        }
        return senhaGerada.toString();
    }
}