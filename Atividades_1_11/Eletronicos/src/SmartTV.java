public class SmartTV extends Eletronico {
    public SmartTV(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    public double calcularDesconto() {
        double desconto = 0.0;
        if (getMarca().equals("Sony")) {
            desconto = 0.08; // 8% de desconto para produtos Sony.
        }
        return getPreco() * desconto;
    }
}