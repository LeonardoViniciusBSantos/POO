
public class Bichinho {

    public String nomeBichinho;
    public String classeBichinho;
    public String familiaBichinho;
    public int idade;
    public boolean estaVivo;
    public int caloria;
    public int forca;

    public Bichinho(String nomeBichinho, String classeBichinho, String familiaBichinho) {

        this.nomeBichinho = nomeBichinho;
        this.classeBichinho = classeBichinho;
        this.familiaBichinho = familiaBichinho;
        this.idade = 0;
        this.estaVivo = true;
        this.caloria = 10;
        this.forca = 10;

    }

    public void imprimirStatus(){
        System.out.println("Status de vida do "+ this.nomeBichinho +":");
        System.out.println("Idade: " + this.idade +"\nNível de caloria: "+ this.caloria +"\nNivel de força: "+ this.forca);
    }

    public void comer() {

        if(this.caloria < 100 && this.forca > 0){
            System.out.println("hummmm, delícia!!!");
            this.idade ++;
            this.caloria += 10;
            this.forca -= 2;
        }
        else{
            System.out.println("Não posso comer agora :(");
        }

        imprimirStatus();

    }

    public void correr() {

        if(morto() == false || this.caloria >= 0){
            System.out.println("Aff, aff. Estou cansado!");
            this.idade ++;
            this.caloria -= 5;
            this.forca -= 5;
        }
        else{
            System.out.println("Não posso correr agora :(");
        }
        imprimirStatus();

    }

    boolean morto() {
        
        if(this.caloria<=0 || this.forca <= 0 || this.caloria >= 100 || this.forca >= 100 || this.idade >= 100){
            return true;
        }
        else{
            return false;
        }
    }

    public void dormir() {

        if(this.forca >= 0){
            System.out.println("Sonequinha boa");
            this.idade ++;
            this.caloria -= 2;
            this.forca += 10;
        }
        else{
            System.out.println("Não quero dormir agora :(");
        }
        imprimirStatus();

    }



}
