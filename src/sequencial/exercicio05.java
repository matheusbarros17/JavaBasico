package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1;
        int numeroPecas1;
        double precoPeca1;
        int peca2;
        int numeroPecas2;
        double precoPeca2;
        double total;

        peca1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        precoPeca1 = sc.nextDouble();
        peca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        precoPeca2 = sc.nextDouble();

        total = (numeroPecas1 * precoPeca1) + (numeroPecas2 * precoPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
