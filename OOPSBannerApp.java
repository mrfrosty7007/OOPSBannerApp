import java.util.*;

class CharacterPattern {

    String[] pattern;

    CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }
}

public class OOPSBannerApp {

    static Map<Character, CharacterPattern> patterns = new HashMap<>();

    static {

        patterns.put('O', new CharacterPattern(new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patterns.put('P', new CharacterPattern(new String[] {
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patterns.put('S', new CharacterPattern(new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

    }

    static void printBanner(String text) {

        for (int row = 0; row < 5; row++) {

            for (char c : text.toCharArray()) {

                System.out.print(patterns.get(c).pattern[row] + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        printBanner("OOPS");

    }
}
