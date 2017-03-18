package se.andolf.blackjack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Thomas on 2017-03-04.
 */
public class Main {

    private static final int PLAYERS = 1;
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Game game = new Game();
        logger.info("---- INITIALIZING PLAYERS ----");
        game.initPlayers(PLAYERS);
        logger.info("---- STARTING GAME ----");
        game.start();
    }
}