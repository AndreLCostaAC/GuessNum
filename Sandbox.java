package GuessGame;

import javax.sound.midi.Soundbank;

public class Sandbox {

    public static void main(String[] args) {

        Computer pc = new Computer();

        Player playerOne = new Player();

        pc.getEndNumber();
        playerOne.getEndNumber();

        int pcGuess = pc.randomNumber(0, 10);
        int playerGuess = playerOne.randomNumber(0, 10);
        
        System.out.println("PC Guess: " + pcGuess);

        while(pcGuess != playerGuess) {
            playerGuess = playerOne.randomNumber(0, 10);
            System.out.println("PlayerOne: " + playerGuess);
        }

        System.out.println("You won");


    }


}
