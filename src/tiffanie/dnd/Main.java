package tiffanie.dnd;

import java.util.ArrayList;
import java.util.Scanner;

import tiffanie.dnd.equipment.Weapon;
import tiffanie.dnd.equipment.Spell;
import tiffanie.dnd.equipment.Potion;
import tiffanie.dnd.game.Cell;
import tiffanie.dnd.menu.Menu;
import tiffanie.dnd.game.Game;
import tiffanie.dnd.game.Dice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Salut");
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(new Menu(scanner), new Dice(), scanner);
        Weapon sword = new Weapon("Weapon", "sword", 5);
        Weapon mace = new Weapon("Weapon", "mace", 3);
        Spell fireball = new Spell("Spell", "fireball", 7);
        Potion classicPotion = new Potion("Potion", "classicPotion", 2);
        Potion bigPotion = new Potion("Potion", "bigPotion", 5);
    }
}