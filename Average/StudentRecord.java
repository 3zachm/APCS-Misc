public class StudentRecord {
    private int[] scores;

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    private double average(int first, int last) {
        int length = last - first;
        double sum = 0;
        for (; first <= last; first++) {
            System.out.println("reached: " + first);
            if (scores.length <= first) {
            }
            else {
                sum += scores[first];
            }
        }
        return sum/(double)length;
    }

    private boolean hasImproved() {
        double last = 0;
        for (int next : scores) {
            if (next < last) {
                return false;
            }
            last = next;
        }
        return true;
    }

    public double finalAverage(){
        int index = 0;
        if (scores.length % 2 == 0) {
            index = scores.length / 2;
        }
        else {
            index = (scores.length / 2) + 1;
        }
        if (hasImproved()) {
            return average(index - 1, scores.length); 
        }
        else {
            return average(0, scores.length);
        }
    }

    public String toString() {
        return "";
    }
} 