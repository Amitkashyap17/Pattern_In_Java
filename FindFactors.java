public class FindFactors {
    public static void main(String[] args) {
        factors(12);
    }
    static void factors(int n){
        int count = 0;
        for (int i = 1; i <=n ; i++) {

            if (n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }
}
