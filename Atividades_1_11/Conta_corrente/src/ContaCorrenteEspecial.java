class ContaCorrenteEspecial extends ContaCorrente{

    public ContaCorrenteEspecial(String nomeCliente, int conta, int agencia, Double saldo) {
        super(nomeCliente, conta, agencia, saldo);
        
    }

    public void sacar(Double valor) {

        double taxa = valor * 0.001;
        double saldo = getSaldo();
        saldo -= (valor + taxa);
        setSaldo(saldo);
    }


}