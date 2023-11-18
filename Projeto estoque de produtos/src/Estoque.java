import java.util.ArrayList;
import java.util.List;

public class Estoque {

    public List<Produto> produtos;

    public Estoque (){
        
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {

        this.produtos.add(produto);
        System.out.println("Produto cadastro");

    }

    public void exibirProdutosPereciveis() {

        for (Produto produto : this.produtos) {

            if (produto.perecivel == true){

                System.out.println(produto.nome);

            }
            
        }

    }

    public void exibirProdutosNaoPEreciveis() {

        for (Produto produto : this.produtos) {

            if (produto.perecivel == false){

                System.out.println(produto.nome);

            }
            
        }
    }

    public void exibirProdutosEmFalta() {

        for (Produto produto : this.produtos) {

            if (produto.quantidade <= 0){

                System.out.println("produto: " +produto.nome +"\nQuantidade "+ produto.quantidade);

            }
            
        }

    }

    public void exibirQuantidadeProdutosCadastrados() {
    
    System.out.println(produtos.size());
    }


}
