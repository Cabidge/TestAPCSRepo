public class Demo {
    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            n = 5;
        }

        printLoop(n);

        int[] a = {1};
        int[] b = {1, 3};
        int[] c = {};
        int[] d = {4, 5, 6};
        int[] e = {7, 7, 7, 7};

        int[][] x = {a,b,c,d,e};

        System.out.println(arrayDeepToString(x).replace("},","},\n"));
    }

    public static void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // A
    public static String arrToString(int[] arr) {
        if (arr.length == 0) return "{}";

        String out = "{" + arr[0];
        for (int i = 1; i < arr.length; i++) {
          out += ", "+ arr[i];
        }
        out += "}";
        
        return out;
    }

    public static String arrayDeepToString(int[][] arr) {
        if (arr.length == 0) return "{}";

        String out = "{" + arrToString(arr[0]);
        for (int i = 1; i < arr.length; i++) {
          out += ", "+ arrToString(arr[i]);
        }
        out += "}";
        
        return out;
    }
}