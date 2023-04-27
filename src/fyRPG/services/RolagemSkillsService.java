package fyRPG.services;

import fyRPG.modelos.Personagem;

public class RolagemSkillsService {
    private Personagem personagem;

    public double strengthModifier() {
        return (int) (double) personagem.getStrength() / 4;
    }

    public double dexModifier() {
        return (int) (double) personagem.getDexterity() / 4;
    }


    public double conModifier() {
        return (int) (double) personagem.getConstitution() / 4;
    }


    public double intModifier() {
        return (int) (double) personagem.getIntelligence() / 4;
    }


    public double wisModifier() {
        return (int) (double) personagem.getWisdom() / 4;
    }


    public double chaModifier() {
        return (int) (double) personagem.getCharisma() / 4;
    }
}
