import java.util.Scanner;

public class App {
public static void main(String[] args){
Estoque estoque_supermercado = new Estoque();
try (Scanner scanner = new Scanner(System.in)) {
    while(true){
        System.out.println("Qual opção desja fazer:\nAperte 1 para cadastrar produto\nAperte 2 para exibir produtos perecíveis\nAperte 3 para exibir produtos nãp perecíveis\nAperte 4 pare exibir produtos zerados no estoque\nAperte 5 para exibir quantidade de produtos cadastrado");
        int opcao = scanner.nextInt();
    
        switch (opcao){
            case 1:
                System.out.println("digite o nome do produto");
                scanner.nextLine();
                String nomeProduto = scanner.nextLine();
                System.out.println("Este produto é perecível? (s/n)");
                String aux = scanner.nextLine();
                boolean tipoProduto;
    
                if ("s".equals(aux)){
                    tipoProduto = true;
                }
                else if ("n".equals(aux)){
                    tipoProduto = false;
    
                }
                else{
                    System.out.println("Dado inválido");
                    break;
                }
                System.out.println("Informe a quantidade deste produto que você está incluindo no estoque");
                int quantidadeProduto = scanner.nextInt();
    
                Produto prod = new Produto(nomeProduto, tipoProduto, quantidadeProduto);
                estoque_supermercado.cadastrarProduto(prod);
                System.out.println("Produto cadastrado com sucesso");
                break;
    
            case 2:
                estoque_supermercado.exibirProdutosPereciveis();
                break;
    
            case 3:
                estoque_supermercado.exibirProdutosNaoPEreciveis();
                break;
    
            case 4:
            estoque_supermercado.exibirProdutosEmFalta();
            break;
    
            case 5:
            estoque_supermercado.exibirQuantidadeProdutosCadastrados();
            break;
        }
    
    
    // estoque_supermercado.cadastrarProduto(leite);
    // estoque_supermercado.cadastrarProduto(extrato_tomate);
    // estoque_supermercado.cadastrarProduto(arroz);
    // estoque_supermercado.cadastrarProduto(feijao);
    // estoque_supermercado.cadastrarProduto(manteiga);
    // estoque_supermercado.cadastrarProduto(vassoura);
    // estoque_supermercado.cadastrarProduto(rodo);
    // estoque_supermercado.cadastrarProduto(saco_lixo);
    
    //estoque_supermercado.exibirProdutosPereciveis();
    
    //estoque_supermercado.exibirProdutosNaoPEreciveis();
    
    //estoque_supermercado.exibirProdutosEmFalta();//produtos com quantidade zero no estoque
    //estoque_supermercado.exibirQuantidadeProdutosCadastrados();
    
    }
}

// Produto leite = new Produto("Leite Itambé", true, 30); //passar por parâmetro nome do produto, se é perecível ou não perecível e quantidade inicial em estoque
// Produto extrato_tomate = new Produto("Extrato de Tomate Quero", true, 50);
// Produto arroz = new Produto("Arroz Tio João", true, 100);
// Produto feijao = new Produto("Feijão Carioca Camil",true, 40);
// Produto manteiga = new Produto("Manteiga Porto Alegre", true, 10);
// Produto vassoura = new Produto("Vassoura Real", false, 15);
// Produto rodo = new Produto("Rodo Limpol", false, 15);
// Produto saco_lixo = new Produto("Saco de Lixo Preto 20L", false, 35);

}
}