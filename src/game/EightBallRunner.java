package game;

import java.io.FileNotFoundException;
import game.EightBall;

/**
 * Placeholder.
 */
public class EightBallRunner {
    public static void main (String[] args) {
	try {
	    EightBall game = new EightBall();
	    game.gameLoop();
	} catch (FileNotFoundException fnfe) {
	    System.err.println("8 Ball File not Found");
	} // try
    } // main
} // EightBallRunner
