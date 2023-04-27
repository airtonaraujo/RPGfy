package fyRPG.services;

import fyRPG.modelos.Personagem;

import java.util.Scanner;

public class MenuService {
    Scanner scanner = new Scanner(System.in);
    public Personagem personagem = new Personagem();
    public AtributosService atributosService = new AtributosService();
    public void definirNome() {
        System.out.println("Digite o nome do seu personagem: ");
        personagem.setCharacterName(scanner.nextLine());
    }

    public void definirBackground() {
        System.out.println("""
                Vamos decidir o background do seu personagem:
                0 - Acólito (+2 wisdom)
                1 - Folk Hero (+2 constitution)
                2 - Noble (+2 charisma)
                3 - Soldier (+2 strength)
                4 - Criminal (+2 dexterity)
                5 - Sage (+2 intelligence)
                """);
        int background = scanner.nextInt();
        if (background == 0) {
            personagem.setBackground("Acólito");
            personagem.setWisdom(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else if (background == 1) {
            personagem.setBackground("Folk Hero");
            personagem.setConstitution(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else if (background == 2) {
            personagem.setBackground("Noble");
            personagem.setCharisma(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else if (background == 3) {
            personagem.setBackground("Soldier");
            personagem.setStrength(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else if (background == 4) {
            personagem.setBackground("Criminal");
            personagem.setDexterity(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else if (background == 5) {
            personagem.setBackground("Sage");
            personagem.setIntelligence(2);
            System.out.println("Background selecionado: " +personagem.getBackground());
        } else {
            while (background >= 6) {
                System.out.println("Background inválido, insira um valor dentre as opções");
                background = scanner.nextInt();
            }
        }
    }
    public void definirRace() {
        System.out.println("""
                Decida a raça do seu personagem:
                0- Humano
                1- Anão
                2- Elfo
                3- Tiefling
                """);

        int race = scanner.nextInt();
        if (race == 0) {
            personagem.setRace("Humano");
            System.out.println("Você definiu sua raça como: " +personagem.getRace());
        } else if (race == 1) {
            personagem.setRace("Anão");
            System.out.println("Você definiu sua raça como: " +personagem.getRace());
        } else if (race == 2) {
            personagem.setRace("Elfo");
            System.out.println("Você definiu sua raça como: " +personagem.getRace());
        } else if (race == 3) {
            personagem.setRace("Tiefling");
            System.out.println("Você definiu sua raça como: " +personagem.getRace());
        } else {
            while (race >= 4) {
                System.out.println("Raça inválida, insira um valor dentre as opções");
                race = scanner.nextInt();
            }
        }
    }

    public void definirAtributos() {
        System.out.println("Agora seus atributos serão rolados automaticamente por 3d10. Boa sorte ");
        personagem.setStrength(personagem.getStrength() + atributosService.rolarAtributos());
        personagem.setDexterity(personagem.getDexterity() + atributosService.rolarAtributos());
        personagem.setConstitution(personagem.getConstitution() + atributosService.rolarAtributos());
        personagem.setIntelligence(personagem.getIntelligence() + atributosService.rolarAtributos());
        personagem.setWisdom(personagem.getWisdom() + atributosService.rolarAtributos());
        personagem.setCharisma(personagem.getCharisma() + atributosService.rolarAtributos());
    }
}
