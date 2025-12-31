public class towerofhanoi {
    public static void printTower(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            return;
        }

        printTower(n - 1, source, dest, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        printTower(n - 1, helper, source, dest);

    }

    public static void main(String[] args) {
        int n = 4;
        printTower(n, "S", "H", "D");
    }
}
