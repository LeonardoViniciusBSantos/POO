
public class Funcionario {

    public String nome;
    public String cargo;
    public Double salario;
    public int matricula;
    public Conta minhaConta;
    
    public Funcionario(String nome, String cargo, Double salario, int matricula, Conta minhaConta) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.minhaConta = minhaConta;
    }

    public void verificarSaldo() {
        if (this.minhaConta != null) {
            System.out.println("Saldo da conta do titular " + this.minhaConta.nome_titular + ": " + this.minhaConta.saldo);
        } else {
            System.out.println("O funcionário não tem uma conta associada.");
        }
    }
}


