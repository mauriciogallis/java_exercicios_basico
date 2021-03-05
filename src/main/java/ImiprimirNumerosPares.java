public class ImiprimirNumerosPares {

    /**
     * Faça um programa que imprima todos os numeros pares de 0 a 100
     */

    public static void main(String[] args) {
        for(int i =1; i < 101; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
    }


}
