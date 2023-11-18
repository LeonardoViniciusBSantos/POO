public class App {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro();
        Onibus onibus = new Onibus();
        Bicicleta bicicleta = new Bicicleta();

        double distancia = 100.0; // Distância em quilômetros.

        double tempoCarro = carro.calcularTempoViagem(distancia);
        double tempoOnibus = onibus.calcularTempoViagem(distancia);
        double tempoBicicleta = bicicleta.calcularTempoViagem(distancia);

        System.out.println("Tempo de viagem de Carro: " + tempoCarro + " horas");
        System.out.println("Tempo de viagem de Ônibus: " + tempoOnibus + " horas");
        System.out.println("Tempo de viagem de Bicicleta: " + tempoBicicleta + " horas");
    }
}
