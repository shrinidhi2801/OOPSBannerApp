/**
 * OOPSBannerApp UC3 - Banner Display Application (Use Case 3)
 * 
 * This use case extends UC4 by defining and populating the String arrat in a more concise way at the time of declaration using String.join() method to create each line o fthe banner.This further enhances code readability and maintainability.
 * 
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp{
    public static void main(String[] args) {
        String[] lines = {
        String.join(" ","   ***   ","   ***   ","******   ","   ******"),
        String.join(" "," **   ** "," **   ** ","**    ** "," **      "),
        String.join(" ","**     **","**     **","**     **","**       "),
        String.join(" ","**     **","**     **","**    ** "," **      "),
        String.join(" ","**     **","**     **","******   ","   ***   "),
        String.join(" ","**     **","**     **","**       ","      ** "),
        String.join(" ","**     **","**     **","**       ","       **"),
        String.join(" "," **   ** "," **   ** ","**       ","      ** "),
        String.join(" ","   ***   ","   ***   ","**       ","******   ") };
        for (String line : lines){
            System.out.println(line);
        }  
    }
}
