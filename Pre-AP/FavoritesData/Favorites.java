public class Favorites
{
    public static void main(String[] args)
    {
        int loop; //Initiates variable needed for the loop "function"
        loop = 1; 
        int favoriteNumber = 3;
        int favoriteDayMonth = 21;//My favorite day of every month
        int favoriteMonitorCount = 4;//My preferntial numver of computer monitors
        double favoriteDecimal = 1.337;//My favorite decimal number 
        double favoriteTemperature = 64.9;//My favorite temperature
        String favoriteLetter = "Z";
        char favoriteLetter2 = 'E';
        char favoriteLetter3 = 'S';
        char favoriteLetter4 = 'A';
        char favoriteLetter5 = 'D';
        char favoriteUnicode = '\u0394'; //Unicode for the Greek letter Delta
        boolean favoriteColorPurple = true;
        boolean favoriteColorBlue = false;
        String favoriteWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
        String favoriteOS = "Windows 98";
        
        while (loop <= 1) //Potential for looping if needed in a future version, perhaps with user input that changes the values if they wish.
        {
            System.out.println("\tThese are some of my favorite things:");
            System.out.println("My favorite number is " + favoriteNumber + " (Integer).");
            System.out.println("My favorite day of every month is " + favoriteDayMonth + " (Integer).");
            System.out.println("My preferntial number of computer monitors is " + favoriteMonitorCount + " (Integer).");
            System.out.println("My favorite decimal number is " + favoriteDecimal + " (Double).");
            System.out.println("My favorite temperature is " + favoriteTemperature + " degrees Fahrenheit (Double).");
            if (Character.isLetter(favoriteLetter.charAt(0))){ //Checks if the char favoriteLetter is a letter
               System.out.println("My favorite letter is " + favoriteLetter + " (Boolean = ture).");
            }
            else {
                System.out.println("My favorite letter is not valid :(Boolean = false.");
            };
            if (favoriteColorPurple == true) {
                System.out.println("Purple is my favorite color (Boolean = true)!");
            }
            else {
                System.out.println("Purple is not my favorite color.");
            };
            if (favoriteColorBlue == false) {
                System.out.println("Blue is not my favorite color (Boolean = false).");
            }
            else {
                System.out.println("Blue is my favorite color!");
            };
            System.out.println("I also like the letters " + favoriteLetter2 + ", " + favoriteLetter3 + ", and " + favoriteLetter5 + " (3 Characters).");
            System.out.println("Oh and " + favoriteLetter4 + " is pretty cool too I guess (Character).");
            System.out.println("My favorite unicode character is " + favoriteUnicode + " (Character).");
            System.out.println("My favorite english word is " + favoriteWord + " (String).");
            System.out.println("My favorite operating system is " + favoriteOS + " (String)."); 
            loop++; //Increases the variable "loop" by one.
        }
    }
}