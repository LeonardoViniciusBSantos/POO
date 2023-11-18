public class App {
    public static void main(String[] args) throws Exception {
        Alimento alimento = new Alimento("Maçã", 5.0, 0.05);
        Eletronico eletronico = new Eletronico("Laptop", 1000.0, 0.1);
        Vestuario vestuario = new Vestuario("Camiseta", 20.0, 0.08);

        double precoAlimento = alimento.calcularPrecoFinal();
        double precoEletronico = eletronico.calcularPrecoFinal();
        double precoVestuario = vestuario.calcularPrecoFinal();

        System.out.println(" Valor final de " + alimento.getNome() + ": " + precoAlimento);
        System.out.println(" Valor final de " + eletronico.getNome() + ": " + precoEletronico);
        System.out.println(" Valor final de " + vestuario.getNome() + ": " + precoVestuario);

    }
}
