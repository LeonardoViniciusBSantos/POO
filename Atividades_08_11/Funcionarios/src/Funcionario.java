public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private boolean funCLT;
    private int numeroFuncionario;
    private boolean trabalhadorMeioPeriodo;
    
    public Funcionario(String nome, int idade, double salario, boolean funCLT, int numeroFuncionario,
            boolean trabalhadorMeioPeriodo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.funCLT = funCLT;
        this.numeroFuncionario = numeroFuncionario;
        this.trabalhadorMeioPeriodo = trabalhadorMeioPeriodo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean isFunCLT() {
        return funCLT;
    }
    public void setFunCLT(boolean funCLT) {
        this.funCLT = funCLT;
    }
    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }
    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }
    public boolean isTrabalhadorMeioPeriodo() {
        return trabalhadorMeioPeriodo;
    }
    public void setTrabalhadorMeioPeriodo(boolean trabalhadorMeioPeriodo) {
        this.trabalhadorMeioPeriodo = trabalhadorMeioPeriodo;
    }
    

}
