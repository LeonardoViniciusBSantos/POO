public class Mamifero extends Animal {
    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    public void exibirInformacoes() {
        System.out.println("Mamífero: " + getNome() + ", Idade - " + getIdade());
    }
}