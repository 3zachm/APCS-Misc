public class Interview
{
    public static void main(String[] args) 
    {
        String userName; 
        double temperature; // used to keep track of persons preferable temperature
        int gAnswer; // answer given by the user to math equation formed later 
        String lLanguage; // what language the user would like to learn
        String kLanguage; // what language the user knows
        Scanner in = new Scanner(System.in);
        int fail = 0; // failure to follow instructions that were catchable (no use of try/catch though)
        System.out.println("Hello, welcome to our research project.\nPlease state your first name.");
        userName = in.nextLine();
        if (userName.length()>10) // checks length of the name for comparison without the use of an integer
        {
            System.out.println("Your name is " + userName.length() + " characters long. Wow... that's a long name");
        }
        else if (userName.length()<4)
        {
            System.out.println("Your name is " + userName.length() + " characters long. Shorter than average.");
        }
        else
        {
            System.out.println("Your name is " + userName.length() + " characters long. Nothing out of the ordinary.");
        }
        System.out.println("Anyways " + userName + ", could you tell tell me your favorite temperature (Celsius) to any decimal place you'd like?\nOh also I'd like it if you didn't have any trailing zeros please :)\nOtherwise I may be incorrect :(");
        temperature = in.nextDouble();
        in.nextLine();
        /* The following converts the double to a string, then to two integers using length and index
         * Only works with OSs or regions that use . as a decimal separator
         */
        String sTemp = Double.toString(Math.abs(temperature)); 
        int integerCount = sTemp.indexOf('.'); 
        int decimalCount = sTemp.length() - integerCount - 1;
        //System.out.println(integerCount); 
        //System.out.println(decimalCount); 
        double mTemp = temperature - Math.random(); // creating a "random" preferntial temperature for the interviewer
        if (decimalCount > 4) {
            System.out.println("I see you like your temperatures very specific " + userName);
        }
        else
        {
            System.out.println("Hmm, " + temperature + " is pretty nice, but I personally like " + mTemp + " :P");
        }
        int cAnswer = 10 - integerCount; // utilizes integerCount left over from string conversion
        System.out.println("Uhh... I guess we can also test your basic grasp on math. What is 10 - " + integerCount + "?");
        gAnswer = in.nextInt();
        in.nextLine();
        if (gAnswer != cAnswer) 
        {
            System.out.println("....the correct answer was " + cAnswer + ". Aaaanyways...");
            ++fail;
        }
        else
        {
            System.out.println("Nicely done, " + cAnswer + " was indeed correct.");
        }
        System.out.println("Can you speak or are learning a second language? (Y/N)");
        String sLanguage = in.nextLine();
        if (sLanguage.equalsIgnoreCase("Yes") || sLanguage.equalsIgnoreCase("Y"))
        {
            System.out.println("Which one is your best, besides English?");
            kLanguage = in.nextLine();
            if (kLanguage.equalsIgnoreCase("Japanese")) // the unicode characters seem to work in BlueJay, yet they do not work in CMD. So I've put a romanized version underneath it 
            {
                System.out.println("\u305d\u3067\u3059\u306d\u304b\uff1f\u3042\u308a\u304c\u3068\u3046\u3054\u3056\u3044\u307e\u3057\u305f\nSo desu ka? Arigatou gozaimashita");  // convert to ASCII codes (see sticky)
            }
            else if (kLanguage.equalsIgnoreCase("French"))
            {
                System.out.println("C'est vrais n'est-pas? Merci beaucoup.");
            }
            else if (kLanguage.equalsIgnoreCase("English"))
            {
                System.out.println("I told you not to put English :/ Oh well.");
                ++fail;
            }
            else
            {
                System.out.println("Wow " + kLanguage + "'s a cool one, I haven't learned it myself.");
            }
        }
        else if (sLanguage.equalsIgnoreCase("No") || sLanguage.equalsIgnoreCase("N"))
        {
            System.out.println("If you had to, which language would you choose?");
            lLanguage = in.nextLine();
            if (lLanguage.equalsIgnoreCase("Japanese")) 
            {
                System.out.println("First I'd recommend you learn all the Hiragana and Katakana characters!\nThey are important for proper reading as romanization doesn't always work well ^-^ ");
            }
            else if (lLanguage.equalsIgnoreCase("French"))
            {
                System.out.println("C'est bon! (That means 'that's great!' ^-^)");
            }
            else if (lLanguage.equalsIgnoreCase("English"))
            {
                System.out.println("You must learn quickly if you've been able to communicate so far -_-");
                ++fail;
            }
            else
            {
                System.out.println("I haven't learned " + lLanguage + " yet, so I can't get you started .-.");
            }
        }
        else
        {
            System.out.println("You should've answered with yes or no, not " + sLanguage + " ._.");
            fail++;

        }
        if (fail > 0) // checks if instructions were followed improperly at any point in the "interview."
        {
            System.out.println("Sadly you did not pass the interview, " + userName + ", but you can try again if you want!\nThanks for answering.");
        }
        else
        {
            System.out.println("Alright " + userName + ", you've passed! We'll see you on the other side sometime soon.\nThanks for cooperating successfully :)");
        }
        in.close();
    }
}
