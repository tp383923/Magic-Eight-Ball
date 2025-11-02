package game;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * This class represents a Magic 8 Ball, that can print a visual of the ball, take the user's input, and give them a randomly selected output.
 */
public class EightBall {

    /**
     * Starts the gameplay loop, printing the ASCII art of the 8 ball, prompting the user for button input and displaying an answer. 
     *
     * @throws FileNotFoundException if <code>file</code> is missing. 
     */
    public void gameLoop() throws FileNotFoundException {
	Scanner input = new Scanner(System.in);
	String fullCommand = "";
	printBall();
	
	while (true) {
	    System.out.println("Type (or think) a question and press ENTER (q or quit to exit program)");
	    fullCommand = input.nextLine();
	    
	    if (fullCommand.equalsIgnoreCase("q") || fullCommand.equalsIgnoreCase("quit")) {
		System.exit(0);
	    } // if
	    
	    System.out.println("\n" + getOutput() + "\n");
	} // while
    } // gameLoop

    /**
     * Returns a randomly selected output to be the answer to the user's question. 
     *
     * @return String the randomly selected output
     */
    public String getOutput() {
	int random = (int) (Math.random() * 19);
	String output = "";
	switch (random) {
	case 0:
	    output = "It is certain";
	    break; 
	case 1:
	    output = "It is decidely so";
	    break;
	case 2:
	    output = "Without a doubt";
	    break;
	case 3:
	    output = "Yes definetely";
	    break;
	case 4:
	    output = "You may rely on it";
	    break;
	case 5:
	    output = "As I see it, yes";
	    break;
	case 6:
	    output = "Most likely";
	    break;
	case 7:
	    output = "Outlook good";
	    break;
	case 8:
	    output = "Yes";
	    break;
	case 9:
	    output = "Signs point to yes";
	    break;
	case 10:
	    output = "Reply hazy, try again";
	    break;
	case 11:
	    output = "Ask again later";
	    break;
	case 12:
	    output = "Better not tell you now";
	    break;
	case 13:
	    output = "Cannot predict now";
	    break;
	case 14:
	    output = "Concentrate and ask again";
	    break;
	case 15:
	    output = "Don't count on it";
	    break;
	case 16:
	    output = "My reply is no";
	    break;
	case 17:
	    output = "My sources say no";
	    break;
	case 18:
	    output = "Outlook not so good";
	    break;
	case 19:
	    output = "Very doubtful";
	    break;
	} // switch
	return output;
    } // getOutput

    /**
     * Prints the Eight Ball ASCII Art line by line.
     *
     * @throws FileNotFoundException if <code>file</code> is missing. 
     */
    public void printBall() throws FileNotFoundException{
	File file = new File("resources/ball.txt");
	Scanner input = new Scanner(file);
	while(input.hasNextLine()) {
	    String line = input.nextLine();
	    System.out.println(line);
	} // while
    } // printBall
    
} // EightBall
