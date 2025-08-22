
package teste;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine().toLowerCase().replaceAll(" ", "");

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine().toLowerCase().replaceAll(" ", "");

        // Transforma as palavras em arrays de caracteres e ordena
        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        if (Arrays.equals(letras1, letras2)) {
            System.out.println("Resultado: As palavras são anagramas!");
        } else {
            System.out.println("Resultado: As palavras NÃO são anagramas.");
        }

        sc.close();
    }
}
