import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new ArrayList<>();

        // Adicionando alguns assentos disponíveis
        char[] rows = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char row : rows) {
            for (int i = 1; i <= 5; i++) {
                assentosDisponiveis.add(row + String.valueOf(i));
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nomeFilme) throws Exception {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                return filme;
            }
        }
        throw new Exception("Filme não encontrado!");
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {
        // Verificar se o cliente tem idade suficiente
        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        // Verificar se o assento está disponível
        if (!assentosDisponiveis.contains(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }

        // Adicionar o ingresso vendido
        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(assento);
        System.out.println(ingresso);
    }
}

