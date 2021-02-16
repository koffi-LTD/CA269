// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);
        Strin guesses = "";
        System.out.println("The word is");
        String res = Word.showLetters(word, guesses);
        System.out.println(res);
        String n = in.nextLine();

        // Now you have the word ... encourage the user to guess.
        boolean done = Word.allDone(word, guesses);
        // if word not found continue
        while(!done){
            String user_guess = in.nextLine()
            guesses += user_guess;
            String result =  Word.showLetters(word, guesses);

            System.out.println("Guess a letter:");
            System.out.println(result);

            done = Word.allDone(word, guesses);      
        }
        System.out.println("Well done, the word was "+ word + ".");
    }
}