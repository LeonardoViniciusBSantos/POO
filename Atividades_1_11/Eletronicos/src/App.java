public class App {
    public static void main(String[] args) throws Exception {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 1000.0);
        Laptop laptop = new Laptop("Dell", "XPS 13", 1500.0);
        SmartTV smartTV = new SmartTV("Sony", "Bravia 4K", 800.0);

        double descontoSmartphone = smartphone.calcularDesconto();
        double descontoLaptop = laptop.calcularDesconto();
        double descontoSmartTV = smartTV.calcularDesconto();

        System.out.println("Desconto para Smartphone " + smartphone.getMarca() + ": " + descontoSmartphone);
        System.out.println("Desconto para Laptop " + laptop.getMarca() + ": " + descontoLaptop);
        System.out.println("Desconto para Smart TV " + smartTV.getMarca() + ": " + descontoSmartTV);

    }
}
