import java.util.Scanner;

public class NumeroPrimo {

    /**
     * Fazer um programa que receba um numero inteiro e responda se ele é primo ou não
     *  número primo é aquele número que é divido por 1 e por ele mesmo.
     *
     **/

    public static void main(String[] args) {
        System.out.println("Digite o número: ");
        int numero = new Scanner(System.in).nextInt();
        boolean ePrimo = true;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                ePrimo = false;
            }
        }
        System.out.println(ePrimo ? "Numero é primo":"Número não é primo");
    }


}
