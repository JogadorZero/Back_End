import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 5));
        barcos.add(new Barco("Barco 2", 15));
        barcos.add(new Barco("Barco 3", 8));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 10));

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        for (Barco barco : barcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }

        portoPequeno.listarBarcos();
        portoGrande.listarBarcos();
    }
}
