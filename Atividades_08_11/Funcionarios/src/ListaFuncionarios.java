import java.util.ArrayList;

public class ListaFuncionarios {

    
    private ArrayList<Funcionario> funcionarios;

    public ListaFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("idade: " + funcionario.getIdade());
            System.out.println("Salário: " + funcionario.getSalario());
            if (funcionario.isFunCLT() == false) {
                System.out.println("CNPJ: " + funcionario.getNumeroFuncionario());
            }
            else{
                System.out.println("Número do PIS: " + funcionario.getNumeroFuncionario());
                System.out.println("Trabalhador meio período: " + funcionario.isTrabalhadorMeioPeriodo());
            }
            System.out.println(); 
        }
    }

    public void editarFuncionario(String nome, Double novoSalario, Integer novaIdade, Boolean novoFunCLT,
            Integer novoNumeroFuncionario, Boolean novoTrabalhadorMeioPeriodo) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                if (novoSalario != null) {
                    funcionario.setSalario(novoSalario);
                }
                if (novaIdade != null) {
                    funcionario.setIdade(novaIdade);
                }
                if (novoFunCLT != null) {
                    funcionario.setFunCLT(novoFunCLT);
                }
                if (novoNumeroFuncionario != null) {
                    funcionario.setNumeroFuncionario(novoNumeroFuncionario);
                }
                if (novoTrabalhadorMeioPeriodo != null) {
                    funcionario.setTrabalhadorMeioPeriodo(novoTrabalhadorMeioPeriodo);
                }
            }
        }
    }

    public void excluirFuncionario(String nome) {
        Funcionario funcionarioParaExcluir = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarioParaExcluir = funcionario;
                break; 
            }
        }

        if (funcionarioParaExcluir != null) {
            funcionarios.remove(funcionarioParaExcluir);
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

}