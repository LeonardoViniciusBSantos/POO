public class Smartphone extends Eletronico {
    public Smartphone(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    public double calcularDesconto() {
        double desconto = 0.0;
        if (getMarca().equals("Samsung")) {
            desconto = 0.1; // 10% de desconto para produtos Samsung.
        }
        return getPreco() * desconto;
    }
}