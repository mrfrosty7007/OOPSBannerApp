/**
 * OOPSBannerApp
 *
 * Goal: UC4 - Display "OOPS" banner using String Array and Loop
 *
 * Refactored for modularity and reusability.
 *
 * @author Mahadevan
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("   ", "*****", "*****", "*****", "*****"),
                String.join("   ", "*   *", "*   *", "*   *", "*   *"),
                String.join("   ", "*   *", "*   *", "*   *", "*   *"),
                String.join("   ", "*****", "*****", "*****", "*****")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
