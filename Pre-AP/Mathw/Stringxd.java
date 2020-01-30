public class Stringxd {
    public static void main(String[]args){
        String oldSeq = "110111111";
        String newSeq = "";
        String segment = "01";

        newSeq = oldSeq.substring(oldSeq.indexOf(segment)+(segment.length()),(oldSeq.length()));
        System.out.println("The original sequence: " + oldSeq);
        System.out.println("\nThe new sequence: " + newSeq);
    }
}