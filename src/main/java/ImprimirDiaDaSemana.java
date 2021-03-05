import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ImprimirDiaDaSemana {

    /**
     * Faça um programa que receba a data de nascimento no formato dia/mes/ano (01/12/1990) e imprima
     * o dia da semana (Segunda-feira,Terça-feira...) em que a pessoa nasceu
     **/

    public static final Map<String, String> map = new HashMap();

    static {
        map.put("Mon", "Segunda-feira");
        map.put("Tue", "Terça-feira");
        map.put("Wed", "Quarta-feira");
        map.put("Thu", "Quinta-feira");
        map.put("Fri", "Sexta-feira");
        map.put("Sat", "Sabado");
        map.put("Sun", "Domingo");
    }

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a data de nascimento:");
        String dataNascimento = scan.next();
        Date dateDataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        System.out.println(map.get(dateDataNascimento.toString().split(" ")[0]));
    }


}
