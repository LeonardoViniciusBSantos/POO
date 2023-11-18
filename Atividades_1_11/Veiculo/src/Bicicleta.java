public class Bicicleta extends Veiculo {
    public Bicicleta() {
        super("Bicicleta");
    }

    @Override
    public double calcularTempoViagem(double distancia) {
        return distancia / 20.0;
    }
}