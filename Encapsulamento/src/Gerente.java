public class Gerente extends Funcionario {

    private String areaResponsavel;

    public Gerente(String nome, String cargo, Double salario, int matricula, String areaResponsavel, Conta minhaConta) {
        super(nome, cargo, salario, matricula, minhaConta);
        this.areaResponsavel = areaResponsavel;
    }


    // Método para verificar saldo da minhConta associada ao Gerente
    public void verificarSaldo() {
        if (this.minhaConta != null) {
            System.out.println("Saldo da minhConta do titular " + this.minhaConta.nome_titular + ": " + this.minhaConta.saldo);
        } else {
            System.out.println("O gerente não tem uma conta associada.");
        }
    }

}