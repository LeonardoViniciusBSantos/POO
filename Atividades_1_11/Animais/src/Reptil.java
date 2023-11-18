public class Reptil extends Animal {
    public Reptil(String nome, int idade) {
        super(nome, idade);
    }

    public void exibirInformacoes() {
        System.out.println("Réptil: " + getNome() + ", Idade - " + getIdade());
    }
}