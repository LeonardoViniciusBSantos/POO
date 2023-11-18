public class VeiculoTerrestre extends Veiculo {
    private int numeroRodas;

    public VeiculoTerrestre(String modelo, int ano, int numeroRodas) {
        super(modelo, ano);
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Rodas: " + numeroRodas);
    }
}
