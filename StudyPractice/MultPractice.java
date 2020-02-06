public class MultPractice implements StudyPractice {
    private int num1;
    private int num2;

    public MultPractice(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getProblem() {
        return num1 + " TIMES " + num2;
    }

    public void nextProblem() {
        num2++;
    }
}