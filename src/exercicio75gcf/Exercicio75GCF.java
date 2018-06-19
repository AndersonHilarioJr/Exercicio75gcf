package exercicio75gcf;
import java.util.*;

/**
 *
 * @author anderson
 */
public class Exercicio75GCF {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Informe uma opção:");
            System.out.println("1 - Calcular a tabuada");
            System.out.println("2 - Calcular o fatorial");
            System.out.println("0 - Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    calculaTabuada();
                    break;
                case 2:
                    calculaFatorial();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Informe um valor válido");
                    break;
            }
        }
    }

    private static void calculaTabuada() {
        System.out.println("Informe um número para ser calculado a tabuada:");
        int valor = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }

    private static void calculaFatorial() {
        int fat = 1;
        System.out.println("Informe um número para ser calculado o fatorial:");
        int valor = s.nextInt();
        for (int i = 2; i <= valor; i++) {
            fat *= i;
        }
        System.out.println("O fatorial de " + valor + " é igual a " + fat);
    }

}
