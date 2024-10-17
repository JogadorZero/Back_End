public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 8;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Lula";
        inimigo.vida = 13;

        Kamicaze piloto  = new Kamicaze();
        piloto.nome = "Piloto Japonês";
        piloto.vida = 20;

        jogador.atacar(inimigo);
        piloto.atacar(inimigo);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Inimigo: " + inimigo.vida);
        System.out.println("Kamicaze: " + piloto.vida);
    }
}