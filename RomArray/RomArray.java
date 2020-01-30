import java.util.Scanner;
public class RomArray {
    public static void main(String[] args) {
        int x = 0;
        Scanner id = new Scanner(System.in);
        System.out.println("Publishers stored in an array based on their ID in the GameBoy ROM header, skipping blank IDs.");
        String allLicensee [] = new String[]{
            "None or N/A", "Nintendo R&D1", "", "", "", "", "", "Capcom",  "", "", "", "",
            "Electronic Arts", "", "", "", "", "Hudson Soft", "b-ai",
            "kss", "", "pow", "", "PCM Complete", 
            "san-x", "", "", "Kemco Japan", "seta", 
            "Viacom", "Nintendo", "Bandai", 
            "Ocean/Acclaim", "Konami", "Hector", "", 
            "Taito", "Hudson", "Banpresto", "", 
            "Ubi Soft", "Atlus", "", "Malibu", "", 
            "angel", "", "Bullet-Proof", "", "irem", 
            "Absolute", "Acclaim", "Activision", 
            "American sammy", "Konami", "Hi tech entertainment", 
            "LJN", "Matchbox", "Mattel", 
            "Milton Bradley", "Titus", "Virgin", "", "", 
            "LucasArts", "", "", "Ocean", "", "Electronic Arts", 
            "Infogrames", "Interplay", "Broderbund", 
            "sculptured", "", "sci", "", "", "THQ", 
            "Accolade", "misawa", "", "", "lozc", "", "", 
            "tokuma shoten i*", "tsukuda ori*", "", "", "", "Chunsoft", 
            "Video system", "Ocean/Acclaim", "", "Varie", 
            "Yonezawa/s'pal", "Kaneko", "", "Pack in soft", 
            "Konami (Yu-Gi-Oh!)"
        };
        listArray(allLicensee);
        while (x < 1 ) {
            System.out.println("\nEnter an ID:");
            int in = id.nextInt();
            id.nextLine();
            returnL(allLicensee, in);
        }
    }
    public static void returnL(String[]array, int id) {
        if (array[id].equals("")) {
            System.out.println("The given ID is blank :(");
        }
        else {
            System.out.println("This ID refers to the publisher " + array[id]);
        }
    }
    public static void listArray(String list[]) {
        String out = "\n";
        String temp = "";
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            temp = list[i];
            if (!(temp.equals(""))) {
                if (count % 3 == 0) {
                    out += temp + ", \n";
                } 
                else { 
                    out += temp + ", ";
                }
                count++;
            }
        }
        System.out.println("The header includes: " + out);
    }
}