public class NextArrows {
    public static void main(String[] args) {
        pattern5(3);
        pattern6(3);
    }

    static void pattern5(int n){
        for (int i = 1; i <2*n ; i++) {
            int tcols = i>n ? 2*n-i : i;
            for (int j = 1; j<=tcols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
