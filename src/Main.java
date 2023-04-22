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

        System.out.println("Digite a raça do seu personagem: ");
        balgrum.setRaca(scanner.nextLine());

        System.out.println("Digite o background do seu personagem: ");
        balgrum.setBackground(scanner.nextLine());

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
        System.out.println("""
                    
                """);
    }
}