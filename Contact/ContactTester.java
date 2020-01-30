public class ContactTester {
    public static void main(String[]args) {
        Contact c[] = new Contact[]{
            new Contact("Bob", "818-542-4958", "bob@bobmail.us"),
            new Contact("Jack", "818-696-6666", "jack@gmail.scam"),
            new Contact("Connor", "213-POG-CHAMP", "connor@twitch.tv"),
            new Contact(),
            new Contact("Support", "800-888-8888", "notreal@yes.com"),
            new Contact("Bank", "800-THE-BANK", "help@thebank.com"),
        };
        System.out.println("PRINTING FOWARDS\n");
        String outf = "Your contacts:\n";
        for (int i = 0; i < c.length; i++) {
            outf += c[i] + ", \n";
        }
        System.out.println(outf);
        System.out.println("\nPRINTING BACKWARDS\n");
        String outb = "Your contacts:\n";
        int x = c.length - 1;
        while (x > 0) {
            outb += c[x] + ", \n";
            x--;
        }
        System.out.println(outb);
        System.out.println("\nPRINTING FOURTH CONTACT\n");
        System.out.println(c[4-1]);
        System.out.println("\nDELETING (OVERWRITING) 2ND CONTACT AND CONDENSING\n");
        for (int i = 2-1; i < c.length; i++) {
            if (i + 1 < c.length){
                c[i] = c[i+1];
            }
            else {
                c[i] = null;
            }
        }
        String outf2 = "Your contacts:\n";
        for (int i = 0; i < c.length; i++) {
            outf2 += c[i] + ", \n"; // if else null
        }
        System.out.println(outf2);
        System.out.println("\nPRINTING EMAIL OF 3RD CONTACT\n");

    }
}