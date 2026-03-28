import java.io.Serializable;

interface Message extends Serializable {
}

/**
 * Message for a player to connect to the referee. Gives the referee the name of
 * the player.
 */
record ConnectionRequestMessage(String name) implements Message {
}

/**
 * Message telling a player to setup for a game. Stores the colour of the
 * player.
 */
record SetupMessage(int colour) implements Message {
}

/**
 * Message sent to the player requesting them to make a move. Stores move made
 * by opponent.
 */
record MoveRequestMessage(int move) implements Message {
}

/**
 * Message sent to referee giving a players move. Stores the move of the player.
 */
record MoveMessage(int move) implements Message {
}

/**
 * Message sent to players telling them to disconnect from referee. Stores
 * message sent from referee.
 */
record DisconnectMessage(String message) implements Message {
}