package com.ktane.module;

import com.ktane.Bomb;

import java.io.Console;
import java.util.*;

public class Morse extends Mod {
    private String word;
    private Float frequency;
    public static List<String> identifiers = Arrays.asList("shell", "halls", "slick", "trick", "boxes", "leaks",
            "strobe", "bistro", "flick", "bomb", "breaks", "brick", "steal", "sting", "vector", "beats");
    public static Map<String, String> morse = new HashMap<String, String>() {{
        put("A", "A");}};
    public Morse(String name, Integer label, Bomb bomb) {
        super(name, label, bomb);
    }

    private boolean isInIdentifiers(String word) {
       for (String s: identifiers) {
           if (s.contains(word))
               return true;
       }
       return false;
    }

    /**
     * @param letters the letters to match
     *
     * @return the matching word ONLY if this is the only possible combination.
     */
    private boolean contains(String letters) {
        if (Collections.frequency(identifiers, letters) != 1)
            return false;
        boolean found = false;
        int i = 0;
        while (!found && i<identifiers.size()) {
            if (identifiers.get(i).contains(letters)) {
                found = true;
            }
            i++;
        }
        return found;
    }

    /**
     * Reads the morse code and translate it.
     *
     * @return the translated word from the morse code.
     */
    public String readMorse() {
        String word = "";
        String decrypted = ";";
        String finalWord, tmp;
        int it = 0;
        boolean found = false;
        Console console = System.console();
        while(!found) {
            tmp = console.readLine();
            if (morse.containsValue(tmp)) {
                decrypted += (morse.get(tmp));
                word += decrypted;
                it++;
                found = true;
            }
        }
        return word;
    }

    public String decrypt(String letter){
        return morse.get(letter);
    }

    // TODO
    public String solve() {

        return "";
    }
}
