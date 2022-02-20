package questoes.terceira;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args){

        int numeroPares = 0;
        HashMap<String, Integer> map= new HashMap<>();

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String anagrama = dadosEntrada.nextLine();

        for(int i = 0; i < anagrama.length(); i++){
            for(int j = i; j < anagrama.length(); j++){
                char[] caracter = anagrama.substring(i, j+1).toCharArray();

                Arrays.sort(caracter);
                String valor = new String(caracter);

                if (map.containsKey(valor)){
                    map.put(valor, map.get(valor)+1);
                }else{
                    map.put(valor, 1);
                }
            }
        }
        for(String key: map.keySet()){
            int n = map.get(key);
            numeroPares += (n * (n-1))/2;
        }

        System.out.println("Número de pares: " + numeroPares);
    }
}
