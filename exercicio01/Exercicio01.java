package main.resources;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        while (true) {

            Scanner genero = new Scanner(System.in);
            System.out.println("Que ambientação você prefere?\n" + "1. Sci-fi\n" + "2. Medieval\n");

            String primeiro = genero.nextLine();

            System.out.println("Que gênero você prefere?\n" + "1. Comédia\n" + "2. Drama\n");
            String segundo = genero.nextLine();

            if (primeiro.equals("1") && segundo.equals("1")) {
                System.out.println("Homens de Preto");
                break;
            } else if (primeiro.equals("1") && segundo.equals("2")) {
                System.out.println("Arrival");
                break;
            } else if (primeiro.equals("2") && segundo.equals("1")) {
                System.out.println("Sherk");
                break;
            } else if (primeiro.equals("2") && segundo.equals("2")) {
                System.out.println("Gladiador");
                break;
            } else {
                System.out.println("Digite apenas 1 ou 2.");
            }


        }
    }
}