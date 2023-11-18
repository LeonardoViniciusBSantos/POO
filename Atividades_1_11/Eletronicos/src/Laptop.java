public class Laptop extends Eletronico {
    public Laptop(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    public double calcularDesconto() {
        double desconto = 0.0;
        if (getMarca().equals("Dell")) {
            desconto = 0.15; // 15% de desconto para produtos Dell.
        }
        return getPreco() * desconto;
    }
}