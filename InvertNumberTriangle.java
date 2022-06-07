public class InvertNumberTriangle {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n){
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
}
