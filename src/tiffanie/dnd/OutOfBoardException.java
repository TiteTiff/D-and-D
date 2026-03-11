package tiffanie.dnd;

public class OutOfBoardException extends Exception{
    public OutOfBoardException() {
        System.out.println("You are out of the board");
    }
}
