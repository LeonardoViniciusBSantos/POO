public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Animal Genérico", 5);
        Mamifero mamifero = new Mamifero("Cachorro", 3, 4, "Pelo Macio");

        System.out.println("Informações do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        animal.emitirSom();
        System.out.println();

        System.out.println("Informações do Mamífero:");
        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Idade: " + mamifero.getIdade());
        System.out.println("Número de Patas: " + mamifero.getNumeroPatas());
        System.out.println("Tipo de Pelo: " + mamifero.getTipoPelo());
        mamifero.emitirSom();
    }
}
