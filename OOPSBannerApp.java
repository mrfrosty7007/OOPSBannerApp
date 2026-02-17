public class OOPSBannerApp {

    static String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
    };

    static String[] P = {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
    };

    static String[] S = {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
    };

    static void printBanner() {

        for (int i = 0; i < 5; i++) {
            System.out.println(O[i] + " " + O[i] + " " + P[i] + " " + S[i]);
        }

    }

    public static void main(String[] args) {

        printBanner();

    }
}
