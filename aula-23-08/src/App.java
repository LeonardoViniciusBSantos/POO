import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
    //Questão 1
       
        List <Integer> lista = new ArrayList<>();

        lista.add(15);
        lista.add(4);
        lista.add(6);
        lista.add(9);

        Collections.sort(lista);
        System.out.println(lista.get(0));

    //Quetão 2

    List <Integer> lista2 = new ArrayList<>();

        lista2.add(15);
        lista2.add(4);
        lista2.add(6);
        lista2.add(9);
        
        lista2.add(2, 537);
        System.out.println(lista2);

    //Questão 3

        List <Integer> lista3 = new ArrayList<>();

        lista3.add(15);
        lista3.add(4);
        lista3.add(6);
        lista3.add(9);

        Collections.shuffle(lista3);
        System.out.println(lista3);

    //Questão 4

    List <Integer> lista4 = new ArrayList<>();

        lista4.add(15);
        lista4.add(4);
        lista4.add(6);
        lista4.add(9);

        
    List <Integer> lista5 = new ArrayList<>();

        lista5.add(1);
        lista5.add(4);
        lista5.add(62);
        lista5.add(9);

    lista4.retainAll(lista5);
    System.out.println(lista4);

    //Questão 5

    double media = 0;
    List <Double> lista6 = new ArrayList<>();

        lista6.add(1.35d);
        lista6.add(4.23d);
        lista6.add(62.23d);
        lista6.add(9.11d);

        for (Double i: lista6){
            media = media+i;
        }
        media = media/(lista6.size());
        System.out.println(media);

    //Questão 6

    List <Integer> lista7 = new ArrayList<>();

        lista7.add(15);
        lista7.add(4);
        lista7.add(6);
        lista7.add(9);
        lista7.add(17);
        lista7.add(12);
        lista7.add(71);
        lista7.add(90);

        for(int i= lista7.size(); i>=0;i--){
            if(lista7.get(i)%2!=0){
                lista7.remove(i);
            }
        }
        System.out.println(lista7);

    //Questão 7

    List <Integer> lista8 = new ArrayList<>();

        lista8.add(15);
        lista8.add(4);
        lista8.add(6);
        lista8.add(9);
        lista8.add(17);
        lista8.add(12);
        lista8.add(71);
        lista8.add(90);

        List <Integer> lista9 = new ArrayList<>();
        List <Integer> lista10 = new ArrayList<>();

        int valor = 24;

        for(int i: lista8){
            if (i > valor){
                lista9.add(i);
            }
            else{
                lista10.add(i);
            }
        }
        System.out.println(lista9);
        System.out.println(lista10);
        
    }
}
