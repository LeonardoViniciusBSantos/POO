public class Onibus extends Veiculo {
    public Onibus() {
        super("Ônibus");
    }

    public double calcularTempoViagem(double distancia) {
        return distancia / 40.0;
    }
}