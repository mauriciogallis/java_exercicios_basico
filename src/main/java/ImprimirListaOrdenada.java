import java.util.Scanner;
import java.util.stream.Stream;

public class ImprimirListaOrdenada {

    /**
     * Fazer um programa que receba 3 nomes, separados por virgula (,) e imprima os 3 nomes em ordem alfabética
     **/

    public static void main(String[] args) {
        System.out.println("Digite os nomes: ");
        String nomes = new Scanner(System.in).next();
        Stream.of(nomes.split(",")).sorted().forEach(System.out::println);
    }


}
