import java.io.*;
import java.net.*;

/**
 * Referee is essentially a server that two "players" connect to to play the game Othello
 * 
 * @author Bryce Tayler
 */
public class Referee {
    private ServerSocket referee;
    private static final int PORT = 2003;

    private static int[] board = new int[64];

    public Referee() {

        try {
            printMessage("Referee approaches the board!");

            referee = new ServerSocket(PORT);

            printMessage("The referee awaits for the players...");
        } catch (Exception e) {
            // handle exception
            printError("The referee never made it to the board, the game is over!");

            e.printStackTrace();

            System.exit(0);
        }
        
        awaitPlayers();
    }

    private void awaitPlayers() {
    }

    /**
     * Prints general server messages to terminal.
     * 
     * @param message - Referee message.
     */
    private void printMessage(String message) {
        System.out.println("[REFEREE]:\n\t"+ message);
    }

    /**
     * Prints error messages to terminal.
     * 
     * @param message - Error message.
     */
    private void printError(String message) {
        System.err.println("[ERROR]:\n\t\""+ message);
    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            if (board[i]==0) {
                System.out.print("X");
            } else if (board[i] == -1){
                System.out.print("B");
            } else if (board[i] == 1) {
                System.out.print("W");
            }

            if ((i+1) % 8 == 0) {
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        
    }

}

class PlayerHandler implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
