public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
    }
}
