import java.util.Random;
import java.util.Scanner;

public class Exemplo00 {
    public static void main(String[] args) {
        //String nome = "Lucas";

        //int numero_decimal = 10;
        //float numero_flutuante = 10.0f;
        //boolean is_verdade = true;
        //char caracter = 'a';

        //Integer objeto_decimal = 10;
        //Double objeto_flutuante = 10.1;
        //Boolean objeto_verdade = true;
        while(true) {
            /*
            String[] posicao = new String[4];
            posicao[0] = "atacante";
            posicao[1] = "meia";
            posicao[2] = "zagueiro";
            posicao[3] = "goleiro";
             */

            String[] posicao = {"atacante", "meia", "zagueiro", "goleiro"};


            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o primeiro nome: ");
            String primeiro_nome = leitor.nextLine();

            if (primeiro_nome.isEmpty()) {
                break;
            }

            System.out.println("Digite o segundo nome: ");
            String segundo_nome = leitor.nextLine();

            if (segundo_nome.isEmpty()) {
                break;
            }

            Random gerador_aleatorio = new Random();
            Integer numero_aleatorio = gerador_aleatorio.nextInt( 10, 100);

            Integer indice_aleatorio = gerador_aleatorio.nextInt(vetor_posicoes.length);

            System.out.println(primeiro_nome + segundo_nome + numero_aleatorio);
        }

    }
}