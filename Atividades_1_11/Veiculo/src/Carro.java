public class Carro extends Veiculo {
    public Carro() {
        super("Carro");
    }

    public double calcularTempoViagem(double distancia) {
        return distancia / 60.0;
    }
}