/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * 
 * This use case extends UC5 by implementing a modular approach to generate each letter's pattern through dedicated methods.This enhances code reusability and maintainability by seperating pattern generation logic from the main display logic.
 * 
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp{
    public static String[] getOPattern() {
        return new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***  "
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            "   ******",
            " **      ",
            "**       ",
            "  **     ",
            "    ***  ",
            "       ** ",
            "        **",
            "       ** ",
            "******    "
        };
    }
    public static void main(String[] args) {
        String[] OPattern = getOPattern();
        String[] PPattern = getPPattern();
        String[] SPattern = getSPattern();
        for (int i = 0; i < OPattern.length; i++) {
            System.out.println(OPattern[i] + "   " + OPattern[i] + "   " + PPattern[i] + "   " + SPattern[i]);
        }  
    }
}
