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
            System.out.println("3 - Calcular bascara");
            System.out.println("4 - Calcular pitagoras");
            System.out.println("0 - Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    calculaTabuada();
                    break;
                case 2:
                    calculaFatorial();
                    break;
                case 3:
                    calculaBascara();
                    break;
                case 4:
                    calculaPitagoras();
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

    private static void calculaBascara() {
        System.out.println("Informe o valor 'a' da equeção");
        double a = s.nextInt();
        System.out.println("Informe o valor 'b' da equeção");
        double b = s.nextInt();
        System.out.println("Informe o valor 'c' da equeção");
        double c = s.nextInt();
        double delta = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        double x1 = (-b + delta)/(2*a);
        double x2 = (-b - delta)/(2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    private static void calculaPitagoras() {
        System.out.println("Informe o valor 'a' da equeção");
        double a = s.nextInt();
        System.out.println("Informe o valor 'b' da equeção");
        double b = s.nextInt();
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("O resultado é " + c);
    }
}
