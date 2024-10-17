import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        // Adicionando filmes disponíveis
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.00, 12));
        cinema.adicionarFilme(new Filme("Vingadores", 25.00, 14));
        cinema.adicionarFilme(new Filme("Coringa", 30.00, 18));
        cinema.adicionarFilme(new Filme("Toy Story", 15.00, 0));
        cinema.adicionarFilme(new Filme("Interestelar", 22.00, 10));

        while (true) {
            try {
                // Solicitar dados do usuário
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();
                Filme filme = cinema.buscarFilme(nomeFilme);

                System.out.println("Qual assento você deseja?");
                String assento = scanner.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(scanner.nextLine());

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                // Tentar vender o ingresso
                cinema.venderIngresso(cliente, filme, assento);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra compra? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}
