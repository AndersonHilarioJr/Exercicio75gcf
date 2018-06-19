package exercicio75gcf;
import java.util.*;

/**
 *
 * @author anderson
 */
public class Exercicio75GCF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número para ser calculado a tabuada:");
        int valor = s.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor*i);
        }
    }
    
}
