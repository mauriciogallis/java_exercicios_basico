import java.util.ArrayList;
import java.util.List;

public class CriarObjetoCliente {

    /**
     * Criar uma classe Cliente com atributo String nome e Integer idade,
     *  instanciar 3 objetos e retornar a soma da idade dos 3 Clientes
     *
     *  ****Desafio: implementar utilizando programaçao funcional
     *
     */

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Marcio",15));
        clientes.add(new Cliente("Marcelo",15));
        clientes.add(new Cliente("Mauricio",15));

        Integer soma = clientes.stream().map(Cliente::getIdade).reduce(0, Integer::sum);

        System.out.printf("Total de idade:"+ soma);
    }


}
