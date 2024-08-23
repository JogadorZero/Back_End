public class Objeto extends Personagem {
    @Override
    public void atacar(Personagem alvo) {
        alvo.vida -= 10;
        this.vida -= 200;
        super.atacar(alvo);
    }
}
