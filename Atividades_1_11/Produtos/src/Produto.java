public class Produto {

    private String nome;
    private double precoInicial;
    private double imposto;

    public Produto(String nome, double precoInicial, double imposto) {
        this.nome = nome;
        this.precoInicial = precoInicial;
        this.imposto = imposto;
    }

    public double calcularPrecoFinal(){
        return this.precoInicial + precoInicial*imposto; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(double precoInicial) {
        this.precoInicial = precoInicial;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
}
