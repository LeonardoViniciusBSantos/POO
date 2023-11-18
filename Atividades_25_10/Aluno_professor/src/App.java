public class App {
    public static void main(String[] args) throws Exception {
        
        Estudante estudante = new Estudante("Alice", 20, 12345);
        Professor professor = new Professor("Dr. Smith", 35, "Matemática");

        System.out.println("Informações do Estudante:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println();

        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Disciplina: " + professor.getDisciplina());
    }
}
