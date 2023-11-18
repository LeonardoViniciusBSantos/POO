public abstract class Veiculo {
    private String tipo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularTempoViagem(double distancia);
}