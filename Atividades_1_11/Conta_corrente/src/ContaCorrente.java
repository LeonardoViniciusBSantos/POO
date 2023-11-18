
public class ContaCorrente {

    private String nomeCliente;
    private int conta;
    private int agencia;
    private Double saldo;

    public ContaCorrente(String nomeCliente, int conta, int agencia, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor){

        saldo += valor;

    }

    public void sacar(Double valor){

        double taxa = valor * 0.005;
        saldo -= (valor + taxa);

    }

    public double mostrarSaldo(){

       return saldo;

    }
}
