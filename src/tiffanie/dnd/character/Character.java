package tiffanie.dnd.character;

import tiffanie.dnd.equipment.OffensiveEquipment;
import tiffanie.dnd.equipment.DefensiveEquipment;

abstract public class Character {
    private String name;
    private String type;
    private int hp;
    private int atkLevel;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;

    public Character(String name, String type, int hp, int atkLevel) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.atkLevel = atkLevel;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }

    @Override
    public String toString() {
        return "Character " +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hp=" + hp +
                ", atkLevel=" + atkLevel +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment;
    }
}
