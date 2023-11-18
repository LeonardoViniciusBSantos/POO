public class Ave extends Animal {
    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    public void exibirInformacoes() {
        System.out.println("Ave: " + getNome() + ", Idade - " + getIdade());
    }
}