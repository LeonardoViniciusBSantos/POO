public class App {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica retangulo = new Retangulo(5.0, 4.0);
        FiguraGeometrica circulo = new Circulo(3.0);
        FiguraGeometrica triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Área e Perímetro do Retângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Triângulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
