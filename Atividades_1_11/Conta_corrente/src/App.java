public class App {
    public static void main(String[] args) throws Exception {
        
         ContaCorrente contaNormal = new ContaCorrente("Leonardo", 12312, 124142, 1000.00);
        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial("Leonardo", 12312, 124142, 1000.00);

        contaNormal.sacar(100.0); 
        contaEspecial.sacar(100.0);

        System.out.println("Saldo da conta normal: " + contaNormal.mostrarSaldo());
        System.out.println("Saldo da conta especial: " + contaEspecial.mostrarSaldo());
    

    }
}
