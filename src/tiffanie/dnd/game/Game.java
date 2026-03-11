package tiffanie.dnd.game;

import tiffanie.dnd.character.Character;
import tiffanie.dnd.character.Warrior;
import tiffanie.dnd.character.Wizard;
import tiffanie.dnd.menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Menu menu;
    private Dice dice;
    private ArrayList<Cell> board;
    private Character character;
    private Scanner scanner;
    private int characterPosition;

    public Game(Menu menu, Dice dice, Scanner scanner) {
        this.menu = menu;
        this.dice = dice;
        this.board = new ArrayList<>();
        this.scanner = scanner;
    }

    public void initBoard(int characterPosition, Character character) {
        board.add(new StartCell());
        board.add(new EmptyCell());
        board.add(new EnemyCell());
        board.add(new WeaponCell());
        board.add(new PotionCell());
    }

    public void startGame() {
        while (!menu.mainMenu()) {
            String type = menu.getType();
            String name = menu.getName();
            initGame(type, name);
            while (!checkWin()) {
                loop();
            }
            System.out.println("You won !");
        }
    }

    public void moveCharacter(int move) {
        characterPosition += move;
        print(characterPosition);
    }

    public void print(int characterPosition) {
        System.out.print(board.get(characterPosition));
    }

    public void initGame(String type, String name) {
        new ArrayList<>(5);
        if (type.equals("Warrior")) {
            character = new Warrior(name);
        } else {
            character = new Wizard(name);
        }
        initBoard(0, character);
        print(characterPosition);
    }


    public void loop() {
        int roll = dice.roll(1);
        moveCharacter(roll);
        //this.scanner.nextLine();

    }

    public boolean checkWin() {
        return characterPosition >= board.size() - 1;
    }
}