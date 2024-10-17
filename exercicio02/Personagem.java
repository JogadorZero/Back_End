public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void atacar(Personagem alvo) {
        if (this.vida <= 0) {
            System.out.println(this.nome + " não pode atacar, pois está derrotado.");
            return;
        }

        if (alvo.getVida() > 0) {
            System.out.println(this.nome + " ataca " + alvo.getNome() + " causando " + this.ataque + " de dano.");
            alvo.receberDano(this.ataque);
        } else {
            System.out.println("O ataque de " + this.nome + " falhou. " + alvo.getNome() + " já foi derrotado.");
        }
    }
}
