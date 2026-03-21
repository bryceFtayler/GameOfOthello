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

    private static int boardSize;

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
