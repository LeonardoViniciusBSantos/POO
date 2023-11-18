public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo("Carro", 2022);
        VeiculoTerrestre terrestre = new VeiculoTerrestre("Bicicleta", 2021, 2);
        VeiculoAquatico aquatico = new VeiculoAquatico("Barco", 2020, "Motor a Diesel");

        System.out.println("Informações do Veículo:");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println();

        System.out.println("Informações do Veículo Terrestre:");
        System.out.println("Modelo: " + terrestre.getModelo());
        System.out.println("Ano: " + terrestre.getAno());
        System.out.println("Número de Rodas: " + terrestre.getNumeroRodas());
        System.out.println();

        System.out.println("Informações do Veículo Aquático:");
        System.out.println("Modelo: " + aquatico.getModelo());
        System.out.println("Ano: " + aquatico.getAno());
        System.out.println("Tipo de Motor: " + aquatico.getTipoMotor());
    }
}
