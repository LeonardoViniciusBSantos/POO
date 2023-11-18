public class App {
    public static void main(String[] args) throws Exception {
        Conta minhaConta = new Conta(123, "João", 1000);

        // Criando um funcionário associado à conta
        Funcionario funcionario = new Funcionario("Alice", "Analista", 3000.0, 001, minhaConta);

        // Criando um gerente associado à conta
        Gerente gerente = new Gerente("Carlos", "Gerente de Projetos", 5000.0, 002, "TI", minhaConta);

        // Demonstrando o método de sacar na conta
        minhaConta.sacar(200);

        // Demonstrando o método de verificar saldo para o funcionário e o gerente
        funcionario.verificarSaldo();


    }
}
