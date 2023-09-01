/*
@author tathianymarquesani
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ColecoesParte2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os Nomes e Sexos separados por vírgula (Ex: João,M): ");
        String nomesEntrada = ler.nextLine();
        String[] parts = nomesEntrada.split(",");

        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        for (int i = 0; i < parts.length; i += 2) {
            String nome = parts[i];
            String sexo = parts[i + 1];

            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido para o nome: " + nome);
            }
        }

        System.out.println("Mulheres: " + mulheres);
        System.out.println("Homens: " + homens);
    }
}
