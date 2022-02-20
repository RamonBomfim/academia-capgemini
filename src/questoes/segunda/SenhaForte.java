package questoes.segunda;

import java.util.Scanner;

public class SenhaForte {

    public static void main(String[] args) {
        final int NUM_CHAR = 6;
        String charEspecial = "!@#$%^&*()-+";
        String charMaiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String charMinusculo = "abcdefghijklmnopqrstuvwxyz";
        String charNumero = "0123456789";
        int maiusculo = 0;
        int minusculo = 0;
        int numero = 0;
        int especial = 0;
        int falta = 0;

        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite a senha usada até o momento: ");
        String senhaUsada = dadosEntrada.nextLine();
        int senhaUsadaLen = senhaUsada.length();

        for (int i = 0; i < senhaUsadaLen; i++) {

            String strChar = Character.toString(senhaUsada.charAt(i));

            if(charEspecial.contains(strChar)) {
                especial++;
            } else if(charMaiusculo.contains(strChar)) {
                maiusculo++;
            } else if(charMinusculo.contains(strChar)) {
                minusculo++;
            } else if(charNumero.contains(strChar)) {
                numero++;
            }
        }

        if(senhaUsadaLen < NUM_CHAR) {
            falta = NUM_CHAR - senhaUsadaLen;
            System.out.println("A senha precisa conter no mínimo 6 caracteres!");
            System.out.println("Sua senha atual precisa de mais " + falta + " caracteres");
        } else {
            if(numero == 0) {
                falta++;
                System.out.println("Sua senha atual é: " + senhaUsada + ", ela precisa conter pelo menos 1 número");
                System.out.println("Falta: " + falta + " caracter");
            } else if(maiusculo == 0) {
                falta++;
                System.out.println("Sua senha atual é: " + senhaUsada + ", ela precisa conter pelo menos 1 letra maiúscula");
                System.out.println("Falta: " + falta + " caracter");
            } else if(minusculo == 0) {
                falta++;
                System.out.println("Sua senha atual é: " + senhaUsada + ", ela precisa conter pelo menos 1 letra minúscula");
                System.out.println("Falta: " + falta + " caracter");
            } else if(especial == 0) {
                falta++;
                System.out.println("Sua senha atual é: " + senhaUsada + ", ela precisa conter pelo menos 1 caracter especial.");
                System.out.println("Os caracteres especiais são: " + charEspecial);
                System.out.println("Falta: " + falta + " caracter");
            } else {
                System.out.println("Senha forte!");
            }
        }
    }

}
