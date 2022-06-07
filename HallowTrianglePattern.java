public class HallowTrianglePattern {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        int m=-1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=0; k<m; k++){
                System.out.print(" ");
            }
            m+=2;
            String s=i>0?"*":"";
            System.out.print(s);

            System.out.println();
        }
        for (int i = 0; i <=2*n; i++) {
            System.out.print("*");
        }
    }
}