import fyRPG.modelos.Personagem;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Personagem balgrum = new Personagem();

        System.out.println("Digite o nome do seu personagem: ");
        balgrum.setCharacterName(scanner.nextLine());

        System.out.println("Digite o background do seu personagem: ");
        balgrum.setBackground(scanner.nextLine());

        System.out.println("""
                Decida a raça do seu personagem:
                1- Humano
                2- Anão
                3- Elfo
                4- Tiefling
                """);
        int race = scanner.nextInt();
        if (race == 1) {
            balgrum.setRace("Humano");
        } else if (race == 2) {
            balgrum.setRace("Anão");
        } else if (race == 3) {
            balgrum.setRace("Elfo");
        } else if (race == 4) {
            balgrum.setRace("Tiefling");
        } else {
            System.out.println("Raça não definida");
            balgrum.setRace("Undefined");
        }

        System.out.println("Digite a força do seu personagem: ");
        balgrum.setStrength(scanner.nextInt());

        System.out.println("Digite a destreza do seu personagem: ");
        balgrum.setDexterity(scanner.nextInt());

        System.out.println("Digite a constituição do seu personagem: ");
        balgrum.setConstitution(scanner.nextInt());

        System.out.println("Digite a inteligencia do seu personagem: ");
        balgrum.setIntelligence(scanner.nextInt());

        System.out.println("Digite a sabedoria do seu personagem: ");
        balgrum.setWisdom(scanner.nextInt());

        System.out.println("Digite o carisma do seu personagem: ");
        balgrum.setCharisma(scanner.nextInt());

        System.out.println("Essa é a sua ficha de personagem: ");
        balgrum.showCharacterSheet();

        System.out.println("Vamos começar uma pequena jornada agora...");

        System.out.println("Let's make a wisdom roll");

        System.out.println(balgrum.D20Roll() + balgrum.wisModifier());
    }
}