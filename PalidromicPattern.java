public class PalidromicPattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            int num =i;
            for (int k =1; k <=i ; k++) {
                System.out.print(num);
                num--;
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
