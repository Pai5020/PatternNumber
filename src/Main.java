public class Main {
    public static void main(String[] args) {
        int N = 4;
        int count = 1;
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + "   ");
            }
            System.out.println();
        }



    }
}