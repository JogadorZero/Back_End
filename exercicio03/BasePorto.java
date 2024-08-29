import java.util.ArrayList;

public class BasePorto {
    private String nome;
    protected ArrayList<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado em " + this.nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println(barco.getNome() + " desatracado de " + this.nome);
    }

    public void listarBarcos() {
        System.out.println("Barcos atracados no porto " + this.nome + ":");
        for (Barco barco : barcosAtracados) {
            System.out.println("- " + barco.getNome() + " (Tamanho: " + barco.getTamanho() + ")");
        }
    }
}
