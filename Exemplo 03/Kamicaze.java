public class Kamicaze extends Personagem {
    @Override
    public void atacar(Personagem alvo){
        alvo.vida -= 20;
        this.vida = 0;
        super.atacar(alvo);
    }
}
