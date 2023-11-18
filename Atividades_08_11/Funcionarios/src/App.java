public class App {
    public static void main(String[] args) throws Exception {

        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        FuncionarioMeioPeriodo funcionarioA = new FuncionarioMeioPeriodo("Joao", 40, 5000.00, true, 1729872383, true);
        FuncionarioRegimeIntegral funcionarioB = new FuncionarioRegimeIntegral("Pedro", 35, 1764.12, true, 981236321, false);
        FuncionarioCNPJ funcionarioC = new FuncionarioCNPJ("Cláudia", 25, 7313.21, false, 331801210, false);
        
        listaFuncionarios.adicionarFuncionario(funcionarioA);
        listaFuncionarios.adicionarFuncionario(funcionarioB);
        listaFuncionarios.adicionarFuncionario(funcionarioC);

        listaFuncionarios.listarFuncionarios();

        //Atualizar as informações de um funcionário pelo nome
        listaFuncionarios.editarFuncionario(funcionarioA.getNome(), 3000.0, null, null, null, null);
        
        listaFuncionarios.listarFuncionarios();

        //Excluir as informações de um funcionário pelo nome
        listaFuncionarios.excluirFuncionario(funcionarioA.getNome());

        listaFuncionarios.listarFuncionarios();
    }
}
