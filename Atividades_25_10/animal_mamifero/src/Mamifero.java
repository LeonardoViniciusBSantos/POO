public class Mamifero extends Animal {
    private int numeroPatas;
    private String tipoPelo;

    public Mamifero(String nome, int idade, int numeroPatas, String tipoPelo) {
        super(nome, idade);
        this.numeroPatas = numeroPatas;
        this.tipoPelo = tipoPelo;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero emite um som específico de mamífero.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Patas: " + numeroPatas);
        System.out.println("Tipo de Pelo: " + tipoPelo);
    }
}
