public class VeiculoAquatico extends Veiculo {
    private String tipoMotor;

    public VeiculoAquatico(String modelo, int ano, String tipoMotor) {
        super(modelo, ano);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Motor: " + tipoMotor);
    }
}
