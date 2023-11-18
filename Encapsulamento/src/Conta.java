
public class Conta {

    public int n_conta;
    public String nome_titular;
    public double saldo;

    public Conta(int n_conta, String nome_titular, int saldo) {
        this.n_conta = n_conta;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }


    public void sacar(int valor) {

        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
        }

        System.out.println(this.saldo);

    } 
}

