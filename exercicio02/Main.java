import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Inimigo 1", 50, 10));
        inimigos.add(new Personagem("Inimigo 2", 60, 15));
        inimigos.add(new Personagem("Inimigo 3", 40, 20));

        Personagem jogador = new Personagem("Jogador", 100, 25);

        Random rand = new Random();

        while (jogador.getVida() > 0 && !todosInimigosDerrotados(inimigos)) {
            
            Personagem inimigo = inimigos.get(rand.nextInt(inimigos.size()));
            if (inimigo.getVida() > 0) {
                jogador.atacar(inimigo);
            }

            for (Personagem p : inimigos) {
                if (p.getVida() > 0) {
                    p.atacar(jogador);
                }
            }
        }

        if (jogador.getVida() > 0) {
            System.out.println("O jogador venceu!");
        } else {
            System.out.println("O jogador foi derrotado!");
        }
    }

    public static boolean todosInimigosDerrotados(List<Personagem> inimigos) {
        for (Personagem p : inimigos) {
            if (p.getVida() > 0) {
                return false;
            }
        }
        return true;
    }
}