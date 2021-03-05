import java.util.Scanner;
import java.util.stream.Stream;

public class ImprimirLetrasDeUmNome {

    /**
     * Faça um programa que receba um nome e imprima letra por letra do nome
     *
     * entrada: Mario
     * saida: M
     *        a
     *        r
     *        i
     *        o
     */

    public static void main(String[] args) {
        System.out.println("Digite o nome: ");
        String nome = new Scanner(System.in).next();
        Stream.of(nome.split("")).forEach(System.out::println);
    }


}
