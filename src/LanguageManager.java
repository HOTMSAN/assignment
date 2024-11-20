import java.util.List;

public class LanguageManager {
    List<String> languages = LanguagesDataBase.languages;
    static String specialChars = "!@#$^&*()-=_+/.,[]{}|`~";

    public void addLanguage(String lang) {
        languages.add(lang);
    }

    public String getAlphabet(int numberOfLangs) {
        if (numberOfLangs > languages.size()) {
            System.out.println("Number of languages is too high");
            throw new ArrayIndexOutOfBoundsException();
        }
        String alphabet = "";
        for (int i = 0; i < numberOfLangs; i++) {
            alphabet += languages.get(i);
        }
        return alphabet;
    }
}
