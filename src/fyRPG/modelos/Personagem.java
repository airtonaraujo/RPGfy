package fyRPG.modelos;

import Rolls.Atributos;
import Rolls.D20Roll;
import Rolls.RolagemSkills;

public class Personagem extends Classe implements RolagemSkills, D20Roll, Atributos {
    private String characterName;
    private String race;
    private String background;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Personagem() {

    }

    public Personagem(String characterName, String race , String background, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.characterName = characterName;
        this.race = race;
        this.background = background;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void showCharacterSheet() {
        System.out.println("Character name: " +characterName);
        System.out.println("Race: " +race);
        System.out.println("Background: " +background);
        System.out.println("Strength: " +strength);
        System.out.println("Dexterity: " +dexterity);
        System.out.println("Constitution: " +constitution);
        System.out.println("Intelligence: " +intelligence);
        System.out.println("Wisdom: " +wisdom);
        System.out.println("Charisma: " +charisma);
    }

    @Override
    public int Atributos() {
        int[] d6Rolados;
        d6Rolados = new int[3];
        d6Rolados[0] = (int) Math.floor(Math.random() * 6);
        d6Rolados[1] = (int) Math.floor(Math.random() * 6);
        d6Rolados[2] = (int) Math.floor(Math.random() * 6);

        int atributoFinal = 0;
        for(int i = 0; i < d6Rolados.length; i++) {
            int d6Rolado = d6Rolados[i];
            atributoFinal += d6Rolado;
        }
        return 2 + atributoFinal;
    }

    @Override
    public double strengthModifier() {
        return (int) (double) strength / 4;
    }
    @Override
    public double dexModifier() {
        return (int) (double) dexterity / 4;
    }

    @Override
    public double conModifier() {
        return (int) (double) constitution / 4;
    }

    @Override
    public double intModifier() {
        return (int) (double) intelligence / 4;
    }

    @Override
    public double wisModifier() {
        return (int) (double) wisdom / 4;
    }

    @Override
    public double chaModifier() {
        return (int) (double) charisma / 4;
    }

    @Override
    public int D20Roll() {
        return (int)Math.floor(Math.random() * 20);
    }

    //Getters and Setters
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}