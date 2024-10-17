import java.util.Random;
import java.util.Scanner;

public class GeradorUsername {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        String username = nome + sobrenome + numeroAleatorio;

        System.out.println("Nome de usuário gerado: " + username);

        scanner.close();
    }
}