public class InvertTriangle {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=n-i ; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <=n-i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
