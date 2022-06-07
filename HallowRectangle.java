public class HallowRectangle {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=n ; i++){
            System.out.print("*");
            String s=i==1|| i==n?"*":" ";
            for (int j = 1; j <3*n ; j++) {
                System.out.print(s);
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
