public class PrimeNumber {
    public static void main(String[] args) {
        int n = 191;

        boolean flag = true;

        if(n==0 || n==1) System.out.println("Prime");
        else {
            for(int i=2; i<Math.sqrt(n); i++) {
                if(n%i == 0) {
                    System.out.println("not Prime");
                    flag = false;
                    break;
                }
            }

            if(flag) System.out.println("Prime");
        }
    }
}
