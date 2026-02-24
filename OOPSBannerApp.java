import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 * Combined UC1 → UC7
 * @author Monish
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC1 → Simple Output
        System.out.println("Printing OOPS normally:");
        System.out.println("OOPS\n");

        // UC7 → Map based Banner System
        Map<Character, String[]> map = new HashMap<>();

        // Letter O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Letter P
        String[] P = {
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };

        // Letter S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Store patterns in Map
        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        // Create Banner Object (UC6 OOPS)
        Banner banner = new Banner(map);

        // Display Banner
        System.out.println("\nOOPS Banner:\n");
        banner.display("OOPS");
    }
}