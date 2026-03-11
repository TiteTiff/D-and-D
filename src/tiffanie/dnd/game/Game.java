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
            //print(characterPosition);
            System.out.println("You won !");
        }
    }

    public void moveCharacter(int move) {
        Cell currentCell = board.get(characterPosition);
        characterPosition += move;
        //if (characterPosition >= board.size()) {
        //    characterPosition;
        // }
        //System.out.println(currentCell.toString());
        print(characterPosition);
    }

    public void print(int characterPosition) {
        System.out.print(board.get(characterPosition));
    }

    public void initGame(String type, String name) {
        new ArrayList<>(4);
        if (type.equals("Warrior")) {
            character = new Warrior(name);
        } else {
            character = new Wizard(name);
        }
        initBoard(0, character);
    }


    public void loop() {
        System.out.print(board.get(characterPosition));
        int roll = dice.roll(1);
        moveCharacter(roll);
        //  this.scanner.nextLine();

    }

    public boolean checkWin() {
        return characterPosition >= board.size()-1;
    }
}

/*
public class Board {

    private int characterPosition;
    private ArrayList<Cell> cells;

    public Board() {
        cells = new ArrayList<>();
    }

    public Object getCell(int index) {
        return cells.get(index);
    }


    public void setCell(int index, Object cell) {
        cells.add(new EmptyCell());
        cells.add(new EnemyCell());
        cells.add(new WeaponCell());
        cells.add(new PotionCell());
    }

    public void moveCharacter(int move) {
        Object character = getCell(characterPosition);
        setCell(characterPosition, null);
        characterPosition += move;
        if (characterPosition >= cells.size()) {
            characterPosition = cells.size() - 1;
        }
        setCell(characterPosition, character);
    }

    public void print() {
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i) == null) {
                System.out.print(".");
            } else {
                System.out.print(cells.get(i));
            }
        }
        System.out.println();
    } */