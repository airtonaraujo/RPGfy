package fyRPG.modelos;

public class Personagem extends Classe{
    private String characterName;
    private String raca;
    private String background;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String favoriteSkill;

    public Personagem() {

    }

    public Personagem(String characterName, String raca , String background, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.characterName = characterName;
        this.raca = raca;
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
        System.out.println("Race: " +raca);
        System.out.println("Background: " +background);
        System.out.println("Strength: " +strength);
        System.out.println("Dexterity: " +dexterity);
        System.out.println("Constitution: " +constitution);
        System.out.println("Intelligence: " +intelligence);
        System.out.println("Wisdom: " +wisdom);
        System.out.println("Charisma: " +charisma);
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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