/**
 * OOPSBannerApp
 *
 * Goal: UC3 - Display "OOPS" in Banner Format using String.join()
 *
 * Refactored to avoid inefficient string concatenation.
 *
 * @author Mahadevan
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join(" ",
                "*****",
                "*****",
                "*****",
                "*****");

        String line2 = String.join(" ",
                "*   *",
                "*   *",
                "*   *",
                "*   *");

        String line3 = String.join(" ",
                "*   *",
                "*   *",
                "*   *",
                "*   *");

        String line4 = String.join(" ",
                "*****",
                "*****",
                "*****",
                "*****");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}
