import java.math.BigDecimal;
import java.util.Scanner;

public class SubtrairPercentual {

    /**
     * Fazer um programa que receba o valor de um item, e logo após o percentual de desconto
     * o programa deve imprimir o valor com o desconto em percentual aplicado.
     **/

    public static void main(String[] args) {
        System.out.print("Digite o valor do item: ");
        Scanner scan = new Scanner(System.in);
        BigDecimal valor =  new BigDecimal(scan.nextInt());
        System.out.print("Digite o percentual de desconto: ");
        scan = new Scanner(System.in);
        BigDecimal desconto =  new BigDecimal(scan.nextInt());
        System.out.println("Total com desconto aplicado: "+valor.subtract(valor.divide(new BigDecimal(100)).multiply(desconto)));
    }
}
