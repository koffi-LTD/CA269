import java.util.Scanner;
public class Word{
	public static String showLetters(String word, String sub){
		String result = "";
		//If letter matches any index, insert letter at that index or just '_'
		for (int i=0;i < word.length(); i++ ) {
			if (contains(sub, word.charAt(i))) {
				result+= word.substring(i, i+1);
			}

			else {
				result+='_';
			}
		}
		return result;
	}

    // generate the alphabet
    static String getAlphabet()
    {
        String alphabet = "";
        for(int i = 0; i < 26; i++)
            alphabet += (char) ('a' + i);
            
        return alphabet;
    }
    
    static boolean contains(String word, char let)
    {
        for(int i = 0; i < word.length(); i++)
            if(word.charAt(i) == let)
                return true;
        return false;
    }
    
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = getAlphabet();
        System.out.println("Enter a word:");
        String word = input.next();
        String guesses = "";    // Start with no guesses

        // 1. try every second letter in the alphabet
        for(int i = 0; i < alphabet.length(); i += 2)
            if(contains(word, alphabet.charAt(i)))
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println(Word.showLetters(word, guesses));
            }
            
        // 2. Try the same thing backwards
        guesses = ""; // reset guesses
        for(int i = alphabet.length() - 1; i >= 0; i -= 2)
            if(contains(word, alphabet.charAt(i)))
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println(Word.showLetters(word, guesses));
            }

        // 3. try no guesses (i.e. empty string)
        System.out.println(Word.showLetters(word, ""));

        // 4. all letters 
        for(int i = 0; i < alphabet.length(); i++)
            if(contains(word, alphabet.charAt(i)))
                guesses += alphabet.charAt(i); // Try this letter

        System.out.println(Word.showLetters(word, guesses));
    }
}
