import java.util.ArrayList;
import java.util.List;

public class ImprimirNomesSemA {

    private static List<String> nomes = new ArrayList<>();

    static {
        nomes.add("Mauricio");
        nomes.add("Roger");
        nomes.add("Mario");
        nomes.add("Fred");
        nomes.add("Thiago");
        nomes.add("Rui");
    }

    /**
     * Dado a lista acima, faça um programa que imprima apenas os nomes que não contém a letra "a". 
     *
     * Desafio: fazer utilizando programacao funcional.
     */

    public static void main(String[] args) {
        nomes.stream().filter(s -> !s.contains("a")).forEach(System.out::println);
    }




}
