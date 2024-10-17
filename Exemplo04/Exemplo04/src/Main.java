import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        RepositorioMusica emule = new RepositorioMusica();

        emule.adicionarMusica("Arials", "System of A Down");
        emule.adicionarMusica("Faint", "Linkin Park");
        emule.adicionarMusica("Cheia de Sal", "MC Gorila");
        emule.adicionarMusica("Quer Voar", "Maute");
        emule.adicionarMusica("Mustang Preto", "Teto");

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome da msuica: ");
            String termo = scanner.nextLine();
            try {
                Musica musicaPesquisada = emule.buscarMusica(termo);
                System.out.println(musicaPesquisada.getTitulo() + " - " + musicaPesquisada.getArtista());
            } catch (RuntimeException exception) {
                System.out.println("Música não encontrada!");
        }
    }
}
}
