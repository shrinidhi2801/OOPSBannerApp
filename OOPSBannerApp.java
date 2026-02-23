/**
 * OOPSBannerApp UC3 - Banner Display Application (Use Case 3)
 * 
 * This class demonstrates the functionality of Use Case 2 by improving the way "OOPS" banner is constructed and displayed.It focuses on endanding code readability and efficiency by uttilizing the String.join() method to create each line of the banner. This approach overcomes the drawbacks of using the + operator for string concatenation, which can lead code inefficiency due to the creation of multiple intermediate Strings object in memory.
 *  
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp{
    public static void main(String[] args) {
        String[] lines = new String[9];
        lines[0] = String.join(" ","   ***   ","   ***   ","******   ","   ******");
        lines[1] = String.join(" "," **   ** "," **   ** ","**    ** "," **      ");
        lines[2] = String.join(" ","**     **","**     **","**     **","**       ");
        lines[3] = String.join(" ","**     **","**     **","**    ** "," **      ");
        lines[4] = String.join(" ","**     **","**     **","******   ","   ***   ");
        lines[5] = String.join(" ","**     **","**     **","**       ","      ** ");
        lines[6] = String.join(" ","**     **","**     **","**       ","       **");
        lines[7] = String.join(" "," **   ** "," **   ** ","**       ","      ** ");
        lines[8] = String.join(" ","   ***   ","   ***   ","**       ","******   ");
        
        for (String line : lines){
            System.out.println(line);
        }  
    }
}
