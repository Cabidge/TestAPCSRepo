public class Demo {
    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            n = 5;
        }

        printLoop(n);
    }

    public static void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}