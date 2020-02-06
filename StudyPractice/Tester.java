public class Tester {
    public static void main(String[] args) {
        MultPractice p1 = new MultPractice(10, 15);
        MultPractice p2 = new MultPractice(12, 8);

        System.out.println("--------Testing P1--------");
        listProblems(p1, 5);
        System.out.println("--------Testing P2--------");
        listProblems(p2, 5);
    }

    public static void listProblems(MultPractice problem, int y) {
        for (int x = 0; x < y; x++) {
            System.out.println(problem.getProblem());
            problem.nextProblem();
        }
    }
}