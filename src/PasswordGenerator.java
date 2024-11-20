import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    static String alphabet = "";
    Random rand = new Random();
    LanguageManager languageManager = new LanguageManager();

    private String generate(int length, String alphabet, boolean useUppercase) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            password.append(rand.nextBoolean() && useUppercase ? Character.toString(c).toUpperCase() : c);
        }
        return password.toString();
    }


    public String generate() {
        return generate(16, languageManager.getAlphabet(1), true);
    }

    public String generate(int length, int numberOfLangs, boolean useSpecialChars, boolean useUpperCase) {
        alphabet = languageManager.getAlphabet(numberOfLangs);
        alphabet = useSpecialChars ? alphabet + LanguageManager.specialChars : alphabet;
        return generate(length, alphabet, useUpperCase);
    }

    public String generate(int length, int numberOfLangs, boolean useSpecialChars, boolean useUpperCase, Integer... requiredDigits) {
        alphabet = languageManager.getAlphabet(numberOfLangs);
        alphabet = useSpecialChars ? alphabet + LanguageManager.specialChars : alphabet;
        alphabet += Utils.integersToString(requiredDigits);
        return generate(length, alphabet, useUpperCase);
    }

    public String generate(int length, int numberOfLangs, boolean useSpecialChars, boolean useUpperCase, List<Integer> requiredDigits) {
        alphabet = languageManager.getAlphabet(numberOfLangs);
        alphabet = useSpecialChars ? alphabet + LanguageManager.specialChars : alphabet;
        alphabet += Utils.integersToString(requiredDigits);
        return generate(length, alphabet, useUpperCase);
    }

}
