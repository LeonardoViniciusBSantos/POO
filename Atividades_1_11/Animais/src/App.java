public class App {
    public static void main(String[] args) throws Exception {
        Mamifero leao = new Mamifero("Leão", 5);
        Reptil cobra = new Reptil("Cobra", 2);
        Ave papagaio = new Ave("Papagaio", 3);

        leao.exibirInformacoes();
        cobra.exibirInformacoes();
        papagaio.exibirInformacoes();
    }
}
