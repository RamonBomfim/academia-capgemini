package questoes.primeira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        List<String> degraus = new ArrayList<>();

        System.out.println("Digite a quantidade de degraus: ");
        int qtdDegraus = dadosEntrada.nextInt();

        for (int i = 1; i <= qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i));
        }

        for (String escada: degraus) {
            System.out.println(escada);
        }

    }

}
