import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Olá, bem vindo ao bichinho virtual!!\n\nVamos criar seu bichinho bichinho. Comece escolhendo seu nome:");
        String nomeBichinho = scanner.nextLine();
        System.out.println("Qual a classe do seu bichinho?");
        String classeBichinho = scanner.nextLine();
        System.out.println("Qual a família do seu bichinho?");
        String familiaBichinho = scanner.nextLine();

        System.out.println("        !!! Bem-vindo ao jogo do Bichinho Virtual !!!       \n"
                + "Regras do Jogo:\n"
                + "1. Não deixe a caloria ou o nível de força chegar a 0.\n"
                + "2. Não deixe a caloria ou o nível de força ultrapassar 100.\n"
                + "3. Cada ação que você fizer aumenta a idade em +1.\n"
                + "4. Quando a idade do bichinho chegar em 100, ele morre.\n"
                + "5. Quando o bichinho morre, o jogo acaba.\n"
                + "\nBoa sorte e divirta-se cuidando do seu Bichinho Virtual!");

        Bichinho bichinho = new Bichinho(nomeBichinho, classeBichinho, familiaBichinho);
       
            while(true){
                System.out.println("Eu sou o "+ bichinho.nomeBichinho);
                bichinho.imprimirStatus();
                System.out.println("Escolha o que deseja fazer:\n1 - Comer\n2 - Correr\n3 - Dormir");
                int escolha = scanner.nextInt();
                if (escolha == 1){
                    bichinho.comer();
                }
                else if (escolha == 2){
                    bichinho.correr();
                }
                else if (escolha ==3) {
                    bichinho.dormir();
                }

                if(bichinho.morto() == true){
                    System.out.println("Acho que chegou a minha hora. Me desculpe por não poder te acompanhar mais :(");
                    break;

                }
            }
        }

    }
}
