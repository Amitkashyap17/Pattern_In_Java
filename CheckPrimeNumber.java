public class CheckPrimeNumber {
    public static void main(String[] args) {
        //(5);
        System.out.println(primeNumber(67));
        prime(11);
    }
    static String primeNumber(int n){

        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return "Not prime";
            }
        }
        return "Prime";
    }

    static void prime(int x){
        int count=0;
        for (int i = 1; i <=x ; i++) {
            if (x%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
